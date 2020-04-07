import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@SessionScoped
public class Anket {
	static Connection myConn;
	private String ad;
	private String soyad;
	private String cinsiyet;
	private String sehir;
	private String yas;
	private String ogrenim_durumu;
	private String sektor;
	private String gelir;
	private String[] harcama;
	private String[] bos_zaman;
	
	private static List<String> sehirlerlistesi;
	private static List<String> ogr_durum;
	private static List<String> aylik_gelir;
	static {
		sehirlerlistesi=new ArrayList<String>();
		
		sehirlerlistesi.add("Adana");
		sehirlerlistesi.add("Ad�yaman");
		sehirlerlistesi.add("Afyonkarahisar");
		sehirlerlistesi.add("A�r�");
		sehirlerlistesi.add("Amasya");
		sehirlerlistesi.add("Ankara");
		sehirlerlistesi.add("Antalya");
		sehirlerlistesi.add("Artvin");
		sehirlerlistesi.add("Ayd�n");
		sehirlerlistesi.add("Bal�kesir");
		sehirlerlistesi.add("Bilecik");
		sehirlerlistesi.add("Bing�l");
		sehirlerlistesi.add("Bitlis");
		sehirlerlistesi.add("Bolu");
		sehirlerlistesi.add("Burdur");
		sehirlerlistesi.add("Bursa");
		sehirlerlistesi.add("�anakkale");
		sehirlerlistesi.add("�ank�r�");
		sehirlerlistesi.add("�orum");
		sehirlerlistesi.add("Denizli");
		sehirlerlistesi.add("Diyarbak�r");
		sehirlerlistesi.add("Edirne");
		sehirlerlistesi.add("Elaz��");
		sehirlerlistesi.add("Erzincan");
		sehirlerlistesi.add("Erzurum");
		sehirlerlistesi.add("Eski�ehir");
		sehirlerlistesi.add("Gaziantep");
		sehirlerlistesi.add("Giresun");
		sehirlerlistesi.add("G�m��hane");
		sehirlerlistesi.add("Hakkari");
		sehirlerlistesi.add("Hatay");
		sehirlerlistesi.add("Isparta");
		sehirlerlistesi.add("Mersin");
		sehirlerlistesi.add("�stanbul");
		sehirlerlistesi.add("�zmir");
		sehirlerlistesi.add("Kars");
		sehirlerlistesi.add("Kastamonu");
		sehirlerlistesi.add("Kayseri");
		sehirlerlistesi.add("Adana");
		sehirlerlistesi.add("K�rklareli");
		sehirlerlistesi.add("K�r�ehir");
		sehirlerlistesi.add("Konya");
		sehirlerlistesi.add("K�tahya");
		sehirlerlistesi.add("Malatya");
		sehirlerlistesi.add("Manisa");
		sehirlerlistesi.add("Kahramanmara�");
		sehirlerlistesi.add("Mardin");
		sehirlerlistesi.add("Mu�la");
		sehirlerlistesi.add("Mu�");
		sehirlerlistesi.add("Nev�ehir");
		sehirlerlistesi.add("Ni�de");
		sehirlerlistesi.add("Ordu");
		sehirlerlistesi.add("Rize");
		sehirlerlistesi.add("Sakarya");
		sehirlerlistesi.add("Samsun");
		sehirlerlistesi.add("Siirt");
		sehirlerlistesi.add("Sinop");
		sehirlerlistesi.add("Sivas");
		sehirlerlistesi.add("Tekirda�");
		sehirlerlistesi.add("Tokat");
		sehirlerlistesi.add("Trabzon");
		sehirlerlistesi.add("Tunceli");
		sehirlerlistesi.add("�anl�urfa");
		sehirlerlistesi.add("U�ak");
		sehirlerlistesi.add("Van");
		sehirlerlistesi.add("Yozgat");
		sehirlerlistesi.add("Zonguldak");
		sehirlerlistesi.add("Aksaray");
		sehirlerlistesi.add("Bayburt");
		sehirlerlistesi.add("Karaman");
		sehirlerlistesi.add("K�r�kkale");
		sehirlerlistesi.add("Batman");
		sehirlerlistesi.add("��rnak");
		sehirlerlistesi.add("Bart�n");
		sehirlerlistesi.add("Ardahan");
		sehirlerlistesi.add("I�d�r");
		sehirlerlistesi.add("Yalova");
		sehirlerlistesi.add("Karab�k");
		sehirlerlistesi.add("Kilis");
		sehirlerlistesi.add("Osmaniye");
		sehirlerlistesi.add("D�zce");
		
	}
	static {
		ogr_durum=new ArrayList<String>();
		ogr_durum.add("Ilkokul");
		ogr_durum.add("Lise");
		ogr_durum.add("Universite");
		ogr_durum.add("Diger");
	}
	static {
		aylik_gelir=new ArrayList<String>();
		aylik_gelir.add("1000tl-2000tl");
		aylik_gelir.add("2000tl-3000tl");
		aylik_gelir.add("3000tl-4000tl");
		aylik_gelir.add("4000tl ve uzeri");
	}
	public Anket() {
		System.out.println("Default Constructor �al��t�");			
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getOgrenim_durumu() {
		return ogrenim_durumu;
	}

	public void setOgrenim_durumu(String ogrenim_durumu) {
		this.ogrenim_durumu = ogrenim_durumu;
	}

	public String getSektor() {
		return sektor;
	}

	public void setSektor(String sektor) {
		this.sektor = sektor;
	}

	public String getGelir() {
		return gelir;
	}

	public void setGelir(String gelir) {
		this.gelir = gelir;
	}

	public String[] getHarcama() {
		return harcama;
	}

	public void setHarcama(String[] harcama) {
		this.harcama = harcama;
	}

	public String[] getBos_zaman() {
		return bos_zaman;
	}

	public void setBos_zaman(String[] bos_zaman) {
		this.bos_zaman = bos_zaman;
	}

	public List<String> getSehirlerlistesi() {
		return sehirlerlistesi;
	}

	public void setSehirlerlistesi(List<String> sehirlerlistesi) {
		this.sehirlerlistesi = sehirlerlistesi;
	}

	public List<String> getOgr_durum() {
		return ogr_durum;
	}

	public void setOgr_durum(List<String> ogr_durum) {
		this.ogr_durum = ogr_durum;
	}

	public List<String> getAylik_gelir() {
		return aylik_gelir;
	}

	public void setAylik_gelir(List<String> aylik_gelir) {
		this.aylik_gelir = aylik_gelir;
	}
	public String getDb_connection() {
		String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		
		
		try {
			myConn = DriverManager.getConnection(dbUrl,"java","java");
			System.out.println("Baglanti basarili.");
			
			db_add();//kay�t ekleme metodu
			
			myConn.close();//db ba�lant�s� kapand�.
			System.out.println("Veritaban� Ba�lant�s� Kapat�ld�");
			
		} catch (SQLException e) {
			System.out.println("Veritaban� Ba�lant� Hatas�");
			
		}
		return "";
	}
	public void db_add() {	
		
		
		/*HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null) {
		    ipAddress = request.getRemoteAddr();
		}*/
		 InetAddress addr=null;
		 String ipAddress="";
		try {
			addr = InetAddress.getLocalHost();
			   ipAddress = addr.getHostAddress();			     
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		   
		   
		
		
		String harcamalar="";
		for(int i=0;i<harcama.length;i++) {
			harcamalar+=harcama[i];
		}
		
		String bos_zamanlar="";
		for(int i=0;i<bos_zaman.length;i++) {
			bos_zamanlar+=bos_zaman[i];
		}
		String sql="insert into anketdb (ad, soyad, cinsiyet, sehir, yas, ogr_durum, sektor, gelir, harcama, bos_zaman, ip_adres) values ('"+ad+"','"+soyad+"','"+cinsiyet+"','"+sehir+"','"+yas+"','"+ogrenim_durumu+"','"+sektor+"','"+gelir+"','"+harcamalar+"','"+bos_zamanlar+"','"+ipAddress+"')";
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			int rset=stmt.executeUpdate(sql);
			System.out.println("Ekleme ��lemi Ba�ar�l�");			
		
		} catch (SQLException e) {
			//System.out.println("Ekleme ��leminde Hata Olu�tu");
			System.out.println(e);
		}
	}

}
