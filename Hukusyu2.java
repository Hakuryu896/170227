import javax.swing.*;
import java.awt.*;
public class Hukusyu2 extends JFrame{
	Hukusyu2(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JCheckBox c1 = new JCheckBox("Test1");
		JCheckBox c2 = new JCheckBox("Test2");
		JCheckBox c3 = new JCheckBox("Test3");

		panel.add(c1);
		panel.add(c2);
		panel.add(c3);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);

	}
	public static void main(String[] args){
		Hukusyu2 test2 = new Hukusyu2("Test2");

		test2.setVisible(true);
	}
}