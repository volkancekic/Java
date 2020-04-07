package com.v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class AnasayfaFrm extends JFrame {
	static ArrayList<Personel> personelList=new ArrayList<>();
	static int indis=0;
	ButtonGroup grup1=new ButtonGroup();
	
	private JPanel contentPane;
	private JTextField txtHogeldiniz;
	private JPanel panel;
	private JToolBar toolBar_1;
	private JTextPane textPane;
	private JPanel panel_1;
	private JButton btnEkle;
	private JButton btnSil;
	private JButton btnGuncelle;
	private JButton btnKaydet;
	private JButton btnCikis;
	private JButton btnOnceki;
	private JButton btnSonraki;
	private JLabel lblNewLabel_1;
	private JTextField txtAd;
	private JLabel lblSoyad;
	private JLabel lblSicilNo;
	private JLabel lblGiriYl;
	private JLabel lblDoumYeri;
	private JLabel lblCinsiyet;
	private JLabel lblYnetimtpersonelf;
	private JTextField txtSoyad;
	private JTextField txtSicil;
	private JTextField txtGirisYili;
	private JComboBox comboboxSehir;
	private JRadioButton rdbtnKadin;
	private JCheckBox checkboxYonetim;
	private JRadioButton rdbtnErkek;
	private JButton btnYeniPersonelEkle;
	private JButton btnVazgeç;
	private JButton btnilk;
	private JButton btnson;
	private JButton btnGuncKaydet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnasayfaFrm frame = new AnasayfaFrm();
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
	public AnasayfaFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		dosyadanOku();
		
		
		
		txtHogeldiniz = new JTextField();
		txtHogeldiniz.setText("Anasayfa");
		txtHogeldiniz.setHorizontalAlignment(SwingConstants.CENTER);
		txtHogeldiniz.setFont(new Font("Franklin Gothic Book", Font.BOLD, 15));
		txtHogeldiniz.setEditable(false);
		txtHogeldiniz.setColumns(10);
		contentPane.add(txtHogeldiniz, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBackground(new Color(102, 204, 204));
		contentPane.add(toolBar, BorderLayout.SOUTH);		
		
		btnilk = new JButton("<<");		
		btnilk.setVisible(false);		
		btnilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(personelList.size()!=0) {				
					kayitGoruntule(0);
					indis=0;
					}else {
						textPane.setText("Kayýt Bulunmamaktadýr.");
					}
			}
		});
		toolBar.add(btnilk);
		
		btnOnceki = new JButton("<");
		btnOnceki.setVisible(false);
		btnOnceki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personelList.size()!=0 && indis>0) {					
					indis=indis-1;
					kayitGoruntule(indis);				
					}else {
						kayitGoruntule(indis);
					}
			}
		});
		toolBar.add(btnOnceki);
		
		btnSonraki = new JButton(">");
		btnSonraki.setVisible(false);
		btnSonraki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indis<personelList.size()-1) {					
					indis=indis+1;
					kayitGoruntule(indis);				
					}else {
						kayitGoruntule(indis);	
					}
			}
		});
		toolBar.add(btnSonraki);
		
		btnson = new JButton(">>");
		btnson.setVisible(false);
		btnson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size=personelList.size();
				if(size!=0) {
				kayitGoruntule(size-1);
				indis=size-1;
				}else {
					textPane.setText("Kayýt Bulunmamaktadýr.");
				}
			}
		});
		toolBar.add(btnson);
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		toolBar_1 = new JToolBar();
		toolBar_1.setEnabled(false);
		toolBar_1.setBackground(new Color(102, 204, 204));
		panel.add(toolBar_1, BorderLayout.NORTH);
		
		btnEkle = new JButton("Ekle");	
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				formVisible();				
				formTemizle();
				btnYeniPersonelEkle.setVisible(true);
				btnVazgeç.setVisible(true);
			}
		});
		btnEkle.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar_1.add(btnEkle);
		
		btnSil = new JButton("Sil");
		btnSil.setVisible(false);
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					formTemizle();
					formInVisible();
					if(personelList.size()>0) {
					Personel Temp=personelList.get(indis);
					String AdSoyad=Temp.getAd()+" "+Temp.getSoyad();
					int result = JOptionPane.showConfirmDialog(null,"Kayýt Silinecek. Emin misiniz?\n\n"+AdSoyad+"\n\n", "Kayýt Silme",
					           JOptionPane.YES_NO_OPTION,
					           JOptionPane.QUESTION_MESSAGE);
					        if(result == JOptionPane.YES_OPTION){
					          personelList.remove(indis);					         
					          JOptionPane.showMessageDialog(null, "Kayýt Silindi.");
					          if(personelList.size()>0) {
					        	  altButonKontrol();
					        	  indis=0;
					        	  kayitGoruntule(0);
					          }else {
					        	  altButonKontrol();
					        	  textPane.setText("Görüntülenecek Kayýt Bulunmamaktadýr.");
					          }
					        }
					        }else {
					        	JOptionPane.showMessageDialog(null, "Personel Listesi Boþ.");
					        }
				
			            
			}
		});
		btnSil.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar_1.add(btnSil);
		
		btnGuncelle = new JButton("G\u00FCncelle");
		btnGuncelle.setVisible(false);
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personelList.size()>0) {
				Personel Temp=personelList.get(indis);
				formVisible();			
				formTemizle();
				btnGuncKaydet.setVisible(true);
				btnVazgeç.setVisible(true);
				txtAd.setText(Temp.getAd());
				txtSoyad.setText(Temp.getSoyad());
				txtSicil.setText(String.valueOf(Temp.getSicilNo()));
				txtGirisYili.setText(String.valueOf(Temp.getGirisYili()));
				comboboxSehir.setSelectedItem(Temp.getDogumYeri());
				Cinsiyet c=Temp.getCinsiyet();
				if(c.equals(Cinsiyet.E)) {
				rdbtnErkek.setSelected(true);
				}else {
					rdbtnKadin.setSelected(true);
				}
				if(Temp.isYonetimPersonel()==true) {
					checkboxYonetim.setSelected(true);
				}else {
					checkboxYonetim.setSelected(false);
				}				
				
			}else {
				JOptionPane.showMessageDialog(null, "Personel Listesi Boþ.");
			}
			}
		});
		btnGuncelle.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar_1.add(btnGuncelle);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.setVisible(false);
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formInVisible();
				formTemizle();				
				dosyayaKaydet();
			}
		});
		btnKaydet.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar_1.add(btnKaydet);
		
		btnCikis = new JButton("\u00C7\u0131k\u0131\u015F");
		btnCikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnKaydet.isVisible()) {
				int result = JOptionPane.showConfirmDialog(null,"Deðiþiklikler Kaydedilsin mi?\n\n", "Kaydet",
				           JOptionPane.YES_NO_OPTION,
				           JOptionPane.QUESTION_MESSAGE);
				        if(result == JOptionPane.YES_OPTION){
				         dosyayaKaydet();				         
				        }
				}
				        try {
							LoginFrm lgn=new LoginFrm();										
							setVisible(false);
							lgn.setVisible(true);
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Çýkýþ Yaparken Hata Oluþtu.");
						}
				
			}
		});
		btnCikis.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar_1.add(btnCikis);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		panel.add(textPane, BorderLayout.SOUTH);
		
		if(personelList.size()>0) {
			altButonKontrol();
			indis=0;
			kayitGoruntule(0);
		}
		
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 255));
		panel.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 424, 0};
		gbl_panel_1.rowHeights = new int[]{12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 152, 14, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNewLabel_1 = new JLabel("Ad:");
		lblNewLabel_1.setVisible(false);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(100, 15, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 6;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtAd = new JTextField();
		txtAd.setVisible(false);
		GridBagConstraints gbc_txtAd = new GridBagConstraints();
		gbc_txtAd.insets = new Insets(100, 0, 5, 150);
		gbc_txtAd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAd.gridx = 7;
		gbc_txtAd.gridy = 6;
		panel_1.add(txtAd, gbc_txtAd);
		txtAd.setColumns(10);
		
		lblSoyad = new JLabel("Soyad:");
		lblSoyad.setVisible(false);
		GridBagConstraints gbc_lblSoyad = new GridBagConstraints();
		gbc_lblSoyad.insets = new Insets(0, 15, 5, 5);
		gbc_lblSoyad.gridx = 4;
		gbc_lblSoyad.gridy = 7;
		panel_1.add(lblSoyad, gbc_lblSoyad);
		
		txtSoyad = new JTextField();
		txtSoyad.setVisible(false);
		txtSoyad.setColumns(10);
		GridBagConstraints gbc_txtSoyad = new GridBagConstraints();
		gbc_txtSoyad.insets = new Insets(0, 0, 5, 150);
		gbc_txtSoyad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSoyad.gridx = 7;
		gbc_txtSoyad.gridy = 7;
		panel_1.add(txtSoyad, gbc_txtSoyad);
		
		lblSicilNo = new JLabel("Sicil No:");
		lblSicilNo.setVisible(false);
		GridBagConstraints gbc_lblSicilNo = new GridBagConstraints();
		gbc_lblSicilNo.insets = new Insets(0, 15, 5, 5);
		gbc_lblSicilNo.gridx = 4;
		gbc_lblSicilNo.gridy = 8;
		panel_1.add(lblSicilNo, gbc_lblSicilNo);
		
		txtSicil = new JTextField();
		txtSicil.setVisible(false);		
		txtSicil.setColumns(10);
		GridBagConstraints gbc_txtSicil = new GridBagConstraints();
		gbc_txtSicil.insets = new Insets(0, 0, 5, 150);
		gbc_txtSicil.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSicil.gridx = 7;
		gbc_txtSicil.gridy = 8;
		panel_1.add(txtSicil, gbc_txtSicil);
		
		lblGiriYl = new JLabel("Giri\u015F Y\u0131l\u0131:");
		lblGiriYl.setVisible(false);
		GridBagConstraints gbc_lblGiriYl = new GridBagConstraints();
		gbc_lblGiriYl.insets = new Insets(0, 15, 5, 5);
		gbc_lblGiriYl.gridx = 4;
		gbc_lblGiriYl.gridy = 9;
		panel_1.add(lblGiriYl, gbc_lblGiriYl);
		
		txtGirisYili = new JTextField();
		txtGirisYili.setVisible(false);
		txtGirisYili.setColumns(10);
		GridBagConstraints gbc_txtGirisYili = new GridBagConstraints();
		gbc_txtGirisYili.insets = new Insets(0, 0, 5, 150);
		gbc_txtGirisYili.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGirisYili.gridx = 7;
		gbc_txtGirisYili.gridy = 9;
		panel_1.add(txtGirisYili, gbc_txtGirisYili);
		
		lblDoumYeri = new JLabel("Do\u011Fum Yeri:");
		lblDoumYeri.setVisible(false);
		GridBagConstraints gbc_lblDoumYeri = new GridBagConstraints();
		gbc_lblDoumYeri.insets = new Insets(0, 15, 5, 5);
		gbc_lblDoumYeri.gridx = 4;
		gbc_lblDoumYeri.gridy = 10;
		panel_1.add(lblDoumYeri, gbc_lblDoumYeri);
		
		comboboxSehir = new JComboBox();
		comboboxSehir.setVisible(false);		
		comboboxSehir.setModel(new DefaultComboBoxModel(new String[] {"Ankara", "Bolu", "\u0130stanbul", "Trabzon", "\u0130zmir"}));
		GridBagConstraints gbc_comboboxSehir = new GridBagConstraints();
		gbc_comboboxSehir.insets = new Insets(0, 0, 5, 150);
		gbc_comboboxSehir.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxSehir.gridx = 7;
		gbc_comboboxSehir.gridy = 10;
		panel_1.add(comboboxSehir, gbc_comboboxSehir);
		
		lblCinsiyet = new JLabel("Cinsiyet:");
		lblCinsiyet.setVisible(false);
		GridBagConstraints gbc_lblCinsiyet = new GridBagConstraints();
		gbc_lblCinsiyet.insets = new Insets(0, 15, 5, 5);
		gbc_lblCinsiyet.gridx = 4;
		gbc_lblCinsiyet.gridy = 11;
		panel_1.add(lblCinsiyet, gbc_lblCinsiyet);
		
		rdbtnErkek = new JRadioButton("Erkek");
		rdbtnErkek.setVisible(false);		
		GridBagConstraints gbc_rdbtnErkek = new GridBagConstraints();
		gbc_rdbtnErkek.anchor = GridBagConstraints.BASELINE;
		gbc_rdbtnErkek.insets = new Insets(0, 0, 5, 170);
		gbc_rdbtnErkek.gridx = 7;
		gbc_rdbtnErkek.gridy = 11;
		panel_1.add(rdbtnErkek, gbc_rdbtnErkek);
		
		rdbtnKadin = new JRadioButton("Kad\u0131n");
		rdbtnKadin.setVisible(false);		
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton.gridx = 7;
		gbc_rdbtnNewRadioButton.gridy = 11;
		panel_1.add(rdbtnKadin, gbc_rdbtnNewRadioButton);
		
		
		grup1.add(rdbtnErkek);
		grup1.add(rdbtnKadin);
		rdbtnErkek.setActionCommand("Erkek");
		rdbtnKadin.setActionCommand("Kadin");
		
		
		
		lblYnetimtpersonelf = new JLabel("Y\u00F6netim(T),Personel(F):");
		lblYnetimtpersonelf.setVisible(false);
		GridBagConstraints gbc_lblYnetimtpersonelf = new GridBagConstraints();
		gbc_lblYnetimtpersonelf.insets = new Insets(0, 15, 5, 5);
		gbc_lblYnetimtpersonelf.gridx = 4;
		gbc_lblYnetimtpersonelf.gridy = 12;
		panel_1.add(lblYnetimtpersonelf, gbc_lblYnetimtpersonelf);
		
		checkboxYonetim = new JCheckBox("Y\u00F6netim");
		checkboxYonetim.setVisible(false);
		GridBagConstraints gbc_checkboxYonetim = new GridBagConstraints();
		gbc_checkboxYonetim.anchor = GridBagConstraints.WEST;
		gbc_checkboxYonetim.insets = new Insets(0, 0, 5, 0);
		gbc_checkboxYonetim.gridx = 7;
		gbc_checkboxYonetim.gridy = 12;
		panel_1.add(checkboxYonetim, gbc_checkboxYonetim);
		
		btnYeniPersonelEkle = new JButton("Yeni Personel Ekle");
		btnYeniPersonelEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				formInVisible();
				try {
					
					Cinsiyet c=Cinsiyet.E; //default
				if(grup1.getSelection()!=null) {
					if(grup1.getSelection().getActionCommand().equals("Erkek")) {
						 c=Cinsiyet.E;
					}else {
						 c=Cinsiyet.K;
					}
				}
				Boolean y;
				if(checkboxYonetim.isSelected()) {
					 y=true;
				}else {
					 y=false;
				}
				Personel p1=new Personel(txtAd.getText(), txtSoyad.getText(), Integer.valueOf(txtSicil.getText()), Integer.valueOf(txtGirisYili.getText()), comboboxSehir.getSelectedItem().toString(), c, y);
				personelList.add(p1);
				
				altButonKontrol();
				
				formTemizle();
				JOptionPane.showMessageDialog(null, "Personel Baþarýyla Eklendi.");
				indis=0;
				kayitGoruntule(0);
				} catch (Exception e) {
					formTemizle();
					JOptionPane.showMessageDialog(null, "Hata Oluþtu.");
				}
			}
		});
		GridBagConstraints gbc_btnYeniPersonelEkle = new GridBagConstraints();
		gbc_btnYeniPersonelEkle.anchor = GridBagConstraints.WEST;
		gbc_btnYeniPersonelEkle.insets = new Insets(5, 0, 5, 0);
		gbc_btnYeniPersonelEkle.gridx = 7;
		gbc_btnYeniPersonelEkle.gridy = 13;
		panel_1.add(btnYeniPersonelEkle, gbc_btnYeniPersonelEkle);
		btnYeniPersonelEkle.setVisible(false);
		
		
		btnVazgeç = new JButton("Vazge\u00E7");
		btnVazgeç.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				formTemizle();
				formInVisible();
			}
		});
		GridBagConstraints gbc_btnVazgeç = new GridBagConstraints();
		gbc_btnVazgeç.insets = new Insets(5, 0, 5, 75);
		gbc_btnVazgeç.gridx = 7;
		gbc_btnVazgeç.gridy = 13;
		panel_1.add(btnVazgeç, gbc_btnVazgeç);
		
		btnGuncKaydet = new JButton("G\u00FCncellemeyi Kaydet");
		btnGuncKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formInVisible();
				try {
					Personel Guncel=personelList.get(indis);
					Cinsiyet c=Cinsiyet.E; //default
				if(grup1.getSelection()!=null) {
					if(grup1.getSelection().getActionCommand().equals("Erkek")) {
						 c=Cinsiyet.E;
					}else {
						 c=Cinsiyet.K;
					}
				}
				Boolean y;
				if(checkboxYonetim.isSelected()) {
					 y=true;
				}else {
					 y=false;
				}
				Guncel.setAd(txtAd.getText());
				Guncel.setSoyad(txtSoyad.getText());
				Guncel.setSicilNo(Integer.valueOf(txtSicil.getText()));
				Guncel.setGirisYili(Integer.valueOf(txtGirisYili.getText()));
				Guncel.setDogumYeri(comboboxSehir.getSelectedItem().toString());
				Guncel.setCinsiyet(c);
				Guncel.setYonetimPersonel(y);				
				altButonKontrol();
				
				formTemizle();
				JOptionPane.showMessageDialog(null, "Personel Baþarýyla Güncellendi.");
				kayitGoruntule(indis);
				
				} catch (Exception efg) {
					formTemizle();
					JOptionPane.showMessageDialog(null, "Hata Oluþtu.");
				}
			}
		});
		btnGuncKaydet.setVisible(false);
		GridBagConstraints gbc_btnGuncKaydet = new GridBagConstraints();
		gbc_btnGuncKaydet.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuncKaydet.gridx = 7;
		gbc_btnGuncKaydet.gridy = 14;
		panel_1.add(btnGuncKaydet, gbc_btnGuncKaydet);
		btnVazgeç.setVisible(false);
	}
	public void formTemizle() {
		txtAd.setText("");
		txtSoyad.setText("");
		txtSicil.setText("");
		txtGirisYili.setText("");
		comboboxSehir.setSelectedItem("Ankara");
		grup1.clearSelection();
		checkboxYonetim.setSelected(false);
		btnYeniPersonelEkle.setVisible(false);
		btnVazgeç.setVisible(false);
		btnGuncKaydet.setVisible(false);
	}
	public void formInVisible() {
		lblNewLabel_1.setVisible(false);
		lblSoyad.setVisible(false);
		lblSicilNo.setVisible(false);
		lblGiriYl.setVisible(false);
		lblDoumYeri.setVisible(false);
		lblCinsiyet.setVisible(false);
		lblYnetimtpersonelf.setVisible(false);

		txtAd.setVisible(false);
		txtSoyad.setVisible(false);
		txtSicil.setVisible(false);
		txtGirisYili.setVisible(false);
		comboboxSehir.setVisible(false);
		rdbtnErkek.setVisible(false);
		rdbtnKadin.setVisible(false);
		checkboxYonetim.setVisible(false);
		btnYeniPersonelEkle.setVisible(false);
		btnVazgeç.setVisible(false);
		btnGuncKaydet.setVisible(false);
	}
	public void formVisible() {
		lblNewLabel_1.setVisible(true);
		lblSoyad.setVisible(true);
		lblSicilNo.setVisible(true);
		lblGiriYl.setVisible(true);
		lblDoumYeri.setVisible(true);
		lblCinsiyet.setVisible(true);
		lblYnetimtpersonelf.setVisible(true);

		txtAd.setVisible(true);
		txtSoyad.setVisible(true);
		txtSicil.setVisible(true);
		txtGirisYili.setVisible(true);
		comboboxSehir.setVisible(true);
		rdbtnErkek.setVisible(true);
		rdbtnKadin.setVisible(true);
		checkboxYonetim.setVisible(true);		
	}
	public void kayitGoruntule(int i) {
		textPane.setText(personelList.get(i).toString());
	}
	public void altButonKontrol() {
		int boyut=personelList.size();
		if(boyut==0) {
			btnSil.setVisible(false);
			btnGuncelle.setVisible(false);
			btnKaydet.setVisible(false);
			btnilk.setVisible(false);
			btnOnceki.setVisible(false);
			btnSonraki.setVisible(false);
			btnson.setVisible(false);			
		}else if(boyut==1){
			btnSil.setVisible(true);
			btnGuncelle.setVisible(true);
			btnKaydet.setVisible(true);
			btnilk.setVisible(true);
			btnOnceki.setVisible(false);
			btnSonraki.setVisible(false);
			btnson.setVisible(false);	
		}else if(boyut==2){
			btnSil.setVisible(true);
			btnGuncelle.setVisible(true);
			btnKaydet.setVisible(true);
			btnilk.setVisible(true);
			btnOnceki.setVisible(false);
			btnSonraki.setVisible(false);
			btnson.setVisible(true);	
		}else if(boyut>2){
			btnSil.setVisible(true);
			btnGuncelle.setVisible(true);
			btnKaydet.setVisible(true);
			btnilk.setVisible(true);
			btnOnceki.setVisible(true);
			btnSonraki.setVisible(true);
			btnson.setVisible(true);	
		}
	}
	public void dosyayaKaydet() {
		
		try {
	         FileOutputStream fileOut =new FileOutputStream("Belgeler/personeller.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(personelList);
	         out.close();
	         fileOut.close();
	         JOptionPane.showMessageDialog(null, "Veriler Baþarýyla Kaydedildi.");	        
	      } catch (IOException i) {
	    	 JOptionPane.showMessageDialog(null, "Kaydetme Ýþleminde Hata Oluþtu.");	      
	      }	
	}
	public void dosyadanOku() {
		try {
	         FileInputStream fileIn = new FileInputStream("Belgeler/personeller.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         personelList =  (ArrayList<Personel>)in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	    	  JOptionPane.showMessageDialog(null, "Dosya Okumada Hata Oluþtu.");
	         return;
	      } catch (ClassNotFoundException c) {
	    	  JOptionPane.showMessageDialog(null, "Dosya Okumada Hata Oluþtu.");		        
	         return;
	      }
	}

}
