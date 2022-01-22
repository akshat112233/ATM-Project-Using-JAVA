import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class KYC_1
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
		
		
	    JFrame KYCFrame=new JFrame("ATM");     //creating frame for work
		
		JLabel adh = new JLabel("PLEASE ENTER YOUR AADHAR NUMBER BELOW");
	    adh.setBounds(50,150,650,110);
		adh.setForeground(Color.WHITE);
		adh.setFont(f);
	    background.add(adh);
		
		
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
					     new KYC_2();
						 KYC_2.main(args);
						 KYCFrame.dispose();
			            } 
                    }
                );
		
		KYCFrame.setVisible(true);           //it will make frame visible
		
		
		KYCFrame.setSize(750,550);           //it will set dimension of frame
		
		
		KYCFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		KYCFrame.setLayout(null);
		
		KYCFrame.add(background);
	}
	
	
}	