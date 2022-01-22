import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SendFund
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
		
		
	    JFrame SendFrame=new JFrame("ATM");     //creating frame for work
		
		
		
		Font f = new Font("Calibri",Font.BOLD,18);
		
		
		JLabel acc = new JLabel("ENTER ACCOUNT NO.");
	    acc.setBounds(40,97,170,90);
		acc.setForeground(Color.WHITE);
		acc.setFont(f);
	    background.add(acc);
		
		
		
		JTextField acc_no = new JTextField();     //adding textfield for input of account number 
		acc_no.setBounds(290,120,190,40);
		acc_no.setBackground(Color.WHITE);
		background.add(acc_no);
		
		JLabel Name = new JLabel("ENTER ACC HOLDER NAME");
	    Name.setBounds(40,180,220,90);
		Name.setForeground(Color.WHITE);
		Name.setFont(f);
	    background.add(Name);
		
		JTextField name = new JTextField();     //adding textfield for input of name
		name.setBounds(290,200,190,40);
		name.setBackground(Color.WHITE);
	    background.add(name);
		
		JLabel code = new JLabel("ENTER IFSC CODE");
	    code.setBounds(40,258,220,90);
		code.setForeground(Color.WHITE);
		code.setFont(f);
	    background.add(code);
		
		JTextField ifsc = new JTextField();     //adding textfield for input of ifsc code
		ifsc.setBounds(290,280,190,40);
		ifsc.setBackground(Color.WHITE);
		background.add(ifsc);
		
		JLabel money = new JLabel("ENTER TRANSFER AMOUNT");
	    money.setBounds(40,340,220,90);
		money.setForeground(Color.WHITE);
		money.setFont(f);
	    background.add(money);
		JTextField amt = new JTextField();     //adding textfield for input of amount to send
		amt.setBounds(290,360,190,40);
		amt.setBackground(Color.WHITE);
		background.add(amt);
		
		
		JButton go = new JButton("Continue");     //JButton for continuing process
	    go.setBounds(560,190,150,60);
		go.setBackground(Color.WHITE);
		background.add(go);
		go.addActionListener(new ActionListener()
			       { 
                     public void actionPerformed(ActionEvent e)
                        {  
					     new SMTY();
						 SMTY.main(args);
						 SendFrame.dispose();
			            } 
                    }
                ); 

		
		
		
		
		SendFrame.setVisible(true);           //it will make frame visible
		
		
		SendFrame.setSize(762,580);           //it will set dimension of frame
		
		
		SendFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //program will stop if frame closed
		
		
		SendFrame.setLayout(null);
		
		SendFrame.add(background);
	}
	
	
}	