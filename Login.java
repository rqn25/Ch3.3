
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter username");
		String ccNo = keyboard.nextLine();
		String ccString = String.valueOf(ccNo);
		if(ccString.matches("Robert")) {
		System.out.println("Enter password");
		String ccNo2 = keyboard.nextLine();
		String ccString2 = String.valueOf(ccNo2);
		if(ccString2.matches("xxx")) {
		System.out.println("Welcome Robert");
		} else {
		System.out.println("Wrong username or password");
		
		}
		
		} else {
		System.out.println("Enter password");
		String ccNo2 = keyboard.nextLine();
		@SuppressWarnings("unused")
		String ccString2 = String.valueOf(ccNo2);
		System.out.println("Wrong username or password");
		}
		keyboard.close();
	}
}
