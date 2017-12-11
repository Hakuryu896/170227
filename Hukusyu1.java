import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Hukusyu1 extends JFrame{
	Hukusyu1(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));

		JLabel label = new JLabel("mail");
		JLabel label2 = new JLabel("Password");

		JPasswordField jpf = new JPasswordField("",10);
		JTextField jtf = new JTextField("",10);

		panel.add(label);
		panel.add(jtf);
		panel.add(label2);
		panel.add(jpf);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		Hukusyu1 test = new Hukusyu1("Test");

		test.setVisible(true);
	}
}