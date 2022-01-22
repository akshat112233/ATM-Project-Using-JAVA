import javax.swing.*;
import java.awt.*;
public class LMDepo_3
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
		
	    JFrame MON_1Frame=new JFrame("ATM");     //creating frame for work
		
		
		
		JLabel LM_1 = new JLabel("YOUR LAST MONEY DEPOSIT HISTORY IS");
	    LM_1.setBounds(90,140,700,90);
		LM_1.setForeground(new Color(203,65,84));
		LM_1.setFont(f);
	    background.add(LM_1);
		
		
		JLabel LM_2 = new JLabel("1.   15/01/20 - RS 40,000.00");
	    LM_2.setBounds(235,180,700,90);
		LM_2.setForeground(new Color(255,255,0));
		LM_2.setFont(f_1);
	    background.add(LM_2);
		
		JLabel LM_3 = new JLabel("2.   25/03/20 - RS 80,000.00");
	    LM_3.setBounds(235,210,700,90);
		LM_3.setForeground(new Color(255,255,0));
		LM_3.setFont(f_1);
	    background.add(LM_3);
		
		JLabel LM_4 = new JLabel("3.   30/04/20 - RS 32,000.00");
	    LM_4.setBounds(235,240,700,90);
		LM_4.setForeground(new Color(255,255,0));
		LM_4.setFont(f_1);
	    background.add(LM_4);
		
		
		
		MON_1Frame.setVisible(true);           //it will make frame visible
		
		
		MON_1Frame.setSize(750,550);           //it will set dimension of frame
		
		
		MON_1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		MON_1Frame.setLayout(null);
		
		MON_1Frame.add(background);
	}
	
	
}	