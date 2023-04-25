import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class b2739 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		
		for(int i=1; i<10; i++) {
			int mul=N*i;
			System.out.println(N + " * " + i + " = " + mul);
		}
	}

}
