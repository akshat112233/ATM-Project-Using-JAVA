import javax.swing.*;
import java.awt.*;
public class CheckB_1
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
		
	    JFrame BalFrame=new JFrame("ATM");     //creating frame for work
		
		JLabel BAL_1 = new JLabel("YOUR ACCOUNT BALANCE IS");
	    BAL_1.setBounds(120,140,700,90);
		BAL_1.setForeground(new Color(203,65,84));
		BAL_1.setFont(f);
	    background.add(BAL_1);
		
		
		JLabel BAL_2 = new JLabel("RS 60,000.00");
	    BAL_2.setBounds(235,180,700,90);
		BAL_2.setForeground(new Color(203,65,84));
		BAL_2.setFont(f);
	    background.add(BAL_2);
		
		BalFrame.setVisible(true);           //it will make frame visible
		
		
		BalFrame.setSize(750,550);           //it will set dimension of frame
		
		
		BalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		BalFrame.setLayout(null);
		
		BalFrame.add(background);
	}
	
	
}	