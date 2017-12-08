import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPasswordField;


public class TestJPasswordField extends JFrame{
	TestJPasswordField(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));

		JLabel lb1 = new JLabel("mail");
		JLabel lbl2 = new JLabel("password");
   
   		JTextField jtf = new JTextField("",20);
   		
     	JPasswordField jpf = new JPasswordField("",10);
     	panel.add(lb1);
        panel.add(jtf);
        panel.add(lbl2);
   		panel.add(jpf);
   
   		Container cp = getContentPane();
   		cp.add(panel,BorderLayout.NORTH);
   	}
 



	public static  void main(String[] args){
		TestJPasswordField tpf = new TestJPasswordField("ようこそ");
		tpf.setVisible(true);
	}
}