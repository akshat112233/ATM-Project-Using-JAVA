import javax.swing.*;
import java.awt.*;
public class Details_2
{
	
	
	public static void main(String[] args)
	{
		Font f = new Font("Calibri",Font.BOLD,30);
		
		JLabel background;
		ImageIcon img = new ImageIcon("01_gettyimages_543217268_super_resized.jpg");
		Image jpg = img.getImage();
		Image temp_img = jpg.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_img);
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,750,550);
		
		
	    JFrame Det_2Frame=new JFrame("ATM");     //creating frame for work
		
		
		JLabel NA = new JLabel("NAME            :");
	    NA.setBounds(20,150,750,110);
		NA.setForeground(new Color(203,65,84));
		NA.setFont(f);
	    background.add(NA);
		
		JLabel ACN = new JLabel("ACC NO         :");
	    ACN.setBounds(20,190,700,110);
		ACN.setForeground(new Color(203,65,84));
		ACN.setFont(f);
	    background.add(ACN);
		
		JLabel RP = new JLabel("REG PHONE  :");
	    RP.setBounds(20,230,700,110);
		RP.setForeground(new Color(203,65,84));
		RP.setFont(f);
	    background.add(RP);
		
		JLabel KS = new JLabel("KYC STATUS :");
	    KS.setBounds(20,270,700,110);
		KS.setForeground(new Color(203,65,84));
		KS.setFont(f);
	    background.add(KS);
		
		JLabel NA_1 = new JLabel("HARSHITA KHANDELWAL");
	    NA_1.setBounds(250,150,650,110);
		NA_1.setForeground(new Color(255,255,0));
		NA_1.setFont(f);
	    background.add(NA_1);
		
		JLabel ACN_1 = new JLabel("3278 3054 101");
	    ACN_1.setBounds(250,190,650,110);
		ACN_1.setForeground(new Color(255,255,0));
		ACN_1.setFont(f);
	    background.add(ACN_1);
		
		JLabel RP_1 = new JLabel("81291 77080");
	    RP_1.setBounds(250,230,650,110);
		RP_1.setForeground(new Color(255,255,0));
		RP_1.setFont(f);
	    background.add(RP_1);
		
		JLabel KS_1 = new JLabel("COMPLETED");
	    KS_1.setBounds(250,270,650,110);
		KS_1.setForeground(new Color(255,255,0));
		KS_1.setFont(f);
	    background.add(KS_1);
		
		Det_2Frame.setVisible(true);           //it will make frame visible
		
		
		Det_2Frame.setSize(750,550);           //it will set dimension of frame
		
		
		Det_2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		Det_2Frame.setLayout(null);
		
		Det_2Frame.add(background);
	}
	
	
}	