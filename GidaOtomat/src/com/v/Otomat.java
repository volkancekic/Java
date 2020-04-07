package com.v;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Otomat extends JFrame {

	private JPanel contentPane;
	private JTextField txt_balance;
	static double balance=0;
	int su=0,enerji=0,kola=0,biskuvi=0,kek=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otomat frame = new Otomat();
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
	public Otomat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{89, 0};
		gbl_panel.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		Icon i1=new ImageIcon("resimler/50.jpg");
		Dimension dm1=new Dimension(40,40);
		JButton btn_50kurus = new JButton(i1);
		btn_50kurus.setPreferredSize(dm1);
		btn_50kurus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance+=0.50;
				txt_balance.setText(String.valueOf(balance));
				
			}
		});
		GridBagConstraints gbc_btn_50kurus = new GridBagConstraints();
		gbc_btn_50kurus.insets = new Insets(0, 0, 5, 0);
		gbc_btn_50kurus.gridx = 0;
		gbc_btn_50kurus.gridy = 0;
		panel.add(btn_50kurus, gbc_btn_50kurus);
		Icon i2=new ImageIcon("resimler/1.jpg");
		Dimension dm2=new Dimension(40,40);
		JButton btn_1tl = new JButton(i2);
		btn_1tl.setPreferredSize(dm2);
		btn_1tl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance+=1;
				txt_balance.setText(String.valueOf(balance));
			}
		});
		GridBagConstraints gbc_btn_1tl = new GridBagConstraints();
		gbc_btn_1tl.insets = new Insets(0, 0, 5, 0);
		gbc_btn_1tl.gridx = 0;
		gbc_btn_1tl.gridy = 1;
		panel.add(btn_1tl, gbc_btn_1tl);
		
		Icon i3=new ImageIcon("resimler/5.jpg");
		Dimension dm3=new Dimension(90,50);
		JButton btn_5tl = new JButton(i3);
		btn_5tl.setPreferredSize(dm3);
		btn_5tl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance+=5;
				txt_balance.setText(String.valueOf(balance));
			}
		});
		GridBagConstraints gbc_btn_5tl = new GridBagConstraints();
		gbc_btn_5tl.insets = new Insets(0, 0, 5, 0);
		gbc_btn_5tl.gridx = 0;
		gbc_btn_5tl.gridy = 2;
		panel.add(btn_5tl, gbc_btn_5tl);
		
		Icon i4=new ImageIcon("resimler/10.jpg");
		Dimension dm4=new Dimension(90,50);
		JButton btn_10tl = new JButton(i4);
		btn_10tl.setPreferredSize(dm4);
		btn_10tl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance+=10;
				txt_balance.setText(String.valueOf(balance));
			}
		});
		GridBagConstraints gbc_btn_10tl = new GridBagConstraints();
		gbc_btn_10tl.insets = new Insets(0, 0, 5, 0);
		gbc_btn_10tl.gridx = 0;
		gbc_btn_10tl.gridy = 3;
		panel.add(btn_10tl, gbc_btn_10tl);
		
		JLabel lblNewLabel = new JLabel("Bakiye:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 5;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		txt_balance = new JTextField();
		GridBagConstraints gbc_txt_balance = new GridBagConstraints();
		gbc_txt_balance.insets = new Insets(0, 0, 5, 0);
		gbc_txt_balance.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_balance.gridx = 0;
		gbc_txt_balance.gridy = 6;
		panel.add(txt_balance, gbc_txt_balance);
		txt_balance.setColumns(10);
		
		JButton btn_para_iade = new JButton("PARA \u0130ADE");
		btn_para_iade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(balance!=0) {
				JOptionPane.showMessageDialog(null, balance+" TL Bakiye Ýade Edilmiþtir.");
				balance=0;
				txt_balance.setText(String.valueOf(balance));
				JOptionPane.showMessageDialog(null, "\n"+kola+" adet kola\n"+su+" adet su\n"+kek+" adet kek\n"+enerji+" adet "
						+ "enerji içeceði\n"+biskuvi+" adet bisküvi alýnmýþtýr.\nAfiyet Olsun..");
				kek=0; biskuvi=0; kola=0; enerji=0;su=0;
			}
				}
		});
		GridBagConstraints gbc_btn_para_iade = new GridBagConstraints();
		gbc_btn_para_iade.insets = new Insets(0, 0, 5, 0);
		gbc_btn_para_iade.gridx = 0;
		gbc_btn_para_iade.gridy = 7;
		panel.add(btn_para_iade, gbc_btn_para_iade);
		
		JButton btn_cikis = new JButton("\u00C7IKI\u015E");
		btn_cikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btn_cikis = new GridBagConstraints();
		gbc_btn_cikis.gridx = 0;
		gbc_btn_cikis.gridy = 8;
		panel.add(btn_cikis, gbc_btn_cikis);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btn_kola = new JButton("Sat\u0131n Al");
		btn_kola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_balance.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Lütfen Para Atýnýz.");
				}else {
				if(balance-3>=0) {
					balance-=3;					
					txt_balance.setText(String.valueOf(balance));
					kola++;
					if(balance==0) {
						JOptionPane.showMessageDialog(null, "\n"+kola+" adet kola\n"+su+" adet su\n"+kek+" adet kek\n"+enerji+" adet "
								+ "enerji içeceði\n"+biskuvi+" adet bisküvi alýnmýþtýr.\nAfiyet Olsun..");
						kek=0; biskuvi=0; kola=0; enerji=0;su=0;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
				}
			}
			}
		});
		GridBagConstraints gbc_btn_kola = new GridBagConstraints();
		gbc_btn_kola.insets = new Insets(10, 0, 5, 5);
		gbc_btn_kola.gridx = 0;
		gbc_btn_kola.gridy = 0;
		panel_1.add(btn_kola, gbc_btn_kola);
		
		JButton btn_su = new JButton("Sat\u0131n Al");
		btn_su.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_balance.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Lütfen Para Atýnýz.");
				}else {
				if(balance-1>=0) {
					balance-=1;					
					txt_balance.setText(String.valueOf(balance));
					su++;
					if(balance==0) {
						JOptionPane.showMessageDialog(null, "\n"+kola+" adet kola\n"+su+" adet su\n"+kek+" adet kek\n"+enerji+" adet "
								+ "enerji içeceði\n"+biskuvi+" adet bisküvi alýnmýþtýr.\nAfiyet Olsun..");
						kek=0; biskuvi=0; kola=0; enerji=0;su=0;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
				}
			}
			}
		});
		GridBagConstraints gbc_btn_su = new GridBagConstraints();
		gbc_btn_su.insets = new Insets(35, 0, 5, 5);
		gbc_btn_su.gridx = 0;
		gbc_btn_su.gridy = 1;
		panel_1.add(btn_su, gbc_btn_su);
		
		JButton btn_kek = new JButton("Sat\u0131n Al");
		btn_kek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_balance.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Lütfen Para Atýnýz.");
				}else {
				if(balance-2>=0) {
					balance-=2;					
					txt_balance.setText(String.valueOf(balance));
					kek++;
					if(balance==0) {
						JOptionPane.showMessageDialog(null, "\n"+kola+" adet kola\n"+su+" adet su\n"+kek+" adet kek\n"+enerji+" adet "
								+ "enerji içeceði\n"+biskuvi+" adet bisküvi alýnmýþtýr.\nAfiyet Olsun..");
						kek=0; biskuvi=0; kola=0; enerji=0;su=0;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
				}
			}
			}
		});
		GridBagConstraints gbc_btn_kek = new GridBagConstraints();
		gbc_btn_kek.insets = new Insets(35, 0, 5, 5);
		gbc_btn_kek.gridx = 0;
		gbc_btn_kek.gridy = 2;
		panel_1.add(btn_kek, gbc_btn_kek);
		
		JButton btn_enerji = new JButton("Sat\u0131n Al");
		btn_enerji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_balance.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Lütfen Para Atýnýz.");
				}else {
				if(balance-7>=0) {
					balance-=7;					
					txt_balance.setText(String.valueOf(balance));
					enerji++;
					if(balance==0) {
						JOptionPane.showMessageDialog(null, "\n"+kola+" adet kola\n"+su+" adet su\n"+kek+" adet kek\n"+enerji+" adet "
								+ "enerji içeceði\n"+biskuvi+" adet bisküvi alýnmýþtýr.\nAfiyet Olsun..");
						kek=0; biskuvi=0; kola=0; enerji=0;su=0;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
				}
			}
			}
		});
		GridBagConstraints gbc_btn_enerji = new GridBagConstraints();
		gbc_btn_enerji.anchor = GridBagConstraints.NORTH;
		gbc_btn_enerji.insets = new Insets(30, 0, 5, 5);
		gbc_btn_enerji.gridx = 0;
		gbc_btn_enerji.gridy = 3;
		panel_1.add(btn_enerji, gbc_btn_enerji);
		
		JButton btn_biskuvi = new JButton("Sat\u0131n Al");
		btn_biskuvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_balance.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Lütfen Para Atýnýz.");
				}else {
				if(balance-5>=0) {
					balance-=5;					
					txt_balance.setText(String.valueOf(balance));
					biskuvi++;
					if(balance==0) {
						JOptionPane.showMessageDialog(null, "\n"+kola+" adet kola\n"+su+" adet su\n"+kek+" adet kek\n"+enerji+" adet "
								+ "enerji içeceði\n"+biskuvi+" adet bisküvi alýnmýþtýr.\nAfiyet Olsun..");
						kek=0; biskuvi=0; kola=0; enerji=0;su=0;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
				}
			}
			}
		});
		GridBagConstraints gbc_btn_biskuvi = new GridBagConstraints();
		gbc_btn_biskuvi.insets = new Insets(35, 0, 5, 5);
		gbc_btn_biskuvi.gridx = 0;
		gbc_btn_biskuvi.gridy = 4;
		panel_1.add(btn_biskuvi, gbc_btn_biskuvi);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		Icon rsm1=new ImageIcon("resimler/kola.jpg");
		JLabel lblNewLabel_1 = new JLabel(rsm1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3 TL");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		
		Icon rsm2=new ImageIcon("resimler/su.jpg");
		JLabel lblSuTl = new JLabel(rsm2);
		lblSuTl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblSuTl = new GridBagConstraints();
		gbc_lblSuTl.insets = new Insets(10, 0, 5, 5);
		gbc_lblSuTl.gridx = 0;
		gbc_lblSuTl.gridy = 2;
		panel_2.add(lblSuTl, gbc_lblSuTl);
		
		JLabel lblNewLabel_3 = new JLabel("1 TL");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 2;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		Icon rsm3=new ImageIcon("resimler/kek.jpg");
		JLabel lblKekTl = new JLabel(rsm3);
		lblKekTl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblKekTl = new GridBagConstraints();
		gbc_lblKekTl.insets = new Insets(10, 0, 5, 5);
		gbc_lblKekTl.gridx = 0;
		gbc_lblKekTl.gridy = 5;
		panel_2.add(lblKekTl, gbc_lblKekTl);
		
		JLabel lblNewLabel_4 = new JLabel("2 TL");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 5;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		
		Icon rsm4=new ImageIcon("resimler/burn.jpg");
		JLabel lblEnerjiI = new JLabel(rsm4);
		lblEnerjiI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEnerjiI = new GridBagConstraints();
		gbc_lblEnerjiI.insets = new Insets(7, 0, 5, 5);
		gbc_lblEnerjiI.gridx = 0;
		gbc_lblEnerjiI.gridy = 6;
		panel_2.add(lblEnerjiI, gbc_lblEnerjiI);
		
		JLabel lblNewLabel_5 = new JLabel("7 TL");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 6;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		Icon rsm5=new ImageIcon("resimler/rondo.jpg");
		JLabel lblBiskviTl = new JLabel(rsm5);
		lblBiskviTl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblBiskviTl = new GridBagConstraints();
		gbc_lblBiskviTl.insets = new Insets(7, 0, 0, 5);
		gbc_lblBiskviTl.gridx = 0;
		gbc_lblBiskviTl.gridy = 7;
		panel_2.add(lblBiskviTl, gbc_lblBiskviTl);
		
		JLabel lblNewLabel_6 = new JLabel("5 TL");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 7;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
	}

}
