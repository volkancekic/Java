import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Menu extends JFrame {

	private JPanel contentPane;
	JComboBox comboBox = new JComboBox();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 7;
		gbc_comboBox.gridy = 1;
		panel.add(comboBox, gbc_comboBox);
		
		comboBox.addItem("Ogrenci Iþlemleri");
		comboBox.addItem("*** Iþlemleri");
		
		JButton btn_secim = new JButton("Se\u00E7ime Git");
		btn_secim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Ogrenci Iþlemleri")) {
				Ogretmen_Frame ogr=new Ogretmen_Frame();
				ogr.setVisible(true);
				setVisible(false);
				}else if(comboBox.getSelectedItem().equals("*** Iþlemleri")) {
					New_Frame nf=new New_Frame();
					nf.setVisible(true);
					setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_btn_secim = new GridBagConstraints();
		gbc_btn_secim.insets = new Insets(35, 0, 5, 0);
		gbc_btn_secim.gridx = 7;
		gbc_btn_secim.gridy = 2;
		panel.add(btn_secim, gbc_btn_secim);
		
		JButton btn_cikis = new JButton("\u00C7\u0131k\u0131\u015F");
		btn_cikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btn_cikis = new GridBagConstraints();
		gbc_btn_cikis.insets = new Insets(25, 0, 5, 0);
		gbc_btn_cikis.gridx = 7;
		gbc_btn_cikis.gridy = 3;
		panel.add(btn_cikis, gbc_btn_cikis);
	}

}
