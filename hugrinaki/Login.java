 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Login extends JFrame{  
	private JButton lgnBtn;
    private JFrame frame;
    private JLabel signlab;
    private JLabel text;
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JButton exBtn;
    private JLabel lusn;
    private JLabel lpass;
    private JLabel atitle;
    private JLabel l1;
	private JPanel Panel1;
	private JPanel Panel2 ;
	private JTextField uname;
    private JPasswordField upass;
	private ImageIcon img;
	private JLabel back;
	private JLabel admin;
    private ImageIcon icon;
	
	
	public Login()
	{
		frame = new JFrame("Sign In");
		lgnBtn = new JButton("Login");
		signlab = new JLabel("Sign Up");
		text=new JLabel("If You Don't Have Any Account? Then ");
		text1=new JLabel("Welcom Back !");
		text2=new JLabel("Please Fill Up The Form With Your Personal Details");
		exBtn = new JButton("Exit");
		lusn = new JLabel("Username");
		lpass = new JLabel("Password");
		uname = new JTextField();
		upass = new JPasswordField();
		atitle = new JLabel();
		atitle.setText("Sign In");
		back=new JLabel("<< Back");
		//img=new ImageIcon(getClass().getResource("photos/icon3.png"));
		//l1=new JLabel();
		//l1 = new JLabel(img);
		admin=new JLabel("Admin Login");
		icon = new ImageIcon("icon2.png");
		
		
		atitle.setForeground(new Color(7, 154, 69));
		lusn.setForeground(new Color(7, 154, 69));
		lpass.setForeground(new Color(7, 154, 69));
		signlab.setForeground (Color.WHITE);
		text.setForeground (Color.WHITE);
		admin.setForeground (new Color(7, 154, 69));
		back.setForeground (new Color(7, 154, 69));
		
		// Create the two new panels
		Panel2 = new JPanel();
		Panel2.setBackground(Color.WHITE);
		Panel1 = new JPanel();
		Panel1.setBackground(new Color(7, 154, 69));
		Panel1.setBounds(0,0,800,800);
		
		atitle.setFont(new Font ( "Times New Roman",Font.BOLD,40));
		text1.setFont(new Font ( "Times New Roman",Font.BOLD,70));
		text2.setFont(new Font ( "Times New Roman",Font.BOLD,17));
		signlab.setFont(new Font ( "Times New Roman",Font.BOLD,20));
		text.setFont(new Font ( "Times New Roman",Font.PLAIN,15));
		admin.setFont(new Font ( "Times New Roman",Font.BOLD,20));
		back.setFont(new Font ( "Times New Roman",Font.BOLD,20));
		lusn.setFont(new Font ( "Times New Roman",Font.BOLD,20));
		lpass.setFont(new Font ( "Times New Roman",Font.BOLD,20));
		
		
		
        lgnBtn.setBounds (710, 395, 100, 30);
        signlab.setBounds (292, 515, 100, 30);
        exBtn.setBounds (850, 730, 140, 30);
        back.setBounds (730, 500, 140, 30);
		admin.setBounds(460,730,140,30);
        lusn.setBounds (710, 220, 100, 25);
        lpass.setBounds (710, 296, 100, 25);
		atitle.setBounds(695,120,200,100);
        uname.setBounds (710, 260, 100, 25);
        upass.setBounds (710, 330, 100, 25);
        text.setBounds (50, 430, 400, 200);
        text1.setBounds (20, 20, 500, 300);
        text2.setBounds (50, 130, 400, 200);
        //l1.setBounds(70, 200, img.getIconWidth(), img.getIconHeight());
		
        frame.setIconImage(icon.getImage());
		
		uname.setBackground(new Color(213, 219, 219));
		text1.setForeground(Color.WHITE);
		text2.setForeground(Color.WHITE);
		upass.setBackground(new Color(213, 219, 219));
		uname.setFont(new Font ( "Arial",Font.BOLD,20));
		upass.setFont(new Font ( "Arial",Font.BOLD,20));
		
		
		Panel2.setBounds(450,0,800,800);
		
		lgnBtn.setBorder(null);
		
		uname.setBorder(null);
		upass.setBorder(null);
		exBtn.setBorder(null);
		back.setBorder(null);
		admin.setBorder(null);
		
		
		
		
		//lgnBtn.addActionListener(this);
		
		
		back.addMouseListener(new MouseAdapter()
			{
				//Override
				public void mouseClicked(MouseEvent e)
				{
					new Home();
					frame.setVisible(false);
				}
			});
			
			
			
			
			frame.setResizable(false);
			//add components
			frame.add (lgnBtn);
			frame.add (signlab);
			frame.add (text);
			frame.add (text1);
			frame.add (text2);
			frame.add (exBtn);
			frame.add (lusn);
			frame.add (lpass);
			frame.add (atitle);
			frame.add (uname);
			frame.add (upass);
			//frame.add(l1);
			frame.add(back);
			frame.add(admin);
			frame.add(Panel2);
			frame.add(Panel1);
			
			
			lgnBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			signlab.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			admin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			exBtn.addActionListener((event) -> System.exit(0));
			
			admin.addMouseListener(new MouseAdapter()
				{
					//Override
					public void mouseClicked(MouseEvent e)
					{
						new Admin();
						frame.setVisible(false);
					}
				});  	
				
				
				lgnBtn.addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent evt) {
						Color c = lgnBtn.getBackground(); // When the mouse moves over a label, the background color changed.
						lgnBtn.setBackground(new Color(7, 154, 69));
						lgnBtn.setForeground(c);
					}
					public void mouseExited(MouseEvent evt) {
						Color c = lgnBtn.getBackground();
						lgnBtn.setBackground(lgnBtn.getForeground());
						lgnBtn.setForeground(c);
					}    
				});
				
				
				
				
				exBtn.addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent evt) 
					{
						Color c = exBtn.getBackground();
						exBtn.setBackground(c.red);
						exBtn.setForeground(c);
					}
					public void mouseExited(MouseEvent evt) {
						Color c = exBtn.getBackground();
						exBtn.setBackground(exBtn.getForeground());
						exBtn.setForeground(c);
					}    
				});
				
				
				signlab.addMouseListener(new MouseAdapter()
					{
						//Override
						public void mouseClicked(MouseEvent e)
						{
							new SignUp();
							frame.setVisible(false);
						}
					});
					
					
					frame.setSize(1000, 800);
					frame.setLocationRelativeTo(null);//to center screen gui
					frame.setResizable(false);
					frame.setLayout (null);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
					frame.getContentPane();
					frame.setVisible (true); 
					
					
					lgnBtn.addMouseListener(new MouseAdapter()
						{
							//Override
							public void mouseClicked(MouseEvent e)
							{
								String username = uname.getText();
								String password = upass.getText();
								
								boolean uEmpty = username.isEmpty();
								boolean pEmpty = password.isEmpty();
								
								String u = "User Name: "+username;
								String p = "password : "+password;
								
								if(uEmpty==true || pEmpty==true)
								{
									showMessageDialog(null, "please fillup the information","Warning", JOptionPane.WARNING_MESSAGE);
								}
								
								else
								{
									boolean booluser = false;
									try
									{
										FileReader fr = new FileReader(".\\Data\\user_data.txt");
										BufferedReader fbr = new BufferedReader(fr);
										
										int allLine = 0;
										while(fbr.readLine()!=null)
										{
											allLine++;
										}
										fbr.close();
										
										for(int i=0; i<allLine; i++)
										{
											String line1 =Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
											if(line1.equals(u)==true)
											{
												String line2 =Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i+3);
												if(line2.equals(p))
												{
													booluser = true;
													
													new DashBoard();
													frame.setVisible(false);
													break;
												}
												
												else
												{
													booluser = false;
													//showMessageDialog(null, "Wrong password","Warning", JOptionPane.WARNING_MESSAGE);
												}
											}
											
											else
											{
												booluser = false;
												
											}
										}
										
										if(booluser==false)
										{
											showMessageDialog(null, "Wrong Username Or Password","Warning", JOptionPane.WARNING_MESSAGE);
										}
									}
									
									catch(Exception ei)
									{
										System.out.println(ei);
									}
									
									
								}
							}
						});
						
	}
	
	
	
	
	
	public static void main(String[] args) 
	{  
		
		new Login();
	} 
	
	
	
} 	