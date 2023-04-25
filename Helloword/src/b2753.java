// 윤년이면 1 아니면 0을 출력하는 문제
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class b2753 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		
		if(N%4==0) {
			if(N%100!=0 || N%400==0)
				System.out.println(1);
			else
				System.out.println(0);
		}
		else
			System.out.println(0);
	}

}
