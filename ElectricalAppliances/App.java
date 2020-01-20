package com.ElektrikliCihaz;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static int i;
	public static String enerjiSinifi="",marka="",renk="",ses="",kapasite="",
			programSayisi="",icHacim="",model="",ram="",islemci="",disk="";
	public static int watt=0,voltaj=0,kapakSayisi=0,hatSayisi=0;
	
	public static void main(String[] args) {
		ArrayList<ElektrikliCihaz> list=new ArrayList<ElektrikliCihaz>();
		
		int sayi;
		int secenek;
		Scanner oku=new Scanner(System.in);
		System.out.print("Gireceðiniz Ürün Sayisi: ");
		sayi=oku.nextInt();
		i=sayi;
		while(i!=0) {
		System.out.print("Lütfen seçiminizi yapýnýz.\n1) Beyaz Eþya\n2) Elektronik Eþya ");
		secenek=oku.nextInt();
		switch(secenek) {
		case 1:
			System.out.print("\n1) Bulaþýk Makinesi\n2) Buzdolabý\n3) Çamaþýr Makinesi ");
			secenek=oku.nextInt();
				switch(secenek) {
					case 1:						
						System.out.println("enerjiSinifi, watt, voltaj, marka, renk, ses, kapasite, programSayisi giriniz: ");
						enerjiSinifi=oku.next();
						watt=oku.nextInt();
						voltaj=oku.nextInt();
						marka=oku.next();
						renk=oku.next();
						ses=oku.next();
						kapasite=oku.next();
						programSayisi=oku.next();						
						BulasikMakinesi bm=new BulasikMakinesi(enerjiSinifi, watt, voltaj, marka, renk, ses, kapasite, programSayisi); 
						list.add(bm);						
						break;
					case 2:
						System.out.println("enerjiSinifi, watt, voltaj, marka, renk, ses, içHacim, kapakSayisi giriniz: ");
						enerjiSinifi=oku.next();
						watt=oku.nextInt();
						voltaj=oku.nextInt();
						marka=oku.next();
						renk=oku.next();
						ses=oku.next();
						icHacim=oku.next();
						kapakSayisi=oku.nextInt();				
						Buzdolabi bz=new Buzdolabi(enerjiSinifi, watt, voltaj, marka, renk, ses, icHacim, kapakSayisi); 
						list.add(bz);					
						break;
					case 3:
						System.out.println("enerjiSinifi, watt, voltaj, marka, renk, ses, kapasite, programSayisi giriniz: ");
						enerjiSinifi=oku.next();
						watt=oku.nextInt();
						voltaj=oku.nextInt();
						marka=oku.next();
						renk=oku.next();
						ses=oku.next();
						kapasite=oku.next();
						programSayisi=oku.next();						
						CamasirMakinesi cm=new CamasirMakinesi(enerjiSinifi, watt, voltaj, marka, renk, ses, kapasite, programSayisi); 
						list.add(cm);						
						break;	
				}
			break;
		case 2:
			System.out.print("\n1) Cep Telefonu\n2) Bilgisayar ");
			secenek=oku.nextInt();
				switch(secenek) {
				case 1:
					System.out.println("marka, model, hatSayisi giriniz: ");
					enerjiSinifi=" ";
					watt=0;
					voltaj=0;
					marka=oku.next();
					model=oku.next();
					hatSayisi=oku.nextInt();
					CepTelefonu ct=new CepTelefonu(enerjiSinifi, watt, voltaj, marka, model, hatSayisi);
					list.add(ct);
					break;
				case 2:
					System.out.println("watt, voltaj, marka, ram, islemci,disk giriniz: ");
					enerjiSinifi=" ";
					watt=oku.nextInt();
					voltaj=oku.nextInt();
					marka=oku.next();					
					ram=oku.next();
					islemci=oku.next();
					disk=oku.next();
					Bilgisayar bg=new Bilgisayar(enerjiSinifi, watt, voltaj, marka, ram, islemci, disk);
					list.add(bg);
					break;					
				}
			break;
		}
		i--;
	}//while son
		System.out.println("----------ÜRÜN LÝSTESÝ-------------");
		for(ElektrikliCihaz ec:list) {
			System.out.println(ec);
		}

	}

}
