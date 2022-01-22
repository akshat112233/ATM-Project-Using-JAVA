import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Banking
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
		
	
	
	JFrame A = new JFrame("ATM"); //creating frame for work
	
	//creating buttons 
	
	JButton sm = new JButton("Send Money"); 
	   sm.setBounds(560,20,150,90);
	   sm.setBackground(Color.WHITE);
	   background.add(sm);
	   sm.addActionListener
	            ( 
		           new ActionListener()
			       { 

                    public void actionPerformed(ActionEvent e)
                        {  
					     new SendFund();
						 SendFund.main(args);
						 A.dispose();
						} 
                    }
                );

	JButton cb = new JButton("Check Balance");
	  cb.setBounds(560,140,150,90);
	  cb.setBackground(Color.WHITE);
	  background.add(cb);
	  cb.addActionListener
	            ( 
		           new ActionListener()
			       { 

                    public void actionPerformed(ActionEvent e)
                        {  
						 new EnterPin();
						 EnterPin.main(args);
						 A.dispose();
						} 
                    }
                );
	
	JButton acs = new JButton("Acc Statement");
	  acs.setBounds(560,260,150,90);
	  acs.setBackground(Color.WHITE);
	  background.add(acs);
	  acs.addActionListener
	            ( 
		           new ActionListener()
			       { 

                    public void actionPerformed(ActionEvent e)
                        {  
					      new EnterPin_2();
						  EnterPin_2.main(args);
						  A.dispose();
						} 
                    }
                );
	
	JButton lmd = new JButton("Last Money Deposit");
	  lmd.setBounds(560,380,150,90);
	  lmd.setBackground(Color.WHITE);
	  background.add(lmd);
      lmd.addActionListener
	            ( 
		           new ActionListener()
			       { 

                    public void actionPerformed(ActionEvent e)
                        {  
					      new EnterPin_3();
						  EnterPin_3.main(args);
						  A.dispose();
						} 
                    }
                );	  
	  
	A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
	
	A.setSize(750,550);
	
	A.setLayout(null);
	
	A.setVisible(true);
	
	A.add(background);  //adding buttons in frame
   }
}