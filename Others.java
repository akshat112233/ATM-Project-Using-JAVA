import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Others
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
		
		
		
	    JFrame OtherFrame=new JFrame("ATM");     //creating frame for work
		
		
		
		JButton adh = new JButton("AADHAR KYC");         //button for opting current o
	    adh.setBounds(560,260,150,90);
		adh.setBackground(Color.WHITE);
	    background.add(adh);
		adh.addActionListener(new ActionListener()
			       {
                     public void actionPerformed(ActionEvent e)
                        {  
					     new KYC_1();
						 KYC_1.main(args);
						 OtherFrame.dispose();
			            } 
                    }
                );
		
		JButton det = new JButton("ACC DETAILS"); 
	    det.setBounds(560,380,150,90);
		det.setBackground(Color.WHITE);
	    background.add(det);
		det.addActionListener(new ActionListener()
			       {
                     public void actionPerformed(ActionEvent e)
                        {  
					     new Pin();
						 Pin.main(args);
						 OtherFrame.dispose();
			            } 
                    }
                );
		
		
		
		OtherFrame.setVisible(true);           //it will make frame visible
		
		
		OtherFrame.setSize(750,550);           //it will set dimension of frame
		
		
		OtherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		OtherFrame.setLayout(null);
		
		OtherFrame.add(background);
	}
	
	
}	