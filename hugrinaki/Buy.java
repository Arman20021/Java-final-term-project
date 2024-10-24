 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Buy extends JFrame 
{
	private  JFrame frame;
	private  JButton back;
	private  JButton exBtn;
	private  JLabel paymt;
	private  JLabel mth;
	private  JLabel lfname;
	private  JLabel lname;
	private  JLabel cardnum;
	private  JLabel cvv;
	private  JLabel expdate;
	private  JButton cnfm;
	private  JTextField ffname;
	private  JTextField flname;
	private  JTextField fcardnum;
	private  JTextField fcvv;
	private  JTextField fexdate;
	private ImageIcon icon;
	
	Buy()
	{
		frame=new JFrame("Hungry Naki");
		back=new JButton("<<Back");
		exBtn = new JButton("Exit");
		icon = new ImageIcon("icon2.png");
        JLabel cover = new JLabel(new ImageIcon("buy.jpg"));
        cover.setBounds(0, 0, 1000, 800);
		JLabel card = new JLabel(new ImageIcon("card.png"));
        card.setBounds(10, 0, 580, 800);
		paymt=new JLabel("Payment");	
		mth=new JLabel("Method");	
		lfname=new JLabel("First Name");		
		lname=new JLabel("Last Name");	
		cardnum=new JLabel("Card Number");		
		cvv=new JLabel("CVV");
		expdate=new JLabel(" Expiry Date");		
		cnfm=new JButton("Confirm");
		ffname=new JTextField();		
		flname=new JTextField();
		fcardnum=new JTextField();
		fcvv=new JTextField();
		fexdate=new JTextField();
		
		frame.setIconImage(icon.getImage());
		
		Font f1 =new Font ( "Arial",Font.BOLD,40);
		Font f2 =new Font ( "Harlow Solid Italic",Font.PLAIN,70);			
		Font f3 =new Font ( "Times New Roman",Font.PLAIN,25);			
		
		paymt.setFont(f2);			
		mth.setFont(f2);			
		lfname.setFont(f3);		
		lname.setFont(f3);		
		cardnum.setFont(f3);		
		cvv.setFont(f3);		
		expdate.setFont(f3);		
		paymt.setForeground(Color.WHITE);		
		mth.setForeground(Color.WHITE);		
		lfname.setForeground(Color.WHITE);		
		lname.setForeground(Color.WHITE);		
		cardnum.setForeground(Color.WHITE);		
		cvv.setForeground(Color.WHITE);		
		expdate.setForeground(Color.WHITE);		
		
		
		back.setBounds(50,720,80,30);
		exBtn.setBounds(823, 720, 100, 30);
		paymt.setBounds(650, -5, 300, 100);		
		mth.setBounds(650, -100, 500, 500);		
		lfname.setBounds(620, 0, 500, 500);		
		lname.setBounds(820, 0, 500, 500);		
		cardnum.setBounds(620, 95, 500, 500);		
		cvv.setBounds(820, 95, 500, 500);		
		expdate.setBounds(620, 200, 500, 500);		
		ffname.setBounds(620, 280, 120, 30);		
		flname.setBounds(820, 280, 120, 30);		
		fcardnum.setBounds(620, 380, 120, 30);		
		fcvv.setBounds(820, 380, 120, 30);		
		fexdate.setBounds(620, 490, 120, 30);		
		cnfm.setBounds(750, 580, 100, 30);		
		
		
		exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exBtn.addActionListener((event) -> System.exit(0));
		
		back.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = back.getBackground(); // When the mouse moves over a label, the background color changed.
				back.setBackground(new Color(7, 154, 69));
				back.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = back.getBackground();
				back.setBackground(back.getForeground());
				back.setForeground(c);
			}    
		});
		
		cnfm.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = cnfm.getBackground(); // When the mouse moves over a label, the background color changed.
				cnfm.setBackground(new Color(7, 154, 69));
				cnfm.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = cnfm.getBackground();
				cnfm.setBackground(cnfm.getForeground());
				cnfm.setForeground(c);
			}    
		});
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cnfm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Pizza1();
			}
		});   
		
		
		cnfm.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				// Check if all fields are filled up
				if (ffname.getText().isEmpty() || flname.getText().isEmpty() || fcardnum.getText().isEmpty() || fcvv.getText().isEmpty() || fexdate.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill up all fields.");
					return;
				}
				
				
				
				// Check if card number is 16-digit
				String cardNum = fcardnum.getText().replaceAll("\\s+","");
				if (!cardNum.matches("\\d{16}")) {
					JOptionPane.showMessageDialog(null, "Please enter a 16-digit card number.");
					return;
				}
				
				// Check if CVV is 3-digit
				String cvv = fcvv.getText();
				if (!cvv.matches("\\d{3}")) {
					JOptionPane.showMessageDialog(null, "Please enter a 3-digit CVV.");
					return;
				}
				
				JOptionPane.showMessageDialog(null, "Your Payment Has Completed! Your Pizza Will Be Delivered In 15 Minutes");
				
				frame.setVisible(false); 
				new DashBoard();
			}
		});
		
		
		exBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Color c = exBtn.getBackground();
                exBtn.setBackground(Color.RED);
                exBtn.setForeground(c);
			}
			
            public void mouseExited(MouseEvent evt) {
                Color c = exBtn.getBackground();
                exBtn.setBackground(exBtn.getForeground());
                exBtn.setForeground(c);
			}
		});	
		
		
		back.setBorder(null);
        exBtn.setBorder(null);		 
        cnfm.setBorder(null);		 
        ffname.setBorder(null);		 
        flname.setBorder(null);		 
        fcardnum.setBorder(null);		 
        fcvv.setBorder(null);		 
        fexdate.setBorder(null);		 
		
		
		frame.add(exBtn);
		frame.add(back);
		frame.add(card);
		frame.add(paymt);
		frame.add(mth);
		frame.add(lfname);
		frame.add(lname);
		frame.add(cardnum);
		frame.add(cvv);
		frame.add(expdate);
		frame.add(cnfm);
		frame.add(ffname);
		frame.add(flname);
		frame.add(fcardnum);
		frame.add(fcvv);
		frame.add(fexdate);
		frame.add(cover);
		
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
		
		
		
	}
	
	
	
	public
    static void main(String[] args)
    {
        new Buy();
	}
}

