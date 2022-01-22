import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class KYC_2
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
		
		
	    JFrame KYC_2Frame=new JFrame("ATM");     //creating frame for work
		
		JLabel adh = new JLabel("PLEASE ENTER THE OTP SENT TO YOUR");
	    adh.setBounds(110,150,650,110);
		adh.setForeground(Color.WHITE);
		adh.setFont(f);
	    background.add(adh);
		
		
		JLabel adh_1 = new JLabel("REGISTERED PHONE NUMBER");
	    adh_1.setBounds(155,180,650,110);
		adh_1.setForeground(Color.WHITE);
		adh_1.setFont(f);
	    background.add(adh_1);
		
		JPasswordField adhn = new JPasswordField();     //adding textfield for input of phone number
		adhn.setBounds(265,300,180,40);
		background.add(adhn);
		
		JButton go = new JButton("Continue");     //JButton for continuing process
	    go.setBounds(560,400,150,60);
		go.setBackground(Color.WHITE);
		background.add(go);
		go.addActionListener(new ActionListener()
			       {
                     public void actionPerformed(ActionEvent e)
                        {  
							int a = 4801;
							String d = String.valueOf(adhn.getPassword());
							int num = Integer.parseInt(d);
							if(num == a)
							{
							 new KYC_3();
							 KYC_3.main(args);
							}
							else
							{
							 new IncD();
							 IncD.main(args);
							}
							KYC_2Frame.dispose();
			            } 
                    }
                );
		
		
		KYC_2Frame.setVisible(true);           //it will make frame visible
		
		
		KYC_2Frame.setSize(750,550);           //it will set dimension of frame
		
		
		KYC_2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		KYC_2Frame.setLayout(null);
		
		KYC_2Frame.add(background);
	}
	
	
}	