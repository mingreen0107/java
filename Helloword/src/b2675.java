// 새로운 것으로 입력 받는 연습해보기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class b2675 {
	// BufferedReader 사용법
	// readLine(); 로 받고
	// throws IOException으로 예외처리 해주기
	public static void main(String[] args) throws IOException {
 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 무조건 string으로 인식되기 때문에 형변환 해주기
		int T = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < T; i++) {
			// 공백을 기분으로 나누기
			String[] str = in.readLine().split(" ");
			// 0번째에 R을 저장
			int R = Integer.parseInt(str[0]);	
			// 그 이후의 것은 index 1번부터 저장
			String S = str[1];
			// 입력 받은 S를 하나씩 나누어 R만큼 반복
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}