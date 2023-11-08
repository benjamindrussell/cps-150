import javax.swing.JOptionPane;

public class DialogEcho {
   public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("What is your name?");
       JOptionPane.showMessageDialog(null, name);     System.out.println(name);
   } // end main method
}     
