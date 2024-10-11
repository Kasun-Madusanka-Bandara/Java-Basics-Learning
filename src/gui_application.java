import javax.swing.JOptionPane;

public class gui_application {
    public static void main(String[]args){

        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name+" !");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age: "));
        JOptionPane.showMessageDialog(null, "Your are "+age+" years old !");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height: "));
        JOptionPane.showMessageDialog(null, "Your are "+ height +" cm tall");

    }
}
