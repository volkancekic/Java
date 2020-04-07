
public class Otobus implements Arac{
	int kapasite;
	int hiz=0;
	
	public Otobus(int kapasite) {
		super();
		this.kapasite = kapasite;
		System.out.println(kapasite+" kapasiteli otob�s olu�turuldu.");
	}
	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	
	@Override
	public int yavasla(int degisim) {
		this.hiz=degisim;
		System.out.println("otob�s "+degisim+" kadar yavaslad�");
		return this.hiz;
	}
	@Override
	public int hizlan(int degisim) {
		this.hiz=degisim;
		System.out.println("otob�s "+degisim+" kadar h�zland�");
		return this.hiz;
	}
	
}
