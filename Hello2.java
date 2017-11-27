import javax.swing.JFrame;
public class Hello2 extends JFrame{
	Hello2(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(300,300);
		setDefaultCloseOperation)JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args){
		Hello2 h2 = new Hello2("Hello");
		setVisible(true);
		System.out.println("Hello");
	}
}