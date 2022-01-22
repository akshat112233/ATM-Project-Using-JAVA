import javax.swing.*;
import java.awt.*;
public class AccStat_2
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
		
		Font f_1 = new Font("Calibri",Font.BOLD,24);
		
	    JFrame AS_1Frame=new JFrame("ATM");     //creating frame for work
		
		
		
		JLabel Stat_1 = new JLabel("YOUR LAST 5 WITHDRAWLS ARE");
	    Stat_1.setBounds(120,140,700,90);
		Stat_1.setForeground(new Color(203,65,84));
		Stat_1.setFont(f);
	    background.add(Stat_1);
		
		
		JLabel Stat_2 = new JLabel("1.   10/01/20 - RS 13,000.00");
	    Stat_2.setBounds(235,180,700,90);
		Stat_2.setForeground(new Color(255,255,0));
		Stat_2.setFont(f_1);
	    background.add(Stat_2);
		
		JLabel Stat_3 = new JLabel("2.   02/03/20 - RS 11,500.00");
	    Stat_3.setBounds(235,210,700,90);
		Stat_3.setForeground(new Color(255,255,0));
		Stat_3.setFont(f_1);
	    background.add(Stat_3);
		
		JLabel Stat_4 = new JLabel("3.   21/03/20 - RS 7,000.00");
	    Stat_4.setBounds(235,240,700,90);
		Stat_4.setForeground(new Color(255,255,0));
		Stat_4.setFont(f_1);
	    background.add(Stat_4);
		
		JLabel Stat_5 = new JLabel("4.   12/04/20 - RS 15,000.00");
	    Stat_5.setBounds(235,270,700,90);
		Stat_5.setForeground(new Color(255,255,0));
		Stat_5.setFont(f_1);
	    background.add(Stat_5);
		
		JLabel Stat_6 = new JLabel("5.   30/04/20 - RS 10,000.00");
	    Stat_6.setBounds(235,300,700,90);
		Stat_6.setForeground(new Color(255,255,0));
		Stat_6.setFont(f_1);
	    background.add(Stat_6);
		
		AS_1Frame.setVisible(true);           //it will make frame visible
		
		
		AS_1Frame.setSize(750,550);           //it will set dimension of frame
		
		
		AS_1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		AS_1Frame.setLayout(null);
		
		AS_1Frame.add(background);
	}
	
	
}	