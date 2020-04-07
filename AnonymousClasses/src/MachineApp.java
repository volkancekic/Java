
public class MachineApp {

	public static void main(String[] args) {
		
		Machine m=new Machine();
		m.start();
		
		
		Machine mnew =new Machine() {
			@Override
			public void start() {
				System.out.println("wooo");
			}
		};
		mnew.start();
		//sadece o nesneye özgü bir deðiþim söz konusu genel olarak class yapýsý deðiþmez...
	}

}
