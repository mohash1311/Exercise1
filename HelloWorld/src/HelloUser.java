import java.util.Scanner;

public class HelloUser {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		String userName;
		System.out.print("Please enter your name: ");
		userName=userInput.next();
		
		System.out.println("Hello " + userName +"!");
		
	}
}
