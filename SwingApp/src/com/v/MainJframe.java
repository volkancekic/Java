package com.v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MainJframe extends JFrame {

	private JPanel contentPane;
	private JTextField textisim;
	private JTextField textfielduyuru;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJframe frame = new MainJframe();
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
	public MainJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("isim");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textisim = new JTextField();
		GridBagConstraints gbc_textisim = new GridBagConstraints();
		gbc_textisim.insets = new Insets(0, 0, 5, 5);
		gbc_textisim.fill = GridBagConstraints.HORIZONTAL;
		gbc_textisim.gridx = 6;
		gbc_textisim.gridy = 2;
		contentPane.add(textisim, gbc_textisim);
		textisim.setColumns(10);
		
		JButton btnkaydet = new JButton("Kaydet");
		btnkaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String isim=textisim.getText();
				Jdialog2 jd=new Jdialog2();
				jd.setVisible(true);				
				jd.mesajgelen(isim);				
				textfielduyuru.setText("diðer frame çalýþtý sonra buraya geldik.");
				
			}
		});
		
		textfielduyuru = new JTextField();
		textfielduyuru.setEditable(false);
		GridBagConstraints gbc_textfielduyuru = new GridBagConstraints();
		gbc_textfielduyuru.insets = new Insets(0, 0, 5, 5);
		gbc_textfielduyuru.fill = GridBagConstraints.HORIZONTAL;
		gbc_textfielduyuru.gridx = 6;
		gbc_textfielduyuru.gridy = 4;
		contentPane.add(textfielduyuru, gbc_textfielduyuru);
		textfielduyuru.setColumns(10);
		GridBagConstraints gbc_btnkaydet = new GridBagConstraints();
		gbc_btnkaydet.gridx = 7;
		gbc_btnkaydet.gridy = 6;
		contentPane.add(btnkaydet, gbc_btnkaydet);
	}

}
