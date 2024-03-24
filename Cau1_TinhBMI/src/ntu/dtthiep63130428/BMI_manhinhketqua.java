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
	private JTextField txtkhuyen;
	private JTextField txtthongbao;

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
		lblNewLabel.setForeground(new Color(192, 121, 200));
		lblNewLabel.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 40));
		lblNewLabel.setBounds(273, 22, 226, 55);
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
		txtbmi.setBounds(43, 118, 118, 113);
		contentPane.add(txtbmi);
		txtbmi.setColumns(10);
		
		txtkhuyen = new JTextField();
		txtkhuyen.setFont(new Font("#9Slide02 Noi dung dai", Font.PLAIN, 18));
		txtkhuyen.setBounds(171, 332, 301, 65);
		contentPane.add(txtkhuyen);
		txtkhuyen.setColumns(10);
		
		txtthongbao = new JTextField();
		txtthongbao.setFont(new Font("#9Slide01 Noi dung ngan", Font.BOLD, 30));
		if (bmi < 18.5) {
            txtthongbao.setText("Thiếu cân");
            txtkhuyen.setText("Hãy tăng cân một cách lành mạnh.");
            
        } else if (bmi >= 18.5 && bmi < 24.9) {
        	 txtthongbao.setText("Cân đối");
        	 txtkhuyen.setText("Hãy duy trì chế độ ăn uống và luyện tập thể dục.");
        } else if (bmi >= 25 && bmi < 29.9) {
        	 txtthongbao.setText("Thừa cân");
        	 txtkhuyen.setText("Hãy giảm cân một cách cẩn thận và lành mạnh.");
        } else if (bmi >= 30 && bmi < 34.9) {
        	 txtthongbao.setText("Béo phì");
  
        	 txtkhuyen.setText(" Hãy tập thể dục thường xuyên và ăn uống cân đối.");
        } else {
        	 txtthongbao.setText("Béo phì nguy hiểm");
        
        	 txtkhuyen.setText("Hãy tìm kiếm sự giúp đỡ y tế ngay lập tức.");
        }
		txtthongbao.setBounds(295, 149, 177, 65);
		contentPane.add(txtthongbao);
		txtthongbao.setColumns(10);
		
		JLabel lb3 = new JLabel("");
		Image muiten = new ImageIcon(this.getClass().getResource("/muiten.jpg")).getImage();
		lb3.setIcon(new ImageIcon(muiten));
		lb3.setBounds(171, 159, 118, 55);
		contentPane.add(lb3);
		
		JLabel lbthu = new JLabel("");
		Image thu = new ImageIcon(this.getClass().getResource("/thu.jpg")).getImage();
		lbthu.setIcon(new ImageIcon(thu));
		lbthu.setBounds(43, 284, 105, 113);
		contentPane.add(lbthu);
		
		
		
	}
}
