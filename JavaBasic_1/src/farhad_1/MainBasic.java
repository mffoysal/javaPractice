package farhad_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class MainBasic extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBasic frame = new MainBasic();
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
	public MainBasic() {
		setBackground(new Color(0, 64, 128));
		setForeground(new Color(0, 128, 192));
		setTitle("Farhad Foysal First Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setForeground(new Color(0, 128, 192));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MF Member Form");
		lblNewLabel.setForeground(new Color(173, 216, 230));
		lblNewLabel.setBounds(165, 0, 152, 35);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(10, 46, 200, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(224, 46, 200, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(100, 237, 248, 23);
		contentPane.add(btnNewButton);
		
		table_1 = new JTable();
		table_1.setCellSelectionEnabled(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setBounds(10, 77, 414, 160);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setBounds(10, 30, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone :");
		lblNewLabel_2.setBounds(224, 30, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
