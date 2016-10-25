import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		HelloUser user = new HelloUser(name);
		user.greetUser();
		sc.close();
	}

}
