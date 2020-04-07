package com.v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class AnasayfaApp extends JFrame {
	
	
	static BagliListe myLinkedList=new BagliListe();
	   
	
	private JPanel contentPane;
	private JTextField txt_isim;
	private JTextField txt_soyisim;
	private JTextField txtKaytlar;
	
	DefaultListModel<String> df = new DefaultListModel<>(); 	
	JList list = new JList(df);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnasayfaApp frame = new AnasayfaApp();
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
	public AnasayfaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Ad:");
		panel.add(lblNewLabel);
		
		txt_isim = new JTextField();
		panel.add(txt_isim);
		txt_isim.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Soyad:");
		panel.add(lblNewLabel_1);
		
		txt_soyisim = new JTextField();
		panel.add(txt_soyisim);
		txt_soyisim.setColumns(10);
		
		JButton btn_ekle = new JButton("EKLE");
		btn_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

				String isim=txt_isim.getText();
				String soyisim=txt_soyisim.getText();
				
				Kisi k=context.getBean("kisi",Kisi.class);
				k.setIsim(isim);
				k.setSoyisim(soyisim);
				
				myLinkedList.contains(k);
				
				if(myLinkedList.getSize()<5) {
				
				myLinkedList.add(k);				
				myLinkedList.printNodes();				
				
				}else {
					myLinkedList.removeLastNode();					
					myLinkedList.add(k);					
					myLinkedList.printNodes();
					
				}
				df.clear();			
				Node imlec=myLinkedList.getFirstNode();
				for(int i=0;i<=myLinkedList.getSize()-1;i++) {					
					df.addElement(imlec.getKisi().toString());
					imlec=imlec.getNextNode();
				}
			
				context.close();
				
			}
		});
		panel.add(btn_ekle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.NORTH);
		
		txtKaytlar = new JTextField();
		txtKaytlar.setFont(new Font("Calibri Light", Font.BOLD, 14));
		txtKaytlar.setHorizontalAlignment(SwingConstants.CENTER);
		txtKaytlar.setText("KAYITLAR ");
		txtKaytlar.setEditable(false);
		panel_4.add(txtKaytlar);
		txtKaytlar.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5, BorderLayout.SOUTH);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Calibri", Font.BOLD, 18));
		
		
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(list, BorderLayout.CENTER);
	}

}
