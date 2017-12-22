import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloJRadioButton extends JFrame implements ActionListener{
	private JLabel label;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;

	public static void main(String[] args){
		HelloJRadioButton test = new HelloJRadioButton("Hello");



		test.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		boolean kekka1 = this.rbtn1.isSelected();
		boolean kekka2 = this.rbtn2.isSelected();
		boolean kekka3 = this.rbtn3.isSelected();

		String msg = "";
		if(kekka1){
			msg = this.rbtn1.getText()+"が選択されています。";
			this.label.setText(msg);
		}
		if(kekka2){
			msg = this.rbtn2.getText()+"が選択されています。";
			this.label.setText(msg);
		}

		if(kekka3){
			msg = this.rbtn3.getText()+"が選択されています。";
			this.label.setText(msg);
		}
	}

		

	HelloJRadioButton(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		// JMenuBar menubar = new JMenuBar();

		// JMenu menu = new JMenu();

		// JMenuItem menuitem = new JMenuItem();

		
		



		panel.setLayout(new GridLayout(5,1));

		this.rbtn1 = new JRadioButton("max");
		this.rbtn2 = new JRadioButton("min");
		this.rbtn3 = new JRadioButton("average");

		ButtonGroup btngroup = new ButtonGroup();

		btngroup.add(this.rbtn1);
		btngroup.add(this.rbtn2);
		btngroup.add(this.rbtn3);


		JButton btn = new JButton("クリック");
		btn.addActionListener(this);

		this.label = new JLabel("Test");
		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);
		panel.add(btn);
		panel.add(this.label);



		// panel.add(btn,BorderLayout.NORTH);

		// panel.add(label,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}
}