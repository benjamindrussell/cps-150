import javax.swing.JOptionPane;

public class Payroll {
    public static void main(String[] args) {
        String name;
        int hoursWorked;
        double payRate, federalRate, stateRate;
        double grossPay, federalTax, stateTax, totalDeduction, netPay;

        name = JOptionPane.showInputDialog("Enter Employee's name");
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("enter number of hours worked a week"));
        payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate"));
        federalRate = Double.parseDouble(JOptionPane.showInputDialog("Enter federal tax withholding rate"));
        stateRate = Double.parseDouble(JOptionPane.showInputDialog("Enter federal tax withholding rate"));

        grossPay = hoursWorked * payRate;
        federalTax = grossPay * (federalRate / 100);
        stateTax = grossPay * (stateRate / 100);
        totalDeduction = federalTax + stateTax;
        netPay = grossPay - totalDeduction;

        JOptionPane.showMessageDialog(null, "Employee Name: " + name + 
                                            "\nHours Worked: " + hoursWorked + 
                                            "\nPay Rate: $" + payRate + 
                                            "\nGross Pay: $" + grossPay + 
                                            "\nDeductions\n" + 
                                            "  Federal Witholding(" + federalRate + "%): $" + federalTax + 
                                            "\n  State Withholding(" + stateRate + "%): $" + stateTax + 
                                            "\n  Total Dediction: $" + totalDeduction + 
                                            "\nNet Pay: $" + netPay);

    }
}
