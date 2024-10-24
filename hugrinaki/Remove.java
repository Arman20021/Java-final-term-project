
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Remove implements ActionListener{
	
	JFrame Frame;
	private JLabel lbl;
	private JButton bremove, backbtn, exitbtn;
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scroll;
	private String[] column = { "First Name", "Last Name", "User Name", "E-mail", "Adress","PassWord"};
    private String[] rows = new String[6];
	
	public Remove()
	{
		
		Frame = new JFrame("Remove User");
		JLabel removeback = new JLabel(new ImageIcon("remove.jpg")); 
		lbl = new JLabel("REMOVE USER");
		bremove = new JButton("Remove User");
		backbtn = new JButton("Back");
		exitbtn = new JButton("Exit");
		
		
		
		lbl.setFont(new Font("Times New Roman",Font.PLAIN,35));
		bremove.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		removeback.setBounds(0,0,1000,800);
		lbl.setBounds(380,20,500,40);
		bremove.setBounds(430, 720, 200, 35);
		backbtn.setBounds(15,720,100,30);
		exitbtn.setBounds(870,720,100,30);
		
		bremove.setForeground(new Color(255,255,255));
		bremove.setBackground(new Color(0,90,156));
		lbl.setForeground(new Color(255,255,255));
		backbtn.setForeground(new Color(255,255,255));
		backbtn.setBackground(new Color(0,0,0));	
		exitbtn.setForeground(new Color(255,255,255));
		exitbtn.setBackground(new Color(0,0,0));
		
		bremove.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		
		exitbtn.addActionListener(this);
		backbtn.addActionListener(this);
		bremove.addActionListener(this);
		
		
		
		table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
		
		
        table.setModel(model);
        table.setBackground(new Color(255,255,255));
        table.setRowHeight(50);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
		
        scroll = new JScrollPane(table);
        scroll.setBounds(100, 90, 800, 600);
        Frame.add(scroll);
		
        String file = "Data\\user_data.txt";
		
        try {
			
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
			{
                totalLines++;
			}
            reader.close();
			
            for (int i = 0; i < totalLines; i++)
			{
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 5);
                if (x.equals("First"))
				{
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(11); // Username 
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(10); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(10); // Name
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(6); // Email
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(7); // Gender
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(9); // Gender
                    model.addRow(rows);
				}
			}
			
			} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		Frame.add(lbl);
		Frame.add(bremove);
		Frame.add(backbtn);
		Frame.add(exitbtn);
		Frame.add(removeback);
		
		
		
		Frame.setSize(1000,800);
		Frame.setLayout(null);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if(e.getSource()==bremove)
		{
			
			String file1 = "Data\\user_data.txt";
			String temp = "Data\\user_data_temp.txt";
			
			
			
			if (table.getSelectionModel().isSelectionEmpty())
			{
				
				JOptionPane.showMessageDialog(null, "Please select a user to remove.", "Warning!",JOptionPane.WARNING_MESSAGE);
				
			}
			
			else{
				
				String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();
				
				File oldFile = new File(file1);
                File newFile = new File(temp);
				
				int c = 0;
				
				try{
					
					BufferedReader br = new BufferedReader(new FileReader(file1));
					int totalLines = 0;
					while (br.readLine() != null)
					{
                        totalLines++;
					}
                    br.close();
					
					for (int i = 0; i < totalLines; i++)
					{
						
						String line = Files.readAllLines(Paths.get(file1)).get(i);
						String x = line.substring(0, 5);
						
						if (x.equals("First"))
						{
							//System.out.println("Worked!!");
                            String userName = Files.readAllLines(Paths.get(file1)).get(i);
							
                            if(userName.substring(11).equals(removeUser))
							{
								//System.out.println("Worked!!");
                                c = i;
							}
						}
						
					}
				}
				
				catch(IOException iox)
				{
					iox.printStackTrace();
				}
				
				
				try{
					
					//FileWriter fw = new FileWriter(temp, true);
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(temp, true)));
					BufferedReader br = new BufferedReader(new FileReader(file1));
					
					BufferedReader br1 = new BufferedReader(new FileReader(file1));
					int totalLines = 0;
					while (br1.readLine() != null)
					{
						totalLines++;
					}
					br1.close();
					
					for (int j = 0; j < totalLines; j++)
					{
						
						String line = Files.readAllLines(Paths.get(file1)).get(j);
						String x = line.substring(0, 5);
						
						//System.out.println("Worked!!");
						
						if(c != 0 && (j == c || j == (c + 1) || j==(c+2) || j==(c+3) || j==(c+4) || j==(c+5)))
						{
							//System.out.println("Worked!!");
							String userName = Files.readAllLines(Paths.get(file1)).get(j);
							pw.println("#Removed! " + userName);
							
							
							
						}
						
						else{
							
							String userName = Files.readAllLines(Paths.get(file1)).get(j);
							pw.println(userName);
							
							
						}
						
					}
					
					pw.flush();
					pw.close();
					br.close();
					br1.close();
					
				}
				
				catch (IOException iox){
					iox.printStackTrace();
				}
				
				oldFile.delete();
				File dump = new File(file1);
				newFile.renameTo(dump);
				
				Frame.setVisible(false);
				new Remove();
				
			}
			
			
		}
		
		else if(e.getSource()==backbtn)
		{
			new AdminDash();
			Frame.setVisible(false);
			
		}
		
		else if(e.getSource()==exitbtn)
		{
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {  
		
		new Remove();
	} 
	
}