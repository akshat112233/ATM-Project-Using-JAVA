import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Pin
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
		
	    JFrame OldpinFrame=new JFrame("ATM");     //creating frame for work
		
		JLabel L_1 = new JLabel("ENTER 4-DIGIT PIN");
	    L_1.setBounds(220,160,700,90);
		L_1.setForeground(new Color(203,65,84));
		L_1.setFont(f);
	    background.add(L_1);
		
		JPasswordField pass = new JPasswordField();     //adding textfield for input of pin
		pass.setBounds(275,300,150,40);
		background.add(pass);
		
		
		
		JButton go = new JButton("CONTINUE");     //JButton for continuing process
	    go.setBounds(580,110,150,60);
		go.setBackground(Color.WHITE);
		background.add(go);
		go.addActionListener(new ActionListener()
			       { 
				   
                     public void actionPerformed(ActionEvent e)
                        {  
						 int a = 1807;
						 int b = 2705;
						 int c = 2905;
				         String d = String.valueOf(pass.getPassword());
						 int num = Integer.parseInt(d);
				         if(num == a)
						  {
					        new Details_1();
						    Details_1.main(args);
						  }
						  else if(num == b)
						  {
							new Details_2();
							Details_2.main(args);
						  }
						  else if(num == c)
						  {
							new Details_3();
							Details_3.main(args);
						  }
						  else
						  {
							new IncD();
							IncD.main(args);
						  }
						  OldpinFrame.dispose();
			            } 
				    }
                );
		
		
		OldpinFrame.setVisible(true);           //it will make frame visible
		
		
		OldpinFrame.setSize(750,550);           //it will set dimension of frame
		
		
		OldpinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		OldpinFrame.setLayout(null);
		
		OldpinFrame.add(background);
	}
	
	
}	