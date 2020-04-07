package com.v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class DosyaTaramaApp extends JFrame {
	static ArrayList<String> dosyaAdlari=new ArrayList<>();
	private JPanel contentPane;
	private JTextField textKelime;
	private JTextField textPath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DosyaTaramaApp frame = new DosyaTaramaApp();
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
	public DosyaTaramaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{424, 0};
		gbl_contentPane.rowHeights = new int[]{32, 214, 10, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblNewLabel = new JLabel("Dosya Arama");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Klas\u00F6r:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textPath = new JTextField();
		textPath.setEditable(false);
		textPath.setColumns(20);
		GridBagConstraints gbc_textPath = new GridBagConstraints();
		gbc_textPath.insets = new Insets(0, 0, 5, 5);
		gbc_textPath.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPath.gridx = 1;
		gbc_textPath.gridy = 1;
		panel_2.add(textPath, gbc_textPath);
		
		JButton btnDosyaBul = new JButton("Dosyay\u0131 Bul");
		btnDosyaBul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView()); 
				j.showSaveDialog(null);
				File dizin=j.getCurrentDirectory();
				textPath.setText(String.valueOf(dizin));				
				File dosya = new File(String.valueOf(dizin));
				if (dosya.isDirectory()) {
				
				File[] tumDosyalar= dosya.listFiles();
				for(int i=0;i<tumDosyalar.length;i++)
					if((tumDosyalar[i].getName()).contains(".txt")) {
						dosyaAdlari.add(tumDosyalar[i].getName());
					}
				} else {
				System.out.println("Dosya Bulunamadý");
				}
				
				//System.out.println(dosyaAdlari);
				
			}
		});
		btnDosyaBul.setBackground(Color.ORANGE);
		GridBagConstraints gbc_btnDosyaBul = new GridBagConstraints();
		gbc_btnDosyaBul.insets = new Insets(0, 0, 5, 0);
		gbc_btnDosyaBul.gridx = 3;
		gbc_btnDosyaBul.gridy = 1;
		panel_2.add(btnDosyaBul, gbc_btnDosyaBul);
		
		JLabel lblNewLabel_2 = new JLabel("Kelime :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textKelime = new JTextField();
		textKelime.setColumns(20);
		GridBagConstraints gbc_textKelime = new GridBagConstraints();
		gbc_textKelime.insets = new Insets(0, 0, 5, 5);
		gbc_textKelime.fill = GridBagConstraints.HORIZONTAL;
		gbc_textKelime.gridx = 1;
		gbc_textKelime.gridy = 2;
		panel_2.add(textKelime, gbc_textKelime);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 3;
		panel_2.add(textPane, gbc_textPane);
		
		JButton btnAramaYap = new JButton("Arama Yap");
		btnAramaYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kelime=textKelime.getText();
				String aramaBulunmadi="Aradýðýnýz Kelime Bulunamadý.";
				int kontrol=0;
				String aramaSonucu="";
				for (String dosyaAd : dosyaAdlari) {
					//System.out.println(dosyaAd);
					File MyFile=new File(textPath.getText()+"/"+dosyaAd);
					Scanner dosyaOku;
					try {
						dosyaOku = new Scanner(MyFile);
						while(dosyaOku.hasNext()) {
							
							if(dosyaOku.next().contains(kelime)) {
								aramaSonucu+=(kelime +" "+dosyaAd+" dosyasýnda bulundu.\n");		
								textPane.setText(aramaSonucu);
								kontrol=1;
							}
						}
					} catch (FileNotFoundException e1) {
						textPane.setText("Dosya okumada hata oluþtu.");
					}
					
				}
				if(kontrol==0) {
					textPane.setText(aramaBulunmadi);
				}
			}
		});
		btnAramaYap.setBackground(Color.GREEN);
		GridBagConstraints gbc_btnAramaYap = new GridBagConstraints();
		gbc_btnAramaYap.insets = new Insets(0, 0, 5, 0);
		gbc_btnAramaYap.gridx = 3;
		gbc_btnAramaYap.gridy = 2;
		panel_2.add(btnAramaYap, gbc_btnAramaYap);
		
		
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		contentPane.add(panel_1, gbc_panel_1);
	}

}
