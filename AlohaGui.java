import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Aloha extends JFrame implements ActionListener{

  JTextField text;
  JLabel resultLabel;

 	public static void main(String[] args){
 		Aloha aloha = new Aloha("Gui");
   	aloha.setVisible(true);
 	}
  Aloha(String title){

   		  setTitle(title);
       	setSize(1000,500);
      	setLocation(500,500);
       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JLabel titleLabel = new JLabel("何か文字入力してから、OKボタンをクリックしてください");
         titleLabel.setFont(titleLabel.getFont().deriveFont(18.0f));

         JPanel top = new JPanel();
         top.setLayout(new GridLayout(2,1));
         top.add(titleLabel);


         JPanel center = new JPanel();
         center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));

         //------------------inputs------------------------//

         // input panel
         JPanel inputs = new JPanel();
         inputs.setLayout(new FlowLayout(FlowLayout.LEADING));
         inputs.setMaximumSize( new Dimension(Integer.MAX_VALUE, 40) );
         center.add(inputs);

         text = new JTextField("");
         text.setPreferredSize( new Dimension( 200, 40 ));
         inputs.add(text);


         JButton btn = new JButton("OK");
         btn.addActionListener(this);
         inputs.add(btn);


         //-------------------inputs end------------------------

         //------------------result------------------------
         JPanel result = new JPanel();
         result.setLayout(new FlowLayout(FlowLayout.LEADING));
         center.add(result);

         resultLabel = new JLabel("");
         resultLabel.setFont(resultLabel.getFont().deriveFont(20.0f));
         result.add(resultLabel);
         //---------------------result end----------------------------------

         Container cp = getContentPane();
         cp.add(top,BorderLayout.PAGE_START);
         cp.add(center,BorderLayout.CENTER);


   	}

    public void actionPerformed(ActionEvent event) {

      String t = text.getText();
      resultLabel.setText(t);
    }


 }
