import javax.swing.JFrame;
import javax.swing.JButton;
public class Test1 extends JFrame{
	Test1(String title){
		setTitle(title);
		setSize(200,300);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		Test1 test1 = new Test1("１ようこそ");

		test1.setVisible(true);
	}

	}
}