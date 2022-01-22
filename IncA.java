import javax.swing.*;
import java.awt.*;
public class IncA
{
	
	
	public static void main(String[] args)
	{
		
		JLabel background;
		ImageIcon img = new ImageIcon("01_gettyimages_543217268_super_resized.jpg");
		Image jpg = img.getImage();
		Image temp_img = jpg.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_img);
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,750,550);
		
		Font f = new Font("Calibri",Font.BOLD,36);
		
	    JFrame IncAFrame=new JFrame("ATM");     //creating frame for work
		
		JLabel l_1 = new JLabel("THE AMOUNT ENTERED IS MORE THAN");
	    l_1.setBounds(80,160,700,90);
		l_1.setForeground(new Color(203,65,84));
		l_1.setFont(f);
	    background.add(l_1);
		
		
		JLabel l_2 = new JLabel("OR LESS THAN THE WITHDRAWL LIMIT");
	    l_2.setBounds(80,220,700,90);
		l_2.setForeground(new Color(203,65,84));
		l_2.setFont(f);
	    background.add(l_2);
		
		IncAFrame.setVisible(true);           //it will make frame visible
		
		
		IncAFrame.setSize(750,550);           //it will set dimension of frame
		
		
		IncAFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		IncAFrame.setLayout(null);
		
		IncAFrame.add(background);
	}
	
	
}	