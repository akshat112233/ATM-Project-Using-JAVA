import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ATM
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
		
		
	    JFrame ATMFrame=new JFrame("ATM");     //creating frame for work
		
		Font f = new Font("Algerian",Font.BOLD,65);
		
		
		JLabel wel = new JLabel("WELCOME");
	    wel.setBounds(180,180,400,90);
		wel.setForeground(new Color(203,65,84));
		wel.setFont(f);
	    background.add(wel);
		
		
		JButton A1 = new JButton("BANKING");     //creation of buttons at left start
	    A1.setBounds(570,20,150,90);
		A1.setBackground(Color.WHITE);
		background.add(A1);
		 A1.addActionListener(new ActionListener()
			       { 
                     public void actionPerformed(ActionEvent e)
                        {  
					     new Banking();
						 Banking.main(args);
						 ATMFrame.dispose();
			            } 
                    }
                ); 
		
		JButton A2 = new JButton("FAST CASH"); 
	    A2.setBounds(570,140,150,90);
		A2.setBackground(Color.WHITE);
		background.add(A2);
		A2.addActionListener(new ActionListener()
			       { 
                     public void actionPerformed(ActionEvent e)
                        {  
					     new FastCash_1();
						 FastCash_1.main(args);
						 ATMFrame.dispose();
						} 
                    }
                ); 
		
		JButton A3 = new JButton("WITHDRAWL"); 
	    A3.setBounds(570,260,150,90);
		A3.setBackground(Color.WHITE);
		background.add(A3);
		A3.addActionListener(new ActionListener()
			       { 
                     public void actionPerformed(ActionEvent e)
                        {  
					     new Withdrawl_2();
						 Withdrawl_2.main(args);
						 ATMFrame.dispose();
						} 
                    }
                ); 
		
		JButton A4 = new JButton("OTHERS"); 
	    A4.setBounds(570,380,150,90);
		A4.setBackground(Color.WHITE);
		background.add(A4);
		A4.addActionListener(new ActionListener()
			       {
                     public void actionPerformed(ActionEvent e)
                        {  
					     new Others();
						 Others.main(args);
						 ATMFrame.dispose();
			            } 
                    }
                ); 
		
		JButton A5 = new JButton("PIN GENERATION"); 
	    A5.setBounds(20,380,150,90);
		A5.setBackground(Color.WHITE);
		background.add(A5);
		A5.addActionListener(new ActionListener()
			       {
                     public void actionPerformed(ActionEvent e)
                        {  
					     new PinGeneration();
						 PinGeneration.main(args);
						 ATMFrame.dispose();
			            } 
                    }
                ); 
		ATMFrame.setVisible(true);           //it will make frame visible
		
		
		ATMFrame.setSize(750,550);           //it will set dimension of frame
		
		
		ATMFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		ATMFrame.setLayout(null);
		
		ATMFrame.add(background);
	}
	
	
}	