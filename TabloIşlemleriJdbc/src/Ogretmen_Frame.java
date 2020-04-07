import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Event;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JComboBox;

public class Ogretmen_Frame extends Base_Frame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JComboBox comboBox = new JComboBox();
	static Connection myConn;
	static Ogretmen ogr=new Ogretmen(0, "ad", "soyad", 123, 0, "sad", "01.01.2020");
	static int imlec=1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ogretmen_Frame frame = new Ogretmen_Frame();
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
	public Ogretmen_Frame() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Ad:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(15, 15, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(15, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblSoyad = new JLabel("Soyad:");
		GridBagConstraints gbc_lblSoyad = new GridBagConstraints();
		gbc_lblSoyad.anchor = GridBagConstraints.EAST;
		gbc_lblSoyad.insets = new Insets(0, 0, 5, 5);
		gbc_lblSoyad.gridx = 2;
		gbc_lblSoyad.gridy = 2;
		panel.add(lblSoyad, gbc_lblSoyad);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		panel.add(textField_1, gbc_textField_1);
		
		JLabel lblSicilNo = new JLabel("Sicil No:");
		GridBagConstraints gbc_lblSicilNo = new GridBagConstraints();
		gbc_lblSicilNo.anchor = GridBagConstraints.EAST;
		gbc_lblSicilNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSicilNo.gridx = 2;
		gbc_lblSicilNo.gridy = 3;
		panel.add(lblSicilNo, gbc_lblSicilNo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		panel.add(textField_2, gbc_textField_2);
		
		JLabel lblBlm = new JLabel("B\u00F6l\u00FCm");
		GridBagConstraints gbc_lblBlm = new GridBagConstraints();
		gbc_lblBlm.anchor = GridBagConstraints.EAST;
		gbc_lblBlm.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlm.gridx = 2;
		gbc_lblBlm.gridy = 4;
		panel.add(lblBlm, gbc_lblBlm);
		
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 4;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Tarih:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 5;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 5;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		
		
		db_connection();
		ilk_son_kayit(1);
		
		//combobox içeriði doldurulur
		Statement stmt1;
		try {
			
			stmt1 = myConn.createStatement();
			ResultSet rs=stmt1.executeQuery("select * from Bolum");
			while(rs.next()) {			
				comboBox.addItem(rs.getString(2));
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "comboBox 'ta hata oluþtu.");
		}
		
		
		
		

	}
	public void db_connection() {
		String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		
		
		try {
			myConn = DriverManager.getConnection(dbUrl,"java","java");
			System.out.println("Baglanti basarili.");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Veritabaný Baðlantý Hatasý");
		}
		
	}
	
	@Override
	public void kayit_ekle() {
		
		String comboBox_ad=(String) comboBox.getSelectedItem();
		int comboBox_id=0;
		Statement stmt1;
		try {
			
			stmt1 = myConn.createStatement();
			ResultSet rs=stmt1.executeQuery("select bolum_id from bolum where bolum_ad='"+comboBox_ad+"'");
			while(rs.next()) {
				comboBox_id=rs.getInt(1);				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Hata Oluþtu");
		}
		
		
		
		String sql="insert into OGRETMEN values (OGRETMEN_SEQ.nextval,'"+textField.getText()+"','"+textField_1.getText()+"',"+Integer.valueOf(textField_2.getText())+","+comboBox_id+",to_date('"+textField_3.getText()+"','dd.mm.yyyy'))";
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			int rset=stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Ekleme Ýþlemi Baþarýlý");
			ilk_son_kayit(2);//son kayda gider
			buton_kontrol();
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ekleme Ýþleminde Hata Oluþtu");
		}
	}
	
	@Override
	public void kayit_sil() {
		int id=ogr.getId();
		String sql="delete from OGRETMEN where ogretmen_id="+id;
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			int rs=stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Silme Ýþlemi Baþarýlý");
			ilk_son_kayit(1);//ilk kayda gider
			buton_kontrol();
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Silme Ýþleminde Hata Oluþtu");
		}
		
	}

	@Override
	public void kayit_guncelle() {
		
		String comboBox_ad=(String) comboBox.getSelectedItem();
		int comboBox_id=0;
		Statement stmt1;
		try {
			
			stmt1 = myConn.createStatement();
			ResultSet rs=stmt1.executeQuery("select * from bolum where bolum_ad='"+comboBox_ad+"'");
			while(rs.next()) {
				comboBox_id=rs.getInt(1);				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Hata Oluþtu");
		}
		
		
		
		
		
		int id=ogr.getId();
		String sql="update OGRETMEN set ad='"+textField.getText()+"',soyad='"+textField_1.getText()+"',sicil_no="+Integer.valueOf(textField_2.getText())+",bolum_id="+comboBox_id+",tarih=to_date('"+textField_3.getText()+"','dd.mm.yyyy')"+ "where ogretmen_id="+id;
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			int rs=stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Güncelleme Ýþlemi Baþarýlý");			
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Güncelleme Ýþleminde Hata Oluþtu");
		}
	}	
	
	@Override
	public void ilk_son_kayit(int deger) {
		String sql="";
		if(deger==1) {
			//ilk kayit
			sql="Select ogr.*,blm.*,to_char(tarih,'dd.mm.yyyy') from Ogretmen ogr, bolum blm where ogr.bolum_id=blm.bolum_id and rownum<2 order by ogr.ogretmen_id asc";
			imlec=1;
		}else if(deger==2) {
			//son kayit
			sql="Select ogr.*,blm.*,to_char(tarih,'dd.mm.yyyy') from Ogretmen ogr, bolum blm where ogr.bolum_id=blm.bolum_id  and rownum<2 order by ogr.ogretmen_id desc";
			imlec=kayit_sayisi();
		}
		Statement stmt;
		try {
			
			stmt = myConn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				ogr=new Ogretmen(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(8),rs.getString(9));		
				
			}
			
			textField.setText(ogr.getAd());		
			textField_1.setText(ogr.getSoyad());
			textField_2.setText(String.valueOf(ogr.getSicil()));
			comboBox.setSelectedItem(ogr.getBolum_ad());
			textField_3.setText(ogr.getTarih());
		
			
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Hata Oluþtu");
		}
	}
	
	@Override
	public void onceki_sonraki_kayit(int deger) {
		
		if(deger==1 && imlec-1>=1) {
			imlec-=1;
		}else if(deger==2 && imlec+1<=kayit_sayisi()) {
			imlec+=1;
		}else if(deger==0) {
			
		}
		String sql="Select ogr.*,blm.*,to_char(tarih,'dd.mm.yyyy') from Ogretmen ogr, bolum blm where ogr.bolum_id=blm.bolum_id and rownum<="+imlec+" order by ogr.ogretmen_id asc";
		Statement stmt;
		try {
			
			stmt = myConn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				ogr=new Ogretmen(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(8),rs.getString(9));						
			}
			
			textField.setText(ogr.getAd());		
			textField_1.setText(ogr.getSoyad());
			textField_2.setText(String.valueOf(ogr.getSicil()));
			comboBox.setSelectedItem(ogr.getBolum_ad());
			textField_3.setText(ogr.getTarih());
		
			
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Hata Oluþtu");
		}
		
	}

	@Override
	public int kayit_sayisi() {
		
		String sql="Select count (*) from Ogretmen";
		Statement stmt;
		int sayi=0;
		
		try {
			
			stmt = myConn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				sayi=rs.getInt(1);					
			}
			return sayi;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Hata Oluþtu");
		}
		return sayi;
		
	}
	
	
	@Override
	public void buton_kontrol() {
		int kayit_sayisi=kayit_sayisi();
		if(kayit_sayisi==0) {
			btn_ilk.setEnabled(false);
			btn_son.setEnabled(false);
			btn_onceki.setEnabled(false);
			btn_sonraki.setEnabled(false);
			btn_ekle.setEnabled(true);
			btn_sil.setEnabled(false);
			btn_guncelle.setEnabled(false);			
		}else if(kayit_sayisi==1) {
			btn_ilk.setEnabled(true);
			btn_son.setEnabled(false);
			btn_onceki.setEnabled(false);
			btn_sonraki.setEnabled(false);
			btn_ekle.setEnabled(true);
			btn_sil.setEnabled(true);
			btn_guncelle.setEnabled(true);	
		}else if(kayit_sayisi==2) {
			btn_ilk.setEnabled(true);
			btn_son.setEnabled(true);
			btn_onceki.setEnabled(false);
			btn_sonraki.setEnabled(false);
			btn_ekle.setEnabled(true);
			btn_sil.setEnabled(true);
			btn_guncelle.setEnabled(true);	
		}else if(kayit_sayisi>2){
			btn_ilk.setEnabled(true);
			btn_son.setEnabled(true);
			btn_onceki.setEnabled(true);
			btn_sonraki.setEnabled(true);
			btn_ekle.setEnabled(true);
			btn_sil.setEnabled(true);
			btn_guncelle.setEnabled(true);	
		}
	}	
	

	@Override
	public void arama_yap(String deger) {
		ArrayList<Ogretmen> list=new ArrayList<Ogretmen>();
		if(!deger.equals("")) {
		Statement stmt;
		try {
			String sql="Select ogr.*,blm.*,to_char(tarih,'dd.mm.yyyy') from Ogretmen ogr, bolum blm where ogr.bolum_id=blm.bolum_id and ogr.ad LIKE '%"+deger+"%'";

			

			
			stmt = myConn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				ogr=new Ogretmen(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(8),rs.getString(9));		
				list.add(ogr);
			}
			if(list.size()!=0) {
			JOptionPane.showMessageDialog(null, list);
			}else {
				JOptionPane.showMessageDialog(null, "Aranan deðer bulunamadý");
			}
			
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Hata Oluþtu");
		}
		}else {
			JOptionPane.showMessageDialog(null, "Arama Hatasý");
		}
	}

	@Override
	public void cikis_yap() {
		try {
			myConn.close();
			System.out.println("çýkýþ yapýldý.");
			System.exit(0);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Çýkýþ Ýþleminde Hata Oluþtu");
		}
	}
	
	
}
