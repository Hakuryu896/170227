import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test123 extends JFrame implements ActionListener{

	JCheckBox jcb1;

	JLabel label;
	public static void main(String[] args){
		Test123 test = new Test123("ようこそ");
		test.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(this.jcb1.isSelected()){
			this.label.setText(this.jcb1.getText()+"が選択されています。");
		}else{
			this.label.setText("何も選択されていません。");
		}
	}

	Test123(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		//panel1.setLayout(new GridLayout(1,1));

		this.jcb1 = new JCheckBox("納豆");
	

		this.label = new JLabel("食べ物");
		

		JButton btn = new JButton("btn");

		btn.addActionListener(this);

		panel1.add(label);
		panel1.add(jcb1);

		panel2.add(btn);

		Container cp = getContentPane();
		cp.add(panel1,BorderLayout.NORTH);
		cp.add(panel2,BorderLayout.SOUTH);
	}
}
		

