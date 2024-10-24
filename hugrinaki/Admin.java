 
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
import java.lang.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Admin implements ActionListener{  
	private JButton lgnBtn;
    JFrame frame;
    private JButton signBtn;
    private JButton exBtn;
    private JLabel lusn;
    private JLabel lpass;
    private JLabel atitle;
    private JLabel l1;
    private JLabel l2;
	private JPanel Panel1;
	private JPanel Panel2 ;
	private JTextField uname;
    private JPasswordField upass;
	private JButton back;
	private ImageIcon icon;
	 
	public Admin()
	{
		frame = new JFrame("Admin");
		lgnBtn = new JButton("Login");
		signBtn = new JButton("Sign Up");
		exBtn = new JButton("Exit");
		lusn = new JLabel("Username");
		lpass = new JLabel("Password");
		l1 = new JLabel("WELCOME");
		l2 = new JLabel("ADMIN");
		uname = new JTextField();
		upass = new JPasswordField();
		atitle = new JLabel();
		atitle.setText("Admin Login");
		back=new JButton("Back");
		icon = new ImageIcon("icon2.png");
		frame.setIconImage(icon.getImage());
		
		atitle.setForeground(new Color(93, 173, 226));
		lusn.setForeground(new Color(93, 173, 226));
		lpass.setForeground(new Color(93, 173, 226));
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		
		// Create the two new panels
		Panel2 = new JPanel();
		Panel2.setBackground(new Color(93, 173, 226));
		
		
        lgnBtn.setBounds (190, 420, 100, 30);
        signBtn.setBounds (780, 420, 100, 30);
        exBtn.setBounds (820, 720, 140, 30);
        back.setBounds (30, 720, 140, 30);
		lusn.setBounds (190, 220, 100, 25);
        lpass.setBounds (190, 300, 100, 25);
		atitle.setBounds(150,150,200,50);
        uname.setBounds (190, 260, 100, 25);
        upass.setBounds (190, 330, 100, 25);
        l1.setBounds (550, 200, 400, 85);
        l2.setBounds (600, 350, 300, 85);
		Panel2.setBounds(500,0,800,800);
		
		lgnBtn.setBorder(null);
		signBtn.setBorder(null);
		uname.setBorder(null);
		upass.setBorder(null);
		exBtn.setBorder(null);
		back.setBorder(null);
		
		atitle.setFont(new Font("Times New Roman",Font.BOLD,30));
		lusn.setFont(new Font("Times New Roman",Font.PLAIN,20));
		lpass.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l1.setFont(new Font("Times New Roman",Font.BOLD,70));
		l2.setFont(new Font("Times New Roman",Font.BOLD,70));
		
		
		
		lgnBtn.addActionListener(this);
		
		
		back.addMouseListener(new MouseAdapter()
			{
				//Override
				public void mouseClicked(MouseEvent e)
				{
					new Login();
					frame.setVisible(false);
				}
			});
			
			
			
			frame.add (lgnBtn);
			frame.add (exBtn);
			frame.add (lusn);
			frame.add (lpass);
			frame.add (atitle);
			frame.add (uname);
			frame.add (upass);
			frame.add(back);
			frame.add(l1);
			frame.add(l2);
			
			frame.add(Panel2);
			
			
			
			lgnBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			signBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
			
			
			
			lgnBtn.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					Color c = lgnBtn.getBackground(); // When the mouse moves over a label, the background color changed.
					lgnBtn.setBackground(new Color(54, 143, 237));
					lgnBtn.setForeground(c);
				}
				public void mouseExited(MouseEvent evt) {
					Color c = lgnBtn.getBackground();
					lgnBtn.setBackground(lgnBtn.getForeground());
					lgnBtn.setForeground(c);
				}    
			});
			
			
			back.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					Color c = back.getBackground(); // When the mouse moves over a label, the background color changed.
					back.setBackground(new Color(93, 173, 226));
					back.setForeground(c);
				}
				public void mouseExited(MouseEvent evt) {
					Color c = back.getBackground();
					back.setBackground(back.getForeground());
					back.setForeground(c);
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
			
			
			
			lgnBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					new AdminDash();
				}
			});   
			
			exBtn.addActionListener((event) -> System.exit(0));
			
			
			frame.setSize(1000, 800);
			frame.setLocationRelativeTo(null);//to center screen gui
			frame.setResizable(false);
			frame.setLayout (null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			frame.getContentPane();
			frame.setVisible (true); 
	}         
    public void actionPerformed(ActionEvent e) {  
		
        if(e.getSource()==lgnBtn)
		{  
			String user = uname.getText();
			String pass = upass.getText();
			
			if(user.equals("Mazid") && pass.equals("1234"))
			{
				
				
				frame.setVisible(false);
				
			}
			
			else if(user.equals("Arman") && pass.equals("1234"))
			{
				frame.setVisible(false);
			}
			
			
			else
			{
				showMessageDialog(null, "Invalid Username or password!");
			}
			
			
			
		}  
	}  
	
	
	public static void main(String[] args) {  
		
		new Admin();
	} 
	
	
	
} 		