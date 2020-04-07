import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

public class Base_Frame extends JFrame {

	private JPanel contentPane;
	JButton btn_onceki = new JButton("<<");
	JButton btn_sonraki = new JButton(">>");
	JButton btn_ilk = new JButton("<");
	JButton btn_son = new JButton(">");
	JButton btn_ekle = new JButton("EKLE");
	JButton btn_sil = new JButton("S\u0130L");
	JButton btn_guncelle = new JButton("G\u00DCNCELLE");
	JButton btn_cikis = new JButton("\u00C7IKI\u015E");
	private final JButton btn_vazgec = new JButton("VAZGE\u00C7");
	private final JPanel panel = new JPanel();
	private final JTextField txt_arama = new JTextField();
	private final JButton btn_ara = new JButton("ARAMA YAP %");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Base_Frame frame = new Base_Frame();
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
	public Base_Frame() {
		txt_arama.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.SOUTH);
		
		
		btn_onceki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				onceki_sonraki_kayit(1);
			}
		});
		
		
		btn_ilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ilk_son_kayit(1);
			}
		});
		toolBar.add(btn_ilk);
		toolBar.add(btn_onceki);
		
		
		btn_sonraki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				onceki_sonraki_kayit(2);
			}
		});
		toolBar.add(btn_sonraki);
		
		
		btn_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				kayit_ekle();
			}
		});
		
		
		btn_son.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ilk_son_kayit(2);
			}
		});
		toolBar.add(btn_son);
		toolBar.add(btn_ekle);
		
		
		btn_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				kayit_sil();
			}
		});
		toolBar.add(btn_sil);
		
		
		btn_guncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				kayit_guncelle();
			}
		});
		toolBar.add(btn_guncelle);
		
		
		btn_cikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				cikis_yap();
			}
		});
		btn_vazgec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				onceki_sonraki_kayit(0);
				txt_arama.setText("");
			}
		});
		
		toolBar.add(btn_vazgec);
		toolBar.add(btn_cikis);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		contentPane.add(panel, BorderLayout.NORTH);
		
		panel.add(txt_arama);
		btn_ara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				arama_yap(txt_arama.getText());
				
			}
		});
		
		panel.add(btn_ara);
		
		
	}
	
	public void kayit_ekle() {
		
	}
	public void kayit_sil() {
	
	}
	public void kayit_guncelle() {
	
	}	
	public void ilk_son_kayit(int deger) {
		
	}	
	public void onceki_sonraki_kayit(int deger) {
		
	}		
	public int kayit_sayisi() {
		return 1;
	}
	public void buton_kontrol() {
		
	}
	public void arama_yap(String deger) {
		
	}	
	public void cikis_yap() {
		
	}
}
