import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PinGeneration
{
	
	
	public static void main(String[] args)
	{
		Font f = new Font("Calibri",Font.BOLD,40);
		
		
		JLabel background;
		ImageIcon img = new ImageIcon("01_gettyimages_543217268_super_resized.jpg");
		Image jpg = img.getImage();
		Image temp_img = jpg.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_img);
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,750,550);
		
		
	    JFrame NewPinFrame=new JFrame("ATM");     //creating frame for work
		
		JLabel adh = new JLabel("PLEASE ENTER THE OTP SENT TO YOUR");
	    adh.setBounds(50,150,650,110);
		adh.setForeground(Color.WHITE);
		adh.setFont(f);
	    background.add(adh);
		
		
		JLabel adh_1 = new JLabel("REGISTERED PHONE NUMBER");
	    adh_1.setBounds(125,200,650,110);
		adh_1.setForeground(Color.WHITE);
		adh_1.setFont(f);
	    background.add(adh_1);
		
		
		JPasswordField phone = new JPasswordField();     //adding textfield for input of phone number
		phone.setBounds(285,300,180,40);
		background.add(phone);
		
		
		JButton go = new JButton("Continue");     //JButton for continuing process
	    go.setBounds(560,400,150,60);
		go.setBackground(Color.WHITE);
		background.add(go);
		go.addActionListener(new ActionListener()
			       {
                     public void actionPerformed(ActionEvent e)
                        {  
						 int a = 4801;
				         String d = String.valueOf(phone.getPassword());
						 int num = Integer.parseInt(d);
						 if(num == a)
						    {
							 new PG_SET_1();
						     PG_SET_1.main(args);
							 
							}			
						 else
						    {
							 new IncD();
							 IncD.main(args);
						    }
						 NewPinFrame.dispose();	
						}						
                    }
                );
		
		NewPinFrame.setVisible(true);           //it will make frame visible
		
		
		NewPinFrame.setSize(750,550);           //it will set dimension of frame
		
		
		NewPinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		NewPinFrame.setLayout(null);
		
		NewPinFrame.add(background);
	}
	
	
}	