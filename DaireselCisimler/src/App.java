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
				System.out.println("G�le g�le.");				
				break;	
			}
		}
	}
	public static char menu() {
		System.out.print("----------------\nDaire--> D\nK�re--> K\nSilindir--> S\n��k��--> C\nSe�iminz: ");
		char secim=oku.next().charAt(0);
		return secim;
	}
	public static void daire() {
		System.out.print("Dairenin yar��ap�: ");
		Daire daire1=new Daire(oku.nextDouble());
		System.out.println("Dairenin �evresi: "+daire1.cevre(daire1.getYaricap()));
		System.out.println("Dairenin alan�: "+daire1.alan(daire1.getYaricap()));
		
	}
	public static void kure() {
		System.out.print("K�renin yar��ap�: ");
		Kure kure1=new Kure(oku.nextDouble());
		System.out.println("K�renin �evresi: "+kure1.cevre(kure1.getYaricap()));
		System.out.println("K�renin alan�: "+kure1.alan(kure1.getYaricap()));
		System.out.println("K�renin hacimi: "+kure1.hacim(kure1.getYaricap()));
	}
	public static void silindir() {
		System.out.print("Silindirin yar��ap� y�ksekli�i: ");
		Silindir silindir1=new Silindir(oku.nextDouble(), oku.nextDouble());
		System.out.println("Silindirin �evresi: "+silindir1.cevre(silindir1.getYaricap()));
		System.out.println("Silindirin alan�: "+silindir1.alan(silindir1.getYaricap(), silindir1.getYukseklik()));
		System.out.println("Silindirin hacimi: "+silindir1.hacim(silindir1.getYaricap(), silindir1.getYukseklik()));
	}

}
