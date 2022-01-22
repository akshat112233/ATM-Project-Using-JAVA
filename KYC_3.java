import javax.swing.*;
import java.awt.*;
public class KYC_3
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
		
		
	    JFrame KYC_3Frame=new JFrame("ATM");     //creating frame for work
		
		
		JLabel adh = new JLabel("YOUR AADHAAR IS LINKED TO YOUR ACCOUNT");
	    adh.setBounds(20,150,700,110);
		adh.setForeground(Color.WHITE);
		adh.setFont(f);
	    background.add(adh);
		
		
		JLabel adh_1 = new JLabel("THANKYOU");
	    adh_1.setBounds(290 ,210,650,110);
		adh_1.setForeground(Color.WHITE);
		adh_1.setFont(f);
	    background.add(adh_1);
		
		
		
		KYC_3Frame.setVisible(true);           //it will make frame visible
		
		
		KYC_3Frame.setSize(750,550);           //it will set dimension of frame
		
		
		KYC_3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		KYC_3Frame.setLayout(null);
		
		KYC_3Frame.add(background);
	}
	
	
}	