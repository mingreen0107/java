import java.util.Scanner;

public class b2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int a=0;
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		scan.close();
		
		int D = A*B*C;
		
		while(D>0) {
			a=D%10;
			num[a]++;
			D/=10;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(num[i]);
		}
	}

}
