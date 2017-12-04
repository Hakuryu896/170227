import javax.swing.JFrame;
public class LageHello extends JFrame{
	LageHello(String title){
		setTitle(title);
		setSize(2000,2000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		LageHello lage = new LageHello("ようこそ");

		lage.setVisible(true);
	}
}

