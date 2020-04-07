package com.loginKontrolAppWFile;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondWind extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textYas;
	private JTextField textSehir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SecondWind dialog = new SecondWind();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SecondWind() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Ya\u015F\u0131n\u0131z");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 3;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textYas = new JTextField();
			GridBagConstraints gbc_textYas = new GridBagConstraints();
			gbc_textYas.insets = new Insets(0, 0, 5, 5);
			gbc_textYas.fill = GridBagConstraints.HORIZONTAL;
			gbc_textYas.gridx = 5;
			gbc_textYas.gridy = 1;
			contentPanel.add(textYas, gbc_textYas);
			textYas.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\u015Eehir");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_1.gridx = 3;
			gbc_lblNewLabel_1.gridy = 2;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textSehir = new JTextField();
			GridBagConstraints gbc_textSehir = new GridBagConstraints();
			gbc_textSehir.insets = new Insets(0, 0, 0, 5);
			gbc_textSehir.fill = GridBagConstraints.HORIZONTAL;
			gbc_textSehir.gridx = 5;
			gbc_textSehir.gridy = 2;
			contentPanel.add(textSehir, gbc_textSehir);
			textSehir.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String yas=textYas.getText();
						String sehir=textSehir.getText();
						SwingApp2 swapp2=new SwingApp2();
						setVisible(false);
						swapp2.setVisible(true);
						swapp2.scw_gelen_mesaj(yas, sehir);
						
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
