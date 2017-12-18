import javax.swing.*;
import java.awt.*;

public class HelloMenu extends JFrame{

	HelloMenu(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		panel.add
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu menu = new JMenu("File");

		JMenuItem menuitem1 = new JMenuItem("開く");
		JMenuItem menuitem2 = new JMenuItem("閉じる");

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(menuitem1);
		menu.add(menuitem2);
	}
	public static void main(String[] args){
		HelloMenu test = new HelloMenu("Hello");
		test.setVisible(true);
	}
}