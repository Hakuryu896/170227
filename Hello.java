import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JPanel;
import java.awt.BorderLayout;
public class Hello extends JFrame{
  Hello(String title){
    setTitle(title);
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton btn = new JButton("Click Me!");
    
    JPanel panel = new JPanel();
    
    panel.add(btn);
    
    Container cp = getContentPane();
    cp.add(panel,BorderLayout.CENTER);
    }
    public static void main(String[] args){
    Hello hello = new Hello("ALOHA");
    	hello.setVisible(true);
    }
}
