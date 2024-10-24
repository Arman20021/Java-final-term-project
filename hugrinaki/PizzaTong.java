 import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PizzaTong extends JFrame
{
	private  JFrame frame;
	private  JButton back;
	private  JLabel title ;
	private  JLabel piz1tex1 ;
	private  JLabel piz1tex2;
	private  JLabel piz2tex1;
	private  JLabel piz2tex2;
	private  JLabel piz3tex1;
	private  JLabel piz3tex2;
	private  JLabel piz4tex1;
	private  JLabel piz4tex2;
	private  JLabel piz5tex1;
	private  JLabel piz5tex2;
	private  JLabel piz6tex1;
	private  JLabel piz6tex2;
	private  JLabel pantex;	
	private  JButton exBtn;
	private ImageIcon icon;
	
	
	
	PizzaTong()
	{
		frame=new JFrame("Pizza Tong");
		back=new JButton("<<Back");
		exBtn = new JButton("Exit");
		title=new JLabel("Choice Your Pizza:");
		piz1tex1=new JLabel("Bolognese Beef Pizza");
		piz1tex2=new JLabel("Tk.435");
		piz2tex1=new JLabel("Mexicano Beef Pizza");
		piz2tex2=new JLabel("Tk.409");
		piz3tex1=new JLabel("Pepperoni Pizza");
		piz3tex2=new JLabel("Tk.420");
		piz4tex1=new JLabel("BBQ Chicken Pizza");
		piz4tex2=new JLabel("Tk.450");
		piz5tex1=new JLabel("Chessy Chicken Pizza");
		piz5tex2=new JLabel("Tk.430");
		piz6tex1=new JLabel("Chicken Sausage Pizza");
		piz6tex2=new JLabel("Tk.409");
		pantex=new JLabel("OUT OF STOCK");
		JLabel cover = new JLabel(new ImageIcon("pizzBack.jpg"));		
		JLabel piz1 = new JLabel(new ImageIcon("piz1.jpg"));		
		JLabel piz2 = new JLabel(new ImageIcon("piz2.jpg"));	
		JLabel piz3 = new JLabel(new ImageIcon("piz3.jpg"));	
		JLabel piz4 = new JLabel(new ImageIcon("piz4.jpg"));	
		JLabel piz5 = new JLabel(new ImageIcon("piz5.jpg"));
		JLabel piz6 = new JLabel(new ImageIcon("piz6.jpg"));
		icon = new ImageIcon("icon2.png");
		
		
		frame.setIconImage(icon.getImage());
		
	
		Font f1 = new Font("Times New Roman", Font.BOLD, 30);
		Font f2 = new Font("Times New Roman", Font.BOLD, 25);
		Font f3 = new Font("Times New Roman", Font.BOLD, 25);
			
		
		title.setFont(f1);
		piz1tex1.setFont(f3);
		piz1tex2.setFont(f3);
		piz2tex1.setFont(f3);
		piz2tex2.setFont(f3);
		piz3tex1.setFont(f3);
		piz3tex2.setFont(f3);
		piz4tex1.setFont(f3);
		piz4tex2.setFont(f3);
		piz5tex1.setFont(f3);
		piz5tex2.setFont(f3);
		piz6tex1.setFont(f3);
		piz6tex2.setFont(f3);
		pantex.setFont(new Font("Arial", Font.BOLD, 20));
		
		
		piz1tex1.setForeground(new Color(192,192,192)); 
		piz1tex2.setForeground(new Color(192,192,192)); 
		title.setForeground(new Color(192,192,192)); 
		piz2tex1.setForeground(new Color(192,192,192));
		piz2tex2.setForeground(new Color(192,192,192));
		piz3tex1.setForeground(new Color(192,192,192));
		piz3tex2.setForeground(new Color(192,192,192));
		piz4tex1.setForeground(new Color(192,192,192));
		piz4tex2.setForeground(new Color(192,192,192));
		piz5tex1.setForeground(new Color(192,192,192));
		piz5tex2.setForeground(new Color(192,192,192));
		piz6tex1.setForeground(new Color(192,192,192));
		piz6tex2.setForeground(new Color(192,192,192));
		pantex.setForeground(Color.RED);
		
		
		back.setBounds(50,720,80,30);
		exBtn.setBounds(823, 720, 100, 30);
		title.setBounds(30,-100, 280, 280);
		cover.setBounds(0, 0, 1000, 800);
		piz1.setBounds(40, 90, 280, 280);
		piz2.setBounds(365, 90, 280, 280);
		piz3.setBounds(680,90, 280, 280);
		piz4.setBounds(40, 420, 280, 280);
		piz5.setBounds(365, 420, 280, 280);
		piz6.setBounds(680,420, 280, 280);
		piz1tex1.setBounds(40,-35, 280, 280);
		piz1tex2.setBounds(230,220 ,280, 280);
		piz2tex1.setBounds(365,-35, 280, 280);
		piz2tex2.setBounds(550,220, 280, 280);
		piz3tex1.setBounds(680,-35, 280, 280);
		piz3tex2.setBounds(840,220, 280, 280);
		piz4tex1.setBounds(40, 365, 240, 150);
		piz4tex2.setBounds(200, 550, 280, 280);
		piz5tex1.setBounds(365, 365, 240, 150);
		piz5tex2.setBounds(550, 550, 280, 280);
		piz6tex1.setBounds(680,365, 240, 150);
		piz6tex2.setBounds(850,550, 280, 280);
		
		
		
		back.setBorder(null);
		exBtn.setBorder(null);
		
		
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
		
		
		
		exBtn.addActionListener((event) -> System.exit(0));
		
		
		exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz1tex1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz2tex1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz3tex1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz4tex1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz5tex1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		piz6tex1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		piz1tex1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = piz1tex1.getBackground(); // When the mouse moves over a label, the background color changed.
				
				piz1tex1.setForeground(Color.YELLOW);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =piz1tex1.getBackground();
				
				piz1tex1.setForeground(c);
			}    
		});
		
		
		piz2tex1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = piz2tex1.getBackground(); // When the mouse moves over a label, the background color changed.
				
				piz2tex1.setForeground(Color.YELLOW);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =piz2tex1.getBackground();
				
				piz2tex1.setForeground(c);
			}    
		});
		
		
		
		piz3tex1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = piz3tex1.getBackground(); // When the mouse moves over a label, the background color changed.
				
				piz3tex1.setForeground(Color.YELLOW);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =piz3tex1.getBackground();
				
				piz3tex1.setForeground(c);
			}    
		});	
		
		
		piz6tex1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = piz6tex1.getBackground(); // When the mouse moves over a label, the background color changed.
				
				piz6tex1.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =piz6tex1.getBackground();
				
				piz6tex1.setForeground(c);
			}    
		});	
		
		
		piz4tex1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = piz4tex1.getBackground(); // When the mouse moves over a label, the background color changed.
				
				piz4tex1.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =piz4tex1.getBackground();
				
				piz4tex1.setForeground(c);
			}    
		});
		
		
		piz5tex1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = piz5tex1.getBackground(); // When the mouse moves over a label, the background color changed.
				
				piz5tex1.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =piz5tex1.getBackground();
				
				piz5tex1.setForeground(c);
			}    
		});
		
		
		
		
		
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new DashBoard();
			}
		}); 
		
		
		piz1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Pizza1();
			}
		}); 
		
		
		piz1tex1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Pizza1();
			}
		}); 	
		
		
		piz2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Pizza2();
			}
		}); 		
		piz2tex1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Pizza2();
			}
		}); 	
		
		
		piz3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Pizza3();
			}
		}); 	
		
		piz3tex1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Pizza3();
			}
		}); 	
		
		
		
		piz4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, pantex);
			}
		}); 	
		
		
		piz4tex1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, pantex);
			}
		}); 	
		
		
		
		piz5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, pantex);
			}
		}); 	
		
		
		piz5tex1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, pantex);
			}
		}); 	
		
		
		
		piz6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, pantex);
			}
		}); 
		
		
		
		piz6tex1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, pantex);
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
		
		
		frame.add(back);	
		frame.add(title);
		frame.add(piz1tex1);
		frame.add(piz1tex2);
		frame.add(piz2tex1);
		frame.add(piz2tex2);
		frame.add(piz3tex1);
		frame.add(piz3tex2);
		frame.add(piz4tex1);
		frame.add(piz4tex2);
		frame.add(piz5tex1);
		frame.add(piz5tex2);
		frame.add(piz6tex1);
		frame.add(piz6tex2);
		frame.add(exBtn);
		frame.add(piz1);
		frame.add(piz2);
		frame.add(piz3);
		frame.add(piz4);
		frame.add(piz5);
		frame.add(piz6);
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
		new PizzaTong();
	}
}
