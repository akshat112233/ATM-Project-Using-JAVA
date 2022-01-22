import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FastCash_2
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
		
		
	    JFrame cashFrame=new JFrame("ATM");     //creating frame for work
		
		Font f = new Font("Calibri",Font.BOLD,35);
		
		
		JLabel inst = new JLabel("PLEASE ENTER THE RESET AMOUNT BELOW");
	    inst.setBounds(50,40,650,110);
		inst.setForeground(Color.WHITE);
		inst.setFont(f);
	    background.add(inst);
		
		JTextField amt = new JTextField();     //adding textfield for input of amount
		amt.setBounds(275,350,150,40);
		amt.setBackground(Color.WHITE);
	    background.add(amt);
	
		
		JButton go = new JButton("Continue");     //JButton for continuing process
	    go.setBounds(560,220,150,60);
		go.setBackground(Color.WHITE);
	    background.add(go);
	    go.addActionListener(new ActionListener()
			       { 
				   
                     public void actionPerformed(ActionEvent e)
                        {  
						 int a = 15000;
				         int num = Integer.parseInt(amt.getText());
				         if(num < a)
						  {
					        new SET();
						    SET.main(args);
						  }
						  else
						  {
							new IncA();
							IncA.main(args);
						  }
						 cashFrame.dispose();
			            } 
                    }
                );
		
		
		
		cashFrame.setVisible(true);           //it will make frame visible
		
		
		cashFrame.setSize(750,550);           //it will set dimension of frame
		
		
		cashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		cashFrame.setLayout(null);
		
		cashFrame.add(background);
	}
	
	
}	