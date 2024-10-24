import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class DashBoard extends JFrame {
    private JButton exBtn;
    private JButton back;
    private JButton search;
    private JTextField fsearch;
    private JLabel text;
    private JLabel restn1;
    private JLabel restn2;
    private JLabel restn3;
    private JLabel restn4;
    private JLabel restn1tex1;
    private JLabel restn1tex2;
    private JLabel restn1tex3;
    private JLabel restn1tex4;
    private JLabel restn2tex1;
    private JLabel restn2tex2;
    private JLabel restn2tex3;
    private JLabel restn2tex4;
    private JLabel restn3tex1;
    private JLabel restn3tex2;
    private JLabel restn3tex3;
    private JLabel restn3tex4;
    private JLabel restn3tex5;
    private JLabel restn4tex1;
    private JLabel restn4tex2;
    private JLabel restn4tex3;
    private JLabel restn4tex4;
    private JLabel restn4tex5;
	private ImageIcon icon;
    
	
    public DashBoard() {
        JFrame frame = new JFrame("Hugry-Naki");
		JLabel irest1 = new JLabel(new ImageIcon("rest1.jpg"));
        JLabel irest2 = new JLabel(new ImageIcon("rest2.jpg"));
		JLabel irest3 = new JLabel(new ImageIcon("rest3.jpg"));
        JLabel irest4 = new JLabel(new ImageIcon("rest4.jpg"));
		JLabel background1 = new JLabel(new ImageIcon("image3.jpg"));
        
        restn1=new JLabel("Pizza Tong");
        restn2=new JLabel("Kacchi Vai");
        restn3=new JLabel("Backyard Kitchen");
        restn4=new JLabel("Orix");
		restn1tex1=new JLabel("4 **** (172) . Pizza");
		restn1tex2 =new JLabel("Vodrar Mor. In Vodra Bus Stand");
		restn1tex3=new JLabel("Dine In. Drive Through");
		restn1tex4=new JLabel("Contact No: 017********");
		restn2tex1=new JLabel("5 ***** (683) . Restaurant");
		restn2tex2=new JLabel("Sohidullah Tower 02, 5th Floor");
		restn2tex3=new JLabel("Dine IN. Drive-Through");
		restn2tex4=new JLabel("Contact No: 013********");
		restn3tex1=new JLabel("3 ***(501). Pizza . Burger");
		restn3tex2=new JLabel("Sagorpara Bottola,Char Rasta");
		restn3tex3=new JLabel("Closed");
		restn3tex4=new JLabel(". Opens 12 PM Friday");
		restn3tex5=new JLabel("Contact No: 019*******");
		restn4tex1=new JLabel("5 *****(420) . Chinese");
		restn4tex2=new JLabel("9J95+MW4, Unnamed Road");
		restn4tex3=new JLabel("Closed");
		restn4tex4=new JLabel(". Opens 12 PM Friday");
		restn4tex5=new JLabel("No Contact Number");
	    exBtn = new JButton("Exit");
        back = new JButton("Sign Out");
        text = new JLabel("Restaurants Near You : ");
		fsearch=new JTextField();
		search=new JButton("Search");
		icon = new ImageIcon("icon2.png");
		frame.setIconImage(icon.getImage());
		
		
		Font f1 = new Font("Times New Roman", Font.BOLD, 30);
		Font f2 = new Font("Times New Roman", Font.BOLD, 25);
		Font f3 = new Font("Arial", Font.PLAIN, 15);
		
		
		text.setFont(f1);
		restn1.setFont(f2);
		restn1tex1.setFont(f3);
		restn1tex2.setFont(f3);
		restn1tex3.setFont(f3);
		restn1tex4.setFont(f3);
		restn2.setFont(f2);
		restn2tex1.setFont(f3);
		restn2tex2.setFont(f3);
		restn2tex3.setFont(f3);
		restn2tex4.setFont(f3);
		restn3.setFont(f2);
		restn3tex1.setFont(f3);
		restn3tex2.setFont(f3);
		restn3tex3.setFont(f3);
		restn3tex4.setFont(f3);
		restn3tex5.setFont(f3);
		restn4.setFont(f2);
		restn4tex1.setFont(f3);
		restn4tex2.setFont(f3);
		restn4tex3.setFont(f3);
		restn4tex4.setFont(f3);
		restn4tex5.setFont(f3);
		
		
		
		text.setForeground(Color.WHITE);
		restn1.setForeground(Color.WHITE);
		restn1tex1.setForeground(Color.WHITE);
		restn1tex2.setForeground(Color.WHITE);
		restn1tex3.setForeground(Color.WHITE);
		restn1tex4.setForeground(Color.WHITE);
		restn2.setForeground(Color.WHITE);
		restn2tex1.setForeground(Color.WHITE);
		restn2tex2.setForeground(Color.WHITE);
		restn2tex3.setForeground(Color.WHITE);
		restn2tex4.setForeground(Color.WHITE);
		restn3.setForeground(Color.WHITE);
		restn3tex1.setForeground(Color.WHITE);
		restn3tex2.setForeground(Color.WHITE);
		restn3tex3.setForeground(Color.RED);
		restn3tex4.setForeground(Color.WHITE);
		restn3tex5.setForeground(Color.WHITE);
		restn4.setForeground(Color.WHITE);
		restn4tex1.setForeground(Color.WHITE);
		restn4tex2.setForeground(Color.WHITE);
		restn4tex3.setForeground(Color.RED);
		restn4tex4.setForeground(Color.WHITE);
		restn4tex5.setForeground(Color.WHITE);
		
		
		irest1.setBounds(300, 160, 112,112);
		irest2.setBounds(770, 160, 112,112);
		irest3.setBounds(300, 450, 112,112);
		irest4.setBounds(775, 450, 112,112); 
		background1.setBounds(0, 0, 1000,800);
        exBtn.setBounds(860, 710, 100, 30);
		text.setBounds(30, -90, 550, 300);
        back.setBounds(30, 710, 100, 30);
        restn1.setBounds(60, 25, 400, 300);
        restn1tex1.setBounds(60, -45, 400, 500);
        restn1tex2.setBounds(60, -25, 400, 500);
        restn1tex3.setBounds(60, -5, 400, 500);
        restn1tex4.setBounds(60, 20, 400, 500);
		restn2.setBounds(550, 70, 200, 200);
        restn2tex1.setBounds(550, 92, 200, 200);
        restn2tex2.setBounds(550, 110, 200, 200);
        restn2tex3.setBounds(550, 130, 200, 200);
        restn2tex4.setBounds(550, 150, 200, 200);
		restn3.setBounds(60,300 , 400, 300);
        restn3tex1.setBounds(60, 230, 400, 500);
        restn3tex2.setBounds(60, 250, 400, 500);
        restn3tex3.setBounds(60, 270, 400, 500);
        restn3tex4.setBounds(110, 270, 400, 500);
        restn3tex5.setBounds(60, 290, 400, 500);		
		restn4.setBounds(550,300 , 400, 300);
		restn4tex1.setBounds(550, 230, 400, 500);
		restn4tex2.setBounds(550, 250, 400, 500);
		restn4tex3.setBounds(550, 270, 400, 500);
		restn4tex4.setBounds(600, 270, 400, 500);
		restn4tex5.setBounds(550, 290, 400, 500);
		fsearch.setBounds(650, 60, 120, 30);
		search.setBounds(770, 60, 80, 30);
        
        exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        restn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        restn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        restn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        restn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        irest1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        irest2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        irest3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        irest4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
        exBtn.addActionListener((event) -> System.exit(0));
		
        back.setBorder(null);
        exBtn.setBorder(null);
        fsearch.setBorder(null);
        search.setBorder(null);
		
		
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Login();
			}
		}); 
		
		
		restn1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				new PizzaTong();
				frame.setVisible(false);
			}
		}); 
		
		
		restn2.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				new HungryHero();
				frame.setVisible(false); 
			}
		});
		
		restn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Restaurant is closed !");
			}
		});		
		
		restn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Restaurant is closed !");
			}
		});
		
		
		
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
		
		
		search.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = search.getBackground(); // When the mouse moves over a label, the background color changed.
				search.setBackground(new Color(7, 154, 69));
				search.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = search.getBackground();
				search.setBackground(search.getForeground());
			    search.setForeground(c);
			}    
		});
		
		
		restn1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = restn1.getBackground(); // When the mouse moves over a label, the background color changed.
				
				restn1.setForeground(Color.YELLOW);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =restn1.getBackground();
				
				restn1.setForeground(c);
			}    
		});
		
		
		restn2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = restn2.getBackground(); // When the mouse moves over a label, the background color changed.
				
				restn2.setForeground(Color.YELLOW);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =restn2.getBackground();
				
				restn2.setForeground(c);
			}    
		});
		
		
		restn3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = restn3.getBackground(); // When the mouse moves over a label, the background color changed.
				
				restn3.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =restn3.getBackground();
				
				restn3.setForeground(c);
			}    
		});
		
		
		restn4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = restn4.getBackground(); // When the mouse moves over a label, the background color changed.
				
				restn4.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent evt) {
				Color c =restn4.getBackground();
				
				restn4.setForeground(c);
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
		
		
		
		
		
		search.addMouseListener(new MouseAdapter()
		{
			//Override
			public void mouseClicked(MouseEvent e)
			{
				String name = fsearch.getText();
				boolean nEmpty = name.isEmpty();
				String n = "Name :"+name;
				
				if(nEmpty==true)
				{
					showMessageDialog(null, "Please enter food name","Warning", JOptionPane.WARNING_MESSAGE);
				}
				
				else
				{
					boolean bname = false;
					try
					{
						FileReader fr = new FileReader(".\\Files\\food_list.txt");
						BufferedReader fbr = new BufferedReader(fr);
						
						int allLine = 0;
						while(fbr.readLine()!=null)
						{
							allLine++;
						}
						fbr.close();
						
						for(int i=0; i<allLine; i++)
						{
							String line = Files.readAllLines(Paths.get(".\\Files\\food_list.txt")).get(i);
							
							if(line.equals(n))
							{
								if(n.equals("Name :kacchi"))
								{
									bname = true;
								    new Kacci();
								    frame.setVisible(false);
								    break;
								}
								
								if(n.equals("Name :teheri"))
								{
									bname = true;
								    new Teheri();
								    frame.setVisible(false);
								    break;
								}
								
								if(n.equals("Name :polao"))
								{
									bname = true;
								    new Morog();
								    frame.setVisible(false);
								    break;
								}
								
								if(n.equals("Name :pizza"))
								{
									bname = true;
								    new Pizza1();
								    frame.setVisible(false);
								    break;
								}
								
								if(n.equals("Name :sausage pizza"))
								{
									bname = true;
								    new Pizza2();
								    frame.setVisible(false);
								    break;
								}
								
								if(n.equals("Name :bolognese pizza"))
								{
									bname = true;
								    new Pizza1();
								    frame.setVisible(false);
								    break;
								}
								
								if(n.equals("Name :biryani"))
								{
									bname = true;
								    new Morog();
								    frame.setVisible(false);
								    break;
								}
								
								if(n.equals("Name :borhani"))
								{
									
									bname = false;
								
								}
									
								else
								{
									bname = false;
									showMessageDialog(null, "Not available","Warning", JOptionPane.WARNING_MESSAGE);
								}
								
							}
							
							else
							{
								bname = false;
								//showMessageDialog(null, "Not available","Warning", JOptionPane.WARNING_MESSAGE);
								
							}
						}
						
						if(bname==false)
						{
							showMessageDialog(null, "Not available","Warning", JOptionPane.WARNING_MESSAGE);
						}
					}
					
					catch(Exception ei)
					{
						System.out.println(ei);
						//showMessageDialog(null, "Not available","Warning", JOptionPane.WARNING_MESSAGE);
								
					}
					
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		frame.add(back);
		frame.add(exBtn);
		frame.add(search);
		frame.add(fsearch);
		frame.add(text);
		frame.add(restn1);
		frame.add(restn1tex1);
		frame.add(restn1tex2);
		frame.add(restn1tex3);
		frame.add(restn1tex4);
		frame.add(restn2);
		frame.add(restn2tex1);
		frame.add(restn2tex2);
		frame.add(restn2tex3);
		frame.add(restn2tex4);
		frame.add(restn3);
		frame.add(restn3tex1);
		frame.add(restn3tex2);
		frame.add(restn3tex3);
		frame.add(restn3tex4);
		frame.add(restn3tex5);
		frame.add(restn4);
		frame.add(restn4tex1);
		frame.add(restn4tex2);
		frame.add(restn4tex3);
		frame.add(restn4tex4);
		frame.add(restn4tex5);
		frame.add(irest1);
		frame.add(irest2);
		frame.add(irest3);
		frame.add(irest4);
		frame.add(background1);
		
		
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
    public static void main(String[] args) {
		new DashBoard();
	}
}
