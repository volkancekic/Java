
public class Otomobil implements Arac{
	String marka;
	int hiz=0;
	
	public Otomobil(String marka) {
		super();
		this.marka = marka;
		System.out.println(marka+" marka otomobil oluşturuldu.");
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	@Override
	public int hizlan(int degisim) {
		this.hiz=degisim;
		System.out.println("otomobil "+degisim+" kadar hızlandı");
		return this.hiz;
	}

	@Override
	public int yavasla(int degisim) {
		this.hiz=degisim;
		System.out.println("otomobil "+degisim+" kadar yavasladı");
		return this.hiz;
	}
	
	
	
	
}
