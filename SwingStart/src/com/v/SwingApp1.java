package com.v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class SwingApp1 extends JFrame {

	private JPanel contentPane;
	private JTextField textAd;
	private JTextField textSoyad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingApp1 frame = new SwingApp1();
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
	public SwingApp1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("My First Swing Application");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0130sim");
		lblNewLabel_1.setBounds(74, 29, 19, 14);
		panel_1.add(lblNewLabel_1);
		
		textAd = new JTextField();
		textAd.setBounds(103, 26, 86, 20);
		panel_1.add(textAd);
		textAd.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Soyisim");
		lblNewLabel_2.setBounds(211, 29, 35, 14);
		panel_1.add(lblNewLabel_2);
		
		textSoyad = new JTextField();
		textSoyad.setBounds(256, 26, 86, 20);
		panel_1.add(textSoyad);
		textSoyad.setColumns(10);
		
		JButton btnNewButton = new JButton("Sizi selaml\u0131yorum");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Merhaba");
				JOptionPane.showMessageDialog(contentPane, textAd.getText()+" "+textSoyad.getText());
			}
		});
		btnNewButton.setBounds(152, 78, 150, 23);
		panel_1.add(btnNewButton);
	}
}
