import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class Home implements ActionListener {
	
    private JButton b1;
    private JButton exBtn;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JFrame frame;
    private ImageIcon icon;
	private Timer timer;
    private String[] texts = {"Hungry Naki ?", "Game Night ?", "Working Late ?"};
    private int index = 0;
	
    public Home() {
        frame = new JFrame("Hungry-Naki");
		b1 = new JButton("Order Food");
        l2 = new JLabel(texts[0]);
        l3 = new JLabel("Order Online From Your Favorite Nearby Restaurants");
        l4 = new JLabel("Having Issues? Call Us 16753");
        exBtn = new JButton("Exit");
		JLabel icon1 = new JLabel(new ImageIcon("icon1.png"));
        JLabel cover = new JLabel(new ImageIcon("image.jpg"));
        icon = new ImageIcon("icon2.png");
		
        frame.setIconImage(icon.getImage());
		
       // l2.setForeground(Color.WHITE);		
        l3.setForeground(new Color(251, 252, 252));
        l4.setForeground(new Color(251, 252, 252));
		
        l3.setFont(new Font("Times New Roman", Font.BOLD, 35));
        l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
        b1.setBounds(300, 450, 100, 30);
        exBtn.setBounds(600, 450, 100, 30);
		icon1.setBounds(450, 650, 100, 67);
		cover.setBounds(0, 0, 1000, 800);
	    l2.setBounds(320, 150, 500, 200);
		l3.setBounds(110, 150, 1000, 400);
		l4.setBounds(350, 450, 800, 300);
		
		
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
        b1.setBorder(null);
        exBtn.setBorder(null);
        b1.setFocusPainted(false);
		
        b1.addActionListener(this);
        exBtn.addActionListener((event) -> System.exit(0));
		
        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Color c = b1.getBackground();
                b1.setBackground(new Color(0, 102, 0));
                b1.setForeground(c);
			}
			
            public void mouseExited(MouseEvent evt) {
                Color c = b1.getBackground();
                b1.setBackground(b1.getForeground());
                b1.setForeground(c);
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
		
		frame.add(b1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(icon1);
		frame.add(exBtn);
		frame.add(cover);
		
		
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		l2.setFont(new Font("Times New Roman", Font.BOLD, 60));
		l2.setForeground(new Color(251, 252, 252));
		
		
		timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				index = (index + 1) % texts.length;
				l2.setText(texts[index]);
			}
		});
		index=0;
		timer.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
		
            new Login();
			frame.setVisible(false);
            
		}
	}
	
	public static void main(String[] args) 
	{
		new Home();
	}
}
