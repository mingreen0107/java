import java.util.Scanner;
import java.util.StringTokenizer;

public class b1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		scan.close();
		
		StringTokenizer st = new StringTokenizer(A);
		
		System.out.println(st.countTokens());

	}

}