package ntu.dtthiep63130428;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class BMI_manhinhketqua extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtbmi;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI_manhinhketqua frame = new BMI_manhinhketqua(23.5);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BMI_manhinhketqua(double bmi) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOUR BMI");
		lblNewLabel.setForeground(new Color(73, 37, 37));
		lblNewLabel.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 30));
		lblNewLabel.setBounds(307, 26, 167, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image user = new ImageIcon(this.getClass().getResource("/user1.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(user));
		lblNewLabel_1.setBounds(509, 37, 263, 412);
		contentPane.add(lblNewLabel_1);
		
		txtbmi = new JTextField();
		txtbmi.setText(String.format("%.2f", bmi));
		txtbmi.setEditable(false);
		txtbmi.setFont(new Font("#9Slide01 Tieu de ngan", Font.PLAIN, 40));
		txtbmi.setBounds(127, 142, 198, 103);
		contentPane.add(txtbmi);
		txtbmi.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Your advice:");
		lblNewLabel_2.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 331, 125, 41);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("#9Slide02 Noi dung dai", Font.PLAIN, 20));
		textField_1.setBounds(163, 322, 297, 68);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
	}
}
