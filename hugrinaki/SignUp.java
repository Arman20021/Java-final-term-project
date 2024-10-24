 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;


public class SignUp extends JFrame{
	private JLabel lfrstnam ;
	private JLabel llstnam;
	private JLabel lusernam;
	private JLabel lemail;
	private JLabel lphn;
	private JLabel adress;
	private JLabel lpass;
	private JLabel lcnfmpa;
	private JLabel ltext;
	private JLabel ltext1;
	private JLabel ltext2;
	private JLabel limg;
	private JButton bcnfm ;
	private JButton exit ;
	private JButton back ;
	private JTextField fname;
	private JTextField flstnam;
	private JTextField fusnam;
	private JTextField femail;
	private JTextField fphn;
	private JTextField fadress;
	private JPasswordField ppass;
	private JPasswordField pcpass;
	private JPanel pane; 
	private JFrame frame;
	private ImageIcon img;
	private ImageIcon icon;
    
	
	public SignUp() {
		
		
        frame = new JFrame("SignUp");
		lfrstnam =new JLabel("First Name");
		llstnam =new JLabel("Last Name");
		lusernam =new JLabel("UserName");
		lemail =new JLabel("Email");
		lphn=new JLabel("Phone");
		adress=new JLabel("Adress");
		lpass =new JLabel("Password");
		lcnfmpa =new JLabel("Confirm Password");
		ltext=new JLabel("Create an Account");
		ltext1=new JLabel("Let's Make It ");
		ltext2=new JLabel("Happen Together");
		bcnfm =new JButton("Confirm");
		exit =new JButton("Exit");
		back =new JButton("Back");
		fname=new JTextField();
		flstnam=new JTextField();
		fusnam=new JTextField();
		femail=new JTextField();
		fphn=new JTextField();
		fadress=new JTextField();
		ppass=new JPasswordField();
		pcpass=new JPasswordField();
		pane = new JPanel();
	    img=new ImageIcon(getClass().getResource("image3.png"));
		limg=new JLabel(img);
		JLabel signback = new JLabel(new ImageIcon("signback.jpg")); 
		icon = new ImageIcon("icon2.png");
		frame.setIconImage(icon.getImage());
		
		
		String Num=" ";
		frame.getContentPane().setBackground(new Color(33, 47, 61));
		
		Font f1 =new Font ( "Times New Roman",Font.BOLD,30);
		
		ltext.setFont(f1);
		ltext1.setFont(f1);
		ltext2.setFont(new Font ( "Times New Roman",Font.BOLD,40));
		
		ltext.setForeground(new Color(211, 84, 0));
		ltext1.setForeground(new Color(211, 84, 0));
		ltext2.setForeground(new Color(211, 84, 0));
		lfrstnam.setForeground(new Color(46, 64, 83  ));
		llstnam.setForeground(new Color(46, 64, 83  ));
		lusernam.setForeground(new Color(46, 64, 83  ));
		lemail.setForeground(new Color(46, 64, 83  ));
		lphn.setForeground(new Color(46, 64, 83 ));
		lpass.setForeground(new Color(46, 64, 83  ));
		lcnfmpa.setForeground(new Color(46, 64, 83  ));
		lcnfmpa.setForeground(new Color(46, 64, 83  ));
		adress.setForeground(new Color(46, 64, 83  ));
		
		
		ltext1.setBounds(20,650,500,50);
		ltext2.setBounds(20,700,500,70);
		lfrstnam.setBounds(220,190,200,25);
		llstnam.setBounds(500,190,200,25);
		lusernam.setBounds(220,260,200,25);
		lemail.setBounds(500,265,200,25);
		lphn.setBounds(220,320,200,25);
		lpass.setBounds(220,380,200,25);
		lcnfmpa.setBounds(500,380,200,25);
		limg.setBounds(160, -50, img.getIconWidth(), img.getIconHeight());
		fname.setBounds(220,220,200,25);
		flstnam.setBounds(500,220,200,25);
		fusnam.setBounds(220,290,200,25);
		femail.setBounds(500,290,200,25);
		fphn.setBounds(220,350,200,25);
		ppass.setBounds(220,410,200,25);
		pcpass.setBounds(500,410,200,25);
		bcnfm.setBounds(370,490,200,25);
		back.setBounds(370,545,200,25);
		exit.setBounds(810,720,130,25);
		adress.setBounds(500,320,200,25);
		fadress.setBounds(500,350,200,25);
		signback.setBounds(0,0,1000,800);
		
		
		fname.setBorder(null);
		flstnam.setBorder(null);
		fusnam.setBorder(null);
		femail.setBorder(null);
		fphn.setBorder(null);
		ppass.setBorder(null);
		pcpass.setBorder(null);
		bcnfm.setBorder(null);
		back.setBorder(null);
		exit.setBorder(null);
		fadress.setBorder(null);
		
		
		bcnfm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		bcnfm.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = bcnfm.getBackground(); // When the mouse moves over a label, the background color changed.
				bcnfm.setBackground(new Color(40, 180, 99));
				bcnfm.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = bcnfm.getBackground();
				bcnfm.setBackground(bcnfm.getForeground());
				bcnfm.setForeground(c);
			}    
		});
		
		
		
		back.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = back.getBackground(); // When the mouse moves over a label, the background color changed.
				back.setBackground(new  Color(211, 84, 0));
				back.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = back.getBackground();
				back.setBackground(back.getForeground());
				back.setForeground(c);
			}    
		});
		
		
		
		exit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = bcnfm.getBackground(); // When the mouse moves over a label, the background color changed.
				exit.setBackground(new  Color(211, 84, 0));
				exit.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = exit.getBackground();
				exit.setBackground(exit.getForeground());
				exit.setForeground(c);
			}    
		});
		
		
		
		frame.add(lfrstnam);
		frame.add(llstnam);
		frame.add(lusernam);
		frame.add(lemail);
		frame.add(lphn);
		frame.add(lpass);
		frame.add(ltext);
		frame.add(ltext1);
		frame.add(ltext2);
		frame.add(limg);
		frame.add(lcnfmpa);
		frame.add(exit);
		frame.add(back);
		frame.add(fname);
		frame.add(flstnam);
		frame.add(fusnam);
		frame.add(femail);
		frame.add(fphn);
		frame.add(ppass);
		frame.add(pcpass);
		frame.add(bcnfm);
		frame.add(adress);
		frame.add(fadress);
		frame.add(signback);
		
		
		
		exit.addActionListener((event) -> System.exit(0));
		
		
		back.addMouseListener(new MouseAdapter()
			{
				//Override
				public void mouseClicked(MouseEvent e)
				{
					new Login();
					frame.setVisible(false);
				}
			});
			
			
			bcnfm .addMouseListener(new MouseAdapter()
				
				{
					
					//Override
					
					public void mouseClicked(MouseEvent e)
					
					{
						String s_First = fname.getText(); // First Name
						String s_Last = flstnam.getText(); // Last Name
						String s_User = fusnam.getText(); // User Name
						String s_Email = femail.getText(); // Email
						String s_Phone = fphn.getText(); // Mobile
						String s_Adress = fadress.getText(); // adress
						String s_pass = ppass.getText(); // Password
						String s_Cnfpass = pcpass.getText(); // Confirmpass
						
						
						
						if ( s_First.isEmpty() || s_Last.isEmpty() || s_User.isEmpty() ||  s_Adress.isEmpty() || s_Email.isEmpty()
						|| s_pass.isEmpty()||s_Cnfpass.isEmpty() || s_Phone.isEmpty() )
						{
							JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
						}  
						
						else{
							
							
							if (s_Phone.length() != 11)
							{
								JOptionPane.showMessageDialog(null, "Phone number must be exactly 11 digits long.", "Warning!", JOptionPane.WARNING_MESSAGE);
								return;
							}
							
							if (!s_Email.contains("@")) 
							{
								JOptionPane.showMessageDialog(null, "Invalid email address.", "Warning!", JOptionPane.WARNING_MESSAGE);
								return;
							} 
							
							
							if (s_pass.equals(s_Cnfpass)==false)
							{                    
								JOptionPane.showMessageDialog(null, "Password doesnot match", "Warning!", JOptionPane.WARNING_MESSAGE);
							}
							
							else
							{
								try
								{
									File file = new File(".\\Data\\user_data.txt");//
									if (!file.exists())
									{
										file.createNewFile();
									}
									FileWriter fw = new FileWriter(file, true);
									BufferedWriter bw = new BufferedWriter(fw);
									
									
									PrintWriter pw = new PrintWriter(bw);
									
									pw.println("First Name:" + s_First);  
									pw.println("Last Name:" + s_Last);
								pw.println("User Name:" + s_User);
								pw.println("Email:" + s_Email);
								pw.println("Adress:" + s_Adress);
								pw.println("password:" + s_pass);								
								pw.println("=============================");
								
								pw.close();
								JOptionPane.showMessageDialog(null, "Successfully Registered !", "Information", JOptionPane.INFORMATION_MESSAGE);
								new Login();
								frame.setVisible(false);
								
								}
								
								
								catch (Exception ex)
								{
								System.out.print(ex);
								}
								
								
								}
								}
								}	 
								});
								
								
								
								frame.setSize(1000, 800);
								frame.setLocationRelativeTo(null);//to center screen gui
								frame.setResizable(false);
								frame.setLayout (null);
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
								frame.getContentPane();
								frame.setVisible (true); 
								
								}
								
								public static void main(String[] args) {  
								
								new SignUp();
								} 
								
								}																																																								