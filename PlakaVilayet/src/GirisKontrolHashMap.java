import java.util.HashMap;
import java.util.Scanner;

public class GirisKontrolHashMap {

	public static void main(String[] args) {
		
		HashMap<String,String> users=new HashMap<>();
		users.put("ali@1", "123");
		users.put("ali@2", "456");
		users.put("ali@3", "789");
		users.put("ali@4", "012");
		users.put("ali@5", "901");
		users.put("ali@6", "990");
		users.put("ali@7", "1a2");
		users.put("ali@8", "34b");
		users.put("ali@9", "Ankara");
		
		
		Scanner oku=new Scanner(System.in);
		System.out.print("-------- LOGIN --------\nUser name: ");
		String userName=oku.next();
		System.out.print("Password: ");
		String password=oku.next();
		
		if(users.containsKey(userName) && users.get(userName).equals(password)) {
			System.out.println("Login is Succeed.");
		}else {
			System.out.println("Check Your User Name or Password !");
		}
		
	
	}

}
