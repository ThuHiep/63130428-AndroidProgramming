package ntu.dtthiep63130428;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class BMI_manhinhinput {

	private JFrame frame;
	private JTextField txtweight;
	private JTextField txtheight;
	private JButton btnreset;
	private JButton btnExit;
	    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI_manhinhinput window = new BMI_manhinhinput();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BMI_manhinhinput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1001, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 128, 128));
		Image img1 = new ImageIcon(this.getClass().getResource("/BMI.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(10, 10, 977, 515);
		frame.getContentPane().add(lblNewLabel);
		
		txtweight = new JTextField();
		txtweight.setBounds(455, 193, 115, 38);
		frame.getContentPane().add(txtweight);
		txtweight.setColumns(10);
		
		txtheight = new JTextField();
		txtheight.setBounds(455, 306, 115, 38);
		frame.getContentPane().add(txtheight);
		txtheight.setColumns(10);
		
		JButton btncheck = new JButton("CHECK");
		btncheck.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String weightText = txtweight.getText();
		        String heightText = txtheight.getText();
		        if (!weightText.isEmpty() && !heightText.isEmpty()) {
		            try {
		                double weight = Double.parseDouble(weightText);
		                double height = Double.parseDouble(heightText);		        
		                if (weight > 0 && height > 0) {
		                	frame.setVisible(false);
		        			BMI_manhinhketqua f = new BMI_manhinhketqua();
		        			f.setVisible(true);
		       
		                } else {
		                    JOptionPane.showMessageDialog(frame, "Invalid weight or height.");
		                }
		            } catch (NumberFormatException ex) {
		                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(frame, "Please enter weight and height.");
		        }
			}
		});

		btncheck.setFont(new Font("Tahoma", Font.BOLD, 20));
		btncheck.setBackground(new Color(255, 128, 128));
		btncheck.setBounds(448, 391, 134, 54);
		frame.getContentPane().add(btncheck);
		
		btnreset = new JButton("RESET");
		btnreset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnreset.setBackground(new Color(255, 128, 128));
		btnreset.setBounds(266, 391, 134, 54);
		frame.getContentPane().add(btnreset);
		
		btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 128, 128));
		btnExit.setBounds(630, 391, 134, 54);
		frame.getContentPane().add(btnExit);
		

   
        
	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
