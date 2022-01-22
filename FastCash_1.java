import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FastCash_1
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
		
		
	    JFrame fastFrame=new JFrame("ATM");     //creating frame for work
		
		
		
		JButton edit = new JButton("SET/EDIT LIMIT");         //button of editing or setting limit of withdrawl
	    edit.setBounds(510,260,210,90);
		edit.setBackground(Color.WHITE);
	    background.add(edit);
		 edit.addActionListener(new ActionListener()
			       { 
                     public void actionPerformed(ActionEvent e)
                        {  
					     new FastCash_2();
						 FastCash_2.main(args);
						 fastFrame.dispose();
			            } 
                    }
                ); 
		
		JButton with = new JButton("CONTINUE WITHDRAWL"); // button for continuing withdrawl option
	    with.setBounds(510,380,210,90);
		with.setBackground(Color.WHITE);
	    background.add(with);
		 with.addActionListener(new ActionListener()
			       { 
                     public void actionPerformed(ActionEvent e)
                        {  
					     new CCT();
						 CCT.main(args);
						 fastFrame.dispose();
			            } 
                    }
                ); 
		
		fastFrame.setVisible(true);           //it will make frame visible
		
		
		fastFrame.setSize(750,550);           //it will set dimension of frame
		
		
		fastFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		fastFrame.setLayout(null);
		
		fastFrame.add(background);
	}
	
	
}	