// 알람 설정으로 주어진 숫자보다 45분 일찍 일어나는 것을 목표로 한다.
import java.util.Scanner;

public class b2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		scan.close();
		
		int time=H*60+M;
		if(time-45<0) {
			time=(24*60+M)-45;
			H=time/60;
			M=time-H*60;
		}
		else {
			time=(H*60+M)-45;
			H=time/60;
			M=time-H*60;
		}
		System.out.print(H + " ");
		System.out.print(M);
	}

}
