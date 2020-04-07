package com.app1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class SwingToplaCikarApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingToplaCikarApp frame = new SwingToplaCikarApp();
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
	public SwingToplaCikarApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. SAYI");
		lblNewLabel.setBounds(40, 39, 49, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(94, 36, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("2. SAYI");
		lblNewLabel_1.setBounds(199, 39, 49, 14);
		panel.add(lblNewLabel_1);
		
		JButton btncikar = new JButton("\u00C7IKAR");
		btncikar.setBounds(233, 96, 92, 23);
		btncikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int sonuc=Integer.valueOf(textField.getText())-Integer.valueOf(textField_1.getText());
				textField_2.setText(String.valueOf(sonuc));
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setBounds(253, 36, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btntopla = new JButton("TOPLA");
		btntopla.setBounds(70, 96, 100, 23);
		btntopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int sonuc=Integer.valueOf(textField.getText())+Integer.valueOf(textField_1.getText());
				textField_2.setText(String.valueOf(sonuc));
				
				
			}
		});
		btntopla.setBackground(Color.ORANGE);
		panel.add(btntopla);
		btncikar.setBackground(Color.ORANGE);
		panel.add(btncikar);
		
		JLabel lblNewLabel_2 = new JLabel("SONU\u00C7");
		lblNewLabel_2.setBounds(125, 158, 49, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 155, 86, 20);
		textField_2.setEditable(false);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}
