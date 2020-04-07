package com.v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class LoginFrm extends JFrame {

	private JPanel contentPane;
	private JTextField txtKullancGiriEkran;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrm frame = new LoginFrm();
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
	public LoginFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtKullancGiriEkran = new JTextField();
		txtKullancGiriEkran.setHorizontalAlignment(SwingConstants.CENTER);
		txtKullancGiriEkran.setFont(new Font("Franklin Gothic Book", Font.BOLD, 15));
		txtKullancGiriEkran.setText("Kullan\u0131c\u0131 Giri\u015F Ekran\u0131");
		txtKullancGiriEkran.setEditable(false);
		contentPane.add(txtKullancGiriEkran, BorderLayout.NORTH);
		txtKullancGiriEkran.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(45, 75, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		txtUsername = new JTextField();
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.insets = new Insets(45, 0, 5, 100);
		gbc_txtUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.gridx = 4;
		gbc_txtUsername.gridy = 2;
		panel.add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u015Eifre:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 75, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnLogin = new JButton("Giri\u015F Yap");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File myFile=new File("Belgeler/LoginBilgileri.txt");
				int a=0,b=0;
				if(myFile.exists()) {
				try {
					Scanner dosyaOku=new Scanner(myFile);
					String passwordgelen = new String(passwordField.getPassword());//kullanýcýnýn girdiði parola
					
					while(dosyaOku.hasNext()) {
						a++;
						if(dosyaOku.nextLine().equals(txtUsername.getText()+" "+passwordgelen)) {
							AnasayfaFrm frame1 = new AnasayfaFrm();	
							setVisible(false);
							frame1.setVisible(true);							
						}else {
							b++;
						}
					}
					if(a==b) {
						JOptionPane.showMessageDialog(null, "Kullanýcý Adý veya Parola Yanlýþ.");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Hata Oluþtu.");
				}
				
				}else {
					JOptionPane.showMessageDialog(null, "Dosya Bulunamadý.");
				}
				
			}
		});
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 100);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 4;
		gbc_passwordField.gridy = 3;
		panel.add(passwordField, gbc_passwordField);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(15, 0, 0, 120);
		gbc_btnLogin.gridx = 4;
		gbc_btnLogin.gridy = 5;
		panel.add(btnLogin, gbc_btnLogin);
	}

}
