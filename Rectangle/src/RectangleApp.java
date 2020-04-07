import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleApp {
	
	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		int choice=0;
		while(choice!=3) {
			
			try {
				choice=menu();			
				switch(choice) {
				case 1:
					createWithParams();
					break;
				case 2:
					createNoParams();
					break;
				case 3:
					System.out.println("Exit..");
					break;
				}
			} catch (MyException e) {
				System.out.println(" *** "+e.getMessage()+" *** ");
			}
			
		}

	}
	public static int menu() throws MyException{
		System.out.print("-----------------------------------\n1--> Create Rectangle With Params\n"
				+ "2--> Create Rectangle No Params\n3--> Exit\nChoice: ");
		int choice;
		Scanner oku=new Scanner(System.in);
		
			
				try {
					choice = oku.nextInt();
				} catch (InputMismatchException e) {
					throw new MyException("Wrong Entry !");
				}catch (Exception e) {
					throw new MyException("Wrong Entry !");
				}
			
		
		if(choice==1 || choice==2 || choice==3) {
		return choice;
		}else {
			throw new MyException("Wrong Entry !");
		}
	}
	public static void createWithParams() throws MyException{
		Scanner oku=new Scanner(System.in);
		
		try {
			System.out.print("Enter Height: ");
			double height=oku.nextDouble();
			System.out.print("Enter Width: ");
			double width=oku.nextDouble();
			Rectangle r1=new Rectangle(width, height);
			System.out.println("Area: "+r1.getArea());
			System.out.println("Circumference: "+r1.getCircumference());
		} catch (Exception e) {
			throw new MyException("Wrong Entry ! - Try Again.");
		}
	}
	public static void createNoParams() throws MyException{
		Scanner oku=new Scanner(System.in);
		try {
			System.out.print("Enter Height: ");
			double height=oku.nextDouble();
			System.out.print("Enter Width: ");
			double width=oku.nextDouble();
			Rectangle r2=new Rectangle();
			r2.setWidth(width);
			r2.setHeight(height);
			System.out.println("Area: "+r2.getArea());
			System.out.println("Circumference: "+r2.getCircumference());
		} catch (Exception e) {
			throw new MyException("Wrong Entry ! - Try Again.");
		}
	}

}
