package com.v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class CheckboxRadioButton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxRadioButton frame = new CheckboxRadioButton();
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
	public CheckboxRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Evet Hay\u0131r");
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Evet/Hay\u0131r");
		panel.add(chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		ButtonGroup grp=new ButtonGroup();
		JRadioButton rdbtnkatlyrm = new JRadioButton("Kat\u0131l\u0131yorum");
		panel_1.add(rdbtnkatlyrm);
		
		JRadioButton rdbtnblmyrm = new JRadioButton("Bilmiyorum");
		panel_1.add(rdbtnblmyrm);
		
		JRadioButton rdbtnktlmyrm = new JRadioButton("Kat\u0131lm\u0131yorum");
		panel_1.add(rdbtnktlmyrm);
		
		grp.add(rdbtnktlmyrm);
		grp.add(rdbtnblmyrm);
		grp.add(rdbtnkatlyrm);
		rdbtnktlmyrm.setActionCommand("katýlmýyorum.");
		rdbtnblmyrm.setActionCommand("bilmiyorum.");
		rdbtnkatlyrm.setActionCommand("katýlýyorum.");
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(grp.getSelection()!=null) { //boþken hata vermemesi için
				JOptionPane.showMessageDialog(null, grp.getSelection().getActionCommand());
			}
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(null, "Evet seçildi");
				}else {
					JOptionPane.showMessageDialog(null, "Hayýr seçildi");
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
