import javax.swing.*;
  import java.awt.*;
  
  public class Matigai extends JFrame{
  Matigai(String title){
  	setTitle(title);
  	setBounds(222,222,222,222);
  	setDefaultCloseOperation(EXIT_ON_CLOSE);//JFrame入ってない //それいいれても動かなかったゾ//majika　//MJD
  
      JPanel pl = new JPanel();
  
      JCheckBox ck = new JCheckBox("kkk");
      JCheckBox ck2 = new JCheckBox("ttt");
      JCheckBox ck3 = new JCheckBox("rrr");
  
      pl.add(ck);
      pl.add(ck2);
      pl.add(ck3);
  
      Container cp = getContentPane();
      cp.add(pl,BorderLayout.SOUTH);
  
  }
  
  
  
  	public static void main(String[] args){
  		Matigai hello = new Matigai("jjjj");
  		hello.setVisible(true);
  	}
  }