package com.loginKontrolAppWFile;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SwingApp2 extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;

	/**
	 * Launch the application.
	 */
	static HashMap<String,String> veriler=new HashMap<String, String>();
	static File myFile=new File("BelgeLogin/belge2.txt");
	private JButton btnKapat;
	private JTextField textPassword;
	private JTextField mesajfield;
	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {	
				dosyadanOku();				
				try {
					SwingApp2 frame = new SwingApp2();
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
	public SwingApp2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("User Name");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textUsername = new JTextField();
		GridBagConstraints gbc_textUsername = new GridBagConstraints();
		gbc_textUsername.insets = new Insets(0, 0, 5, 5);
		gbc_textUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsername.gridx = 3;
		gbc_textUsername.gridy = 1;
		contentPane.add(textUsername, gbc_textUsername);
		textUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnLogin = new JButton("Giri\u015F Yap");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kAdi=textUsername.getText();
				String pass=textPassword.getText();
				if(veriler.containsKey(kAdi)&& veriler.get(kAdi).equals(pass)) {					
					SecondWind scw=new SecondWind();
					scw.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Check your username or password");
				}
				
			}
		});
		
		textPassword = new JTextField();
		GridBagConstraints gbc_textPassword = new GridBagConstraints();
		gbc_textPassword.insets = new Insets(0, 0, 5, 5);
		gbc_textPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPassword.gridx = 3;
		gbc_textPassword.gridy = 2;
		contentPane.add(textPassword, gbc_textPassword);
		textPassword.setColumns(10);
		
		mesajfield = new JTextField();
		mesajfield.setEditable(false);
		GridBagConstraints gbc_mesajfield = new GridBagConstraints();
		gbc_mesajfield.insets = new Insets(0, 0, 5, 5);
		gbc_mesajfield.fill = GridBagConstraints.HORIZONTAL;
		gbc_mesajfield.gridx = 3;
		gbc_mesajfield.gridy = 4;
		contentPane.add(mesajfield, gbc_mesajfield);
		mesajfield.setColumns(10);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 3;
		gbc_btnLogin.gridy = 5;
		contentPane.add(btnLogin, gbc_btnLogin);
		
		btnKapat = new JButton("Program\u0131 Kapat");
		btnKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dosyayaKaydet();
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnKapat = new GridBagConstraints();
		gbc_btnKapat.insets = new Insets(0, 0, 0, 5);
		gbc_btnKapat.gridx = 3;
		gbc_btnKapat.gridy = 7;
		contentPane.add(btnKapat, gbc_btnKapat);
	}
	public static void dosyadanOku() {
		
		if(myFile.exists()) {
			Scanner dosyaOku;
			try {
				dosyaOku = new Scanner(myFile);
				while(dosyaOku.hasNext()) {
					String kullanici=dosyaOku.next();
					String parola=dosyaOku.next();
					veriler.put(kullanici, parola);
					
				}
				JOptionPane.showMessageDialog(null, " *HashMap dosyadan güncellendi");
				
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, " *Hata Oluþtu");
			}
			
		}else {
			JOptionPane.showMessageDialog(null, " *Dosya okunamadý");
		}		
	}
	public static void dosyayaKaydet() {
		
		if(myFile.exists()) {
			try {
				Formatter frmt=new Formatter(myFile);
				veriler.forEach((key,value)->frmt.format("%s %s\n", key,value));
				
				frmt.close();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, " *Kayýt Ýþleminde Hata Oluþtu");
			}
		}else {
			JOptionPane.showMessageDialog(null, " *Dosya bulunamadý");
		}
	}
	public void scw_gelen_mesaj(String yas,String sehir) {		    
		     
		mesajfield.setText( "Yaþ:"+yas+" sehir:"+sehir);
	}
}
