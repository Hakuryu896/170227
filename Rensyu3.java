import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFrame;
// import java.awt.event.Container;
// import java.awt.event.cotionEvent;

public class Rensyu3 extends JFrame{
	//implements ActionListener{
	// private String data;

	
	Rensyu3(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JFrame frame = new JFrame("ようこそ");

		// JPanel panel = new JPanel();

		JButton btn = new JButton();

		// panel.add(btn);

		// add(btn,BorderLayout.SOUTH);
		}
		public static void main(String[] args){
		Rensyu3 ren3 = new Rensyu3("ようこそ");

		ren3.setVisible(true);
	}
}