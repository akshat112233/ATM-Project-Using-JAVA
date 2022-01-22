import javax.swing.*;
import java.awt.*;
public class SET
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
		Font f_1 = new Font("Algerian",Font.BOLD,36);
		
	    JFrame CCTFrame=new JFrame("ATM");     //creating frame for work
		
		JLabel pcs = new JLabel("THE NEW LIMIT HAS BEEN SET");
	    pcs.setBounds(140,140,700,90);
		pcs.setForeground(new Color(255,255,0));
		pcs.setFont(f);
	    background.add(pcs);
		
		
		JLabel ty = new JLabel("THANKYOU");
	    ty.setBounds(250,240,700,90);
		ty.setForeground(new Color(203,65,84));
		ty.setFont(f_1);
	    background.add(ty);
		
		CCTFrame.setVisible(true);           //it will make frame visible
		
		
		CCTFrame.setSize(750,550);           //it will set dimension of frame
		
		
		CCTFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		CCTFrame.setLayout(null);
		
		CCTFrame.add(background);
	}
	
	
}	