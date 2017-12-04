// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

public class TestGui extends JFrame{
	TestGui(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField jtf = new JTextField("",20);

		JPanel panel = new JPanel();

		panel.add(jtf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestGui tg = new TestGui("ようこそ");

		tg.setVisible(true);
	}
}

