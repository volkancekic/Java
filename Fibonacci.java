import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int sayi;
		Scanner oku=new Scanner(System.in);
		System.out.print("Hesaplanacak Fibonacci adýmýný giriniz: ");
		sayi=oku.nextInt();
		for(int i=0;i<=sayi;i++) {
		System.out.print(Fibonacci(i)+" ");
		}
		
		
	}
	public static int Fibonacci(int n) {
		if(n==0) {
			return 0;			
		}
		else if(n==1) {
			return 1;		
		}
		else {
			return (Fibonacci(n-1)+Fibonacci(n-2));			
		}
	}

}
