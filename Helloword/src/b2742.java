import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class b2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		
		for(int i=N; i>0; i--)
			System.out.println(i);
	}

}
