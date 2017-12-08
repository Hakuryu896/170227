import javax.swing.*;
import java.awt.*;
import javax.swing.JCheckBox;

public class TestJCheckBox extends JFrame{
	TestJCheckBox(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JCheckBox check1 = new JCheckBox("Linux");
		JCheckBox check2 = new JCheckBox("macos");
		JCheckBox check3 = new JCheckBox("Android");
  
     	panel.add(check1);
        panel.add(check2);
        panel.add(check3);
   		

   		Container cp = getContentPane();
   		cp.add(panel,BorderLayout.NORTH);
   	}

	public static  void main(String[] args){
		TestJCheckBox tjk = new TestJCheckBox("ようこそ");
		tjk.setVisible(true);
	}
}