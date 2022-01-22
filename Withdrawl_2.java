import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Withdrawl_2
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
		
		
	    JFrame WFrame=new JFrame("ATM");     //creating frame for work
		
		JLabel disc = new JLabel("ENTER AMOUNT IN 200,500,1000,2000,....");
	    disc.setBounds(30,140,700,90);
		disc.setForeground(new Color(203,65,84));
		disc.setFont(f);
	    background.add(disc);
		
		JTextField amt = new JTextField();     //adding textfield for input of amount
		amt.setBounds(275,380,150,40);
		amt.setBackground(Color.WHITE);
		background.add(amt);
		
		JButton go = new JButton("Continue");     //JButton for continuing process
	    go.setBounds(560,250,150,60);
		go.setBackground(Color.WHITE);
		background.add(go);
		go.addActionListener(new ActionListener()
			       { 
				   
                     public void actionPerformed(ActionEvent e)
                        {  
						 int a = 15000;
						 int b = 100;
				         int num = Integer.parseInt(amt.getText());
				         if(num < a && num > b)
						  {
					        new CCT();
						    CCT.main(args);
						  }
						  else
						  {
							new IncA();
							IncA.main(args);
						  }
						 WFrame.dispose();
			            } 
                    }
                );
		
		
		
		WFrame.setVisible(true);           //it will make frame visible
		
		
		WFrame.setSize(750,550);           //it will set dimension of frame
		
		
		WFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		WFrame.setLayout(null);
		
		WFrame.add(background);
	}
	
	
}	