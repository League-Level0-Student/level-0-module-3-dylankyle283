import javax.swing.JOptionPane;

public class happy {
public static void main(String[] args) {
	
String HappyCheck = JOptionPane.showInputDialog("are you happy");

if (HappyCheck.equals("yes")){
	JOptionPane.showMessageDialog(null, "keep doing what your doing");
}
if (HappyCheck.equals("no")) {
	String choice = JOptionPane.showInputDialog("do you want to be happy");

if (choice.equals("no")) {
	JOptionPane.showMessageDialog(null, "keep doing what your doing");
}
if(choice.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Change something");
}
}
}
}
