 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pizza2 extends JFrame 
{
	private  JFrame frame;
	private  JButton back;
	private  JButton exBtn;
	private  JButton buy;
	private  JLabel name;
	private  JLabel name1;
	private  JLabel text1;
	private  JLabel text2;
	private  JLabel text3;
	private JCheckBox[] toppings;
	private ImageIcon icon;
	private JLabel sizeLabel, quantityLabel, priceLabel;
    private JComboBox<String> sizeComboBox, quantityComboBox;
    private JButton calculateButton;	
    private String[] sizeOptions = {"Small(Tk.450)", "Medium(Tk.750)", "Large(Tk.1050)"};
    private String[] quantityOptions = {"1", "2", "3", "4", "5"};
	
	
	Pizza2()
	{
		frame=new JFrame("Hungry Naki");
		back=new JButton("<<Back");
		exBtn = new JButton("Exit");
		name =new JLabel("Mexicano Beef Pizza");
		buy =new JButton("Buy");		
		text1=new JLabel("Topped With Tomato,Capsicum,Italian Sauce,Cheese.");
		text2=new JLabel("Select Your Variant : ");
		text3=new JLabel("Select Your Extra Toppings : ");		
		JLabel piz1 = new JLabel(new ImageIcon("piz1back.jpg"));
        JLabel pizza1 = new JLabel(new ImageIcon("pizza2.jpg"));
		icon = new ImageIcon("icon2.png");
		sizeLabel = new JLabel("Size:");
        sizeComboBox = new JComboBox<>(sizeOptions);		
        quantityLabel = new JLabel("Select Your Quantity :");
        quantityComboBox = new JComboBox<>(quantityOptions);		
        calculateButton = new JButton("Calculate Price");
		priceLabel = new JLabel("");
		
		
        frame.setIconImage(icon.getImage());
		
		
		
		piz1.setBounds(0, 0, 1000, 800);
		pizza1.setBounds(0, 0, 400, 800);
		back.setBounds(50,720,80,30);
		exBtn.setBounds(840, 720, 100, 30);
		name.setBounds(500, -150, 400, 400);
		buy.setBounds(630, 640, 140, 30);
		text1.setBounds(500, -170, 500, 500);
		text2.setBounds(500, -30, 300, 300);
		text3.setBounds(500, 80, 320, 300);
		sizeLabel.setBounds(400, 200, 100, 30);
		sizeComboBox.setBounds(500, 165, 120, 30);
		quantityLabel.setBounds(500, 420, 250, 80);
		quantityComboBox.setBounds(500, 490, 100, 30);
		calculateButton.setBounds(500, 550, 140, 30);
		priceLabel.setBounds(740, 555, 200, 30);
		
		
		Font f1 = new Font("Times New Roman", Font.BOLD, 30);
		Font f2 = new Font("Times New Roman", Font.PLAIN, 20);
		Font f3 = new Font("Times New Roman", Font.BOLD, 25);
		
		
		name.setFont(f1);
		text1.setFont(f2);
		text2.setFont(f3);
		text3.setFont(f3);
		quantityLabel.setFont(f3);
		priceLabel.setFont(f3);
		
		name.setForeground(new Color(192,192,192));
		text1.setForeground(new Color(192,192,192));
		text2.setForeground(new Color(192,192,192));
		text3.setForeground(new Color(192,192,192));
		quantityLabel.setForeground(new Color(192,192,192));
		priceLabel.setForeground(new Color(241, 196, 15 ));
		
		
		// Create the checkboxes and add them to an array
        toppings = new JCheckBox[4];
        toppings[0] = new JCheckBox("Beef");
        toppings[1] = new JCheckBox("Cheese");
        toppings[2] = new JCheckBox("Tomato");
        toppings[3] = new JCheckBox("Onions");
		
		
        // Set the positions of the checkboxes
        toppings[0].setBounds(500, 270, 100, 30);
        toppings[1].setBounds(500, 310, 100, 30);
        toppings[2].setBounds(500, 350, 100, 30);
        toppings[3].setBounds(500, 390, 100, 30);
		
		
        // Add event listeners to the checkboxes
        for (JCheckBox topping : toppings) {
            topping.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    
				}
			});
		}
		
		
		
		buy.setEnabled(false);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve the selected values from the JComboBoxes
                String selectedSize = (String) sizeComboBox.getSelectedItem();
                String selectedQuantity = (String) quantityComboBox.getSelectedItem();
				
                // Calculate the price based on the selected values
                double price = getPrice(selectedSize, selectedQuantity);
				
                // Display the calculated price in the priceLabel
                priceLabel.setText(String.format("Price: Tk.%.2f", price));
				// Enable the "Buy" button
				buy.setEnabled(true);
				
				
			}
		});
		
		
		
		exBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		
		
		calculateButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = calculateButton.getBackground(); // When the mouse moves over a label, the background color changed.
			calculateButton.setBackground(new Color(202, 218, 6 ));
			calculateButton.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = calculateButton.getBackground();
				calculateButton.setBackground(calculateButton.getForeground());
				calculateButton.setForeground(c);
			}    
		});
		
		
		
		
			buy.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Color c = buy.getBackground(); // When the mouse moves over a label, the background color changed.
				buy.setBackground(new Color(7, 154, 69));
				buy.setForeground(c);
			}
			public void mouseExited(MouseEvent evt) {
				Color c = buy.getBackground();
				buy.setBackground(buy.getForeground());
				buy.setForeground(c);
			}    
		});
		
		
		
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new PizzaTong();
			}
		}); 
		
		
		buy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Buy();
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
        calculateButton.setBorder(null);		 
        buy.setBorder(null);		 
		
		for (JCheckBox topping : toppings) {
			frame.add(topping);
		}
		
		
		frame.add(back);
		frame.add(exBtn);
		frame.add(pizza1);
		frame.add(name);
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
        frame.add(sizeComboBox);
        frame.add(quantityLabel);
        frame.add(quantityComboBox);
        frame.add(calculateButton);
		frame. add(new JLabel(""));
        frame.add(priceLabel);
        frame.add(buy);
		frame.add(piz1);
		
		
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	
	private double getPrice(String size, String quantity) {
		// Implement your price calculation logic here
		// For example, you could use a switch statement to determine the price based on the size
		double price = 0.0;
		switch (size) {
			case "Small(Tk.450)":
			price = 450.0;
			break;
			case "Medium(Tk.750)":
			price = 750.0;
			break;
			case "Large(Tk.1050)":
			price = 1050.0;
			break;
		}
		
		// Multiply the price by the quantity
		price *= Integer.parseInt(quantity);
		
		return price;
	}
	
	
	public static void main(String[] args)
	{
		new Pizza2();
	}
}

















