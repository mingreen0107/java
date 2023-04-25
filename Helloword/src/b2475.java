import java.util.Scanner;

public class b2475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum=0;
		
		for(int i=0; i<5; i++) {
			num[i] = scan.nextInt();
			num[i] = num[i]*num[i];
			sum+=num[i];
		}
		System.out.print(sum%10);
	}
}