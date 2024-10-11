import javax.swing.JOptionPane;

public class gui_application {
    public static void main(String[]args){

        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name+"!");

        int age = JOptionPane.showInputDialog("Enter your Age: ");


    }
}
