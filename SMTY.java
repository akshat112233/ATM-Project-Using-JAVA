import javax.swing.*;
import java.awt.*;
public class SMTY
{
	
	
	public static void main(String[] args)
	{
		Font f = new Font("Algerian",Font.BOLD,30);
		
		JLabel background;
		ImageIcon img = new ImageIcon("01_gettyimages_543217268_super_resized.jpg");
		Image jpg = img.getImage();
		Image temp_img = jpg.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_img);
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,750,550);
		
		
	    JFrame SMTYFrame=new JFrame("ATM");     //creating frame for work
		
		
		JLabel adh = new JLabel("YOUR FUNDS HAVE BEEN TRANSFERRED");
	    adh.setBounds(70,150,700,110);
		adh.setForeground(Color.WHITE);
		adh.setFont(f);
	    background.add(adh);
		
		
		JLabel adh_1 = new JLabel("THANKYOU");
	    adh_1.setBounds(290 ,210,650,110);
		adh_1.setForeground(Color.WHITE);
		adh_1.setFont(f);
	    background.add(adh_1);
		
		
		
		SMTYFrame.setVisible(true);           //it will make frame visible
		
		
		SMTYFrame.setSize(750,550);           //it will set dimension of frame
		
		
		SMTYFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		SMTYFrame.setLayout(null);
		
		SMTYFrame.add(background);
	}
	
	
}	