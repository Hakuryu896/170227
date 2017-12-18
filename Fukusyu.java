import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukusyu extends JFrame implements ActionListener{
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;
	private JLabel label;

	public void actionPerformed(ActionEvent e){
		Boolean kekka1 = this.rbtn1.isSelected();
		Boolean kekka2 = this.rbtn2.isSelected();
		Boolean kekka3 = this.rbtn3.isSelected();

		String msg ="";
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

	Fukusyu(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));

		JCheckBox ckb1 = new JCheckBox("食べ物");
		JCheckBox ckb2 = new JCheckBox("飲み物");
		JCheckBox ckb3 = new JCheckBox("おかし");

		panel.add(ckb1);
		panel.add(ckb2);
		panel.add(ckb3);

		this.rbtn1 = new JRadioButton("MAC");
		this.rbtn2 = new JRadioButton("Linux");
		this.rbtn3 = new JRadioButton("Windows");


		JButton btn = new JButton("ボタン");
		btn.addActionListener(this);
		ButtonGroup bgp = new ButtonGroup();

		bgp.add(rbtn1);
		bgp.add(rbtn2);
		bgp.add(rbtn3);

		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);

		JMenuBar menubar1 = new JMenuBar();
		

		JMenu menu1 = new JMenu("FILE");
		JMenu menu2 = new JMenu("Edit");
		JMenu menu3 = new JMenu("Help");

		JMenuItem item1 = new JMenuItem("new");
		JMenuItem item2 = new JMenuItem("open");
		JMenuItem item3 = new JMenuItem("close");

		JMenuItem item11 = new JMenuItem("cut");
		JMenuItem item22 = new JMenuItem("copy");
		JMenuItem item33 = new JMenuItem("paste");

		JMenuItem item111 = new JMenuItem("version");
		JMenuItem item222 = new JMenuItem("index");

		this.label = new JLabel("Labelだよ");

		setJMenuBar(menubar1);
		
		menubar1.add(menu1);
		menubar1.add(menu2);
		menubar1.add(menu3);

		menu1.add(item1);
		menu2.add(item2);
		menu3.add(item3);

		menu1.add(item11);
		menu2.add(item22);
		menu3.add(item33);

		menu1.add(item111);
		menu2.add(item22);
		panel.add(btn);

		panel.add(this.label);
		
		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
		// System.out.println("データを入力してください");

		// String test = new java.util.Scanner(System.in).nextLine();
	}
	public static void main(String[] args){
		Fukusyu fuku = new Fukusyu("ようこそ");

		fuku.setVisible(true);
	}
}