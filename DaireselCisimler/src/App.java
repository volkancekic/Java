import java.util.Scanner;

public class App {
	public static Scanner oku=new Scanner(System.in);
	public static void main(String[] args) {
		char secenek='A';
		while(secenek!='C') {
			secenek=menu();
			switch(secenek) {
			case 'D':
				daire();
				break;
			case 'K':
				kure();
				break;
			case 'S':
				silindir();
				break;
			case 'C':
				System.out.println("Güle güle.");				
				break;	
			}
		}
	}
	public static char menu() {
		System.out.print("----------------\nDaire--> D\nKüre--> K\nSilindir--> S\nÇýkýþ--> C\nSeçiminz: ");
		char secim=oku.next().charAt(0);
		return secim;
	}
	public static void daire() {
		System.out.print("Dairenin yarýçapý: ");
		Daire daire1=new Daire(oku.nextDouble());
		System.out.println("Dairenin çevresi: "+daire1.cevre(daire1.getYaricap()));
		System.out.println("Dairenin alaný: "+daire1.alan(daire1.getYaricap()));
		
	}
	public static void kure() {
		System.out.print("Kürenin yarýçapý: ");
		Kure kure1=new Kure(oku.nextDouble());
		System.out.println("Kürenin çevresi: "+kure1.cevre(kure1.getYaricap()));
		System.out.println("Kürenin alaný: "+kure1.alan(kure1.getYaricap()));
		System.out.println("Kürenin hacimi: "+kure1.hacim(kure1.getYaricap()));
	}
	public static void silindir() {
		System.out.print("Silindirin yarýçapý yüksekliði: ");
		Silindir silindir1=new Silindir(oku.nextDouble(), oku.nextDouble());
		System.out.println("Silindirin çevresi: "+silindir1.cevre(silindir1.getYaricap()));
		System.out.println("Silindirin alaný: "+silindir1.alan(silindir1.getYaricap(), silindir1.getYukseklik()));
		System.out.println("Silindirin hacimi: "+silindir1.hacim(silindir1.getYaricap(), silindir1.getYukseklik()));
	}

}
