import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JSplitPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aktif_Donem extends JFrame {

	private JPanel contentPane;
	private JTextField txt_aktif_donem;
	private JTextField txt_arama;
	
	static Connection myConn;
	DefaultListModel<Donem> dnm = new DefaultListModel<>(); 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aktif_Donem frame = new Aktif_Donem();
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
	public Aktif_Donem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Aktif D\u00F6nem:");
		splitPane.setLeftComponent(lblNewLabel);
		
		txt_aktif_donem = new JTextField();
		txt_aktif_donem.setEditable(false);
		splitPane.setRightComponent(txt_aktif_donem);
		txt_aktif_donem.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("D\u00F6nem:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(15, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txt_arama = new JTextField();
		GridBagConstraints gbc_txt_arama = new GridBagConstraints();
		gbc_txt_arama.insets = new Insets(15, 0, 5, 5);
		gbc_txt_arama.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_arama.gridx = 2;
		gbc_txt_arama.gridy = 2;
		panel.add(txt_arama, gbc_txt_arama);
		txt_arama.setColumns(10);
		
		JButton btnarama = new JButton("Bul");
		btnarama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				donem_arama_yap();
			}
		});
		GridBagConstraints gbc_btnarama = new GridBagConstraints();
		gbc_btnarama.insets = new Insets(15, 0, 5, 5);
		gbc_btnarama.gridx = 3;
		gbc_btnarama.gridy = 2;
		panel.add(btnarama, gbc_btnarama);
		
		 
		
		JList myList = new JList(dnm);
		GridBagConstraints gbc_myList = new GridBagConstraints();
		gbc_myList.insets = new Insets(0, 0, 5, 5);
		gbc_myList.fill = GridBagConstraints.BOTH;
		gbc_myList.gridx = 2;
		gbc_myList.gridy = 3;
		panel.add(myList, gbc_myList);
		
		JButton btn_aktif_donem = new JButton("Aktif D\u00F6nem Yap");
		btn_aktif_donem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!myList.isSelectionEmpty()) {
					Donem donem=(Donem) myList.getSelectedValue();					
					aktif_donem_guncelle(donem.getId());
				}
			}
		});
		contentPane.add(btn_aktif_donem, BorderLayout.SOUTH);
		
		
		String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		
		
		try {
			myConn = DriverManager.getConnection(dbUrl,"java","java");
			System.out.println("Baglanti basarili.");
			
		} catch (SQLException e) {
			System.out.println("Baglanti hatasý.");
		}
		
		aktif_donem_getir();
		
	}
		
		
	public void aktif_donem_getir() {
		
		
		Donem donem=new Donem(12, "aktif dönem bulunamadý");
		Statement stmt;
		try {
			
			stmt = myConn.createStatement();
			ResultSet rs=stmt.executeQuery("Select d.donem_id, d.donem_adi "
					+ "from donem d, aktif_donem akd"
					+ " where d.donem_id=akd.donem_id");
			while(rs.next()) {
				donem=new Donem(rs.getInt(1), rs.getString(2));						
			}
			
					
			txt_aktif_donem.setText(donem.getAd());
		
		} catch (SQLException e) {
			System.out.println("hata oluþtu.");
		}
	}
	public void donem_arama_yap() {
		String aranan=txt_arama.getText();
		
		Donem donem=new Donem(12, "aktif dönem bulunamadý");
		Statement stmt;
		try {
			dnm.clear();
			stmt = myConn.createStatement();
			ResultSet rs=stmt.executeQuery("Select d.donem_id, d.donem_adi from donem d"
					+ " where d.donem_adi LIKE '%"+aranan+"%' order by d.donem_id");
			while(rs.next()) {
				donem=new Donem(rs.getInt(1), rs.getString(2));	
				dnm.addElement(donem);				
			}			
		
		} catch (SQLException e) {
			System.out.println("hata oluþtu.");
		}
		
		
	}
	public void aktif_donem_guncelle(int id) {
		
		
		
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			int rs=stmt.executeUpdate("Update aktif_donem "
					+ "set donem_id = "+id);
			
			aktif_donem_getir();
					
			
		
		} catch (SQLException e) {
			System.out.println("hata oluþtu.");
		}
	}
	
	
}
