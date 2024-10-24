
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
import java.lang.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDash extends JFrame{  
	private JFrame frame;
	private  JButton back;
	private  JButton exBtn;
	private  JLabel user;
	private  JLabel remove;
	private  JLabel acti;
	private  JLabel search;
	private ImageIcon icon;
	
	AdminDash()
	{
		
		frame=new JFrame("Hungry Naki");
		back=new JButton("Sign Out");
		exBtn = new JButton("Exit");
		user=new JLabel("Add User");
		remove=new JLabel("Remove User");
		acti=new JLabel("Activity");
		search=new JLabel("Search");
		JLabel addu = new JLabel(new ImageIcon("add.png"));       
		JLabel removeu = new JLabel(new ImageIcon("remove.png"));
		JLabel actiu = new JLabel(new ImageIcon("acti.png"));
        JLabel searchu = new JLabel(new ImageIcon("search.png"));
        JLabel adminback = new JLabel(new ImageIcon("admin.jpg"));
		icon = new ImageIcon("icon2.png");
		
		Font f1 =new Font ( "Times New Roman",Font.PLAIN,25);	
		
		addu.setBounds(120, 20, 300, 300);	
		removeu.setBounds(600, 20, 300, 300);
		actiu.setBounds(120, 390, 300, 300);
		searchu.setBounds(600, 390, 300, 300);
		back.setBounds(50,720,80,30);
		exBtn.setBounds(823, 720, 100, 30);
		user.setBounds(200, 330, 100, 30);
		remove.setBounds(655, 310, 170, 60);
		acti.setBounds(230, 690, 100, 30);
		search.setBounds(700, 640, 100, 30);
		adminback.setBounds(0, 0, 1000, 800);
		user.setFont(f1);
		remove.setFont(f1);
		acti.setFont(f1);
		search.setFont(f1);
		user.setForeground(Color.WHITE);
		remove.setForeground(Color.WHITE);
		acti.setForeground(Color.WHITE);
		search.setForeground(Color.WHITE);
		
		
		
        frame.setIconImage(icon.getImage());
		
		
		
		exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		user.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		remove.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		removeu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		searchu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		acti.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		actiu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
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
		
		
		
		back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Admin();
			}
		});   		
		
		
		addu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Add();
			}
		});   	
		
		
		user.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
				new Add();
			}
			
		});   	
		
		
		remove.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new  Remove();
			    frame.setVisible(false);
			
			}
		});   		
		
		
		
		removeu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               new  Remove();
			frame.setVisible(false);
				
			}
		});   
		
		
		acti.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Working In Progress !");
			}
		});   	
		
		
		
		actiu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Working In Progress !");
			}
		});   	
		
		
		search.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Working In Progress !");
			}
		});   	
		
		
		searchu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Working In Progress !");
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
		
		
		
		frame.add(exBtn);
		frame.add(back);
		frame.add(user);
		frame.add(remove);
		frame.add(acti);
		frame.add(search);
		frame.add(addu);
		frame.add(removeu);
		frame.add(actiu);
		frame.add(searchu);
		frame.add(adminback);
		
		
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
        new AdminDash();
	}
}


