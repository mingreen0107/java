import java.util.Scanner;

public class b2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] inputNum = new int[9];
		int max=-1, count = 0;
		
		for(int i=0; i<9; i++) {
			inputNum[i] = scan.nextInt();
		}
		// 최댓값 구하는 함수
		for(int i=0; i<9; i++) {
			if(inputNum[i]>max) {
				max=inputNum[i];
				count=i;
			}		
		}
		System.out.println(max);
		System.out.println(count+1);
		
		scan.close();
	}

}
