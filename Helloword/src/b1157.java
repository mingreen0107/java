import java.util.Scanner;

public class b1157 {

	public static void main(String[] args) {
		// 모든 인덱스의 값은 0으로 자동 초기화 됨
		// 만약 모든 요소를 1로 초기화하고 싶다면
		// int[] = engnum = new int[26];
		// Arrays.fill(engnum, 1); 로 하면 됨
		int[] engnum = new int[26];
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		scan.close();
		
		for(int i=0; i<A.length(); i++) {
			if('A'<=A.charAt(i) && A.charAt(i)<='Z') {
				engnum[A.charAt(i)-65]++;
			}
			else {
				// a만큼 빼서 인덱스에 저장
				engnum[A.charAt(i)-'a']++;
			}
		}
		int max=-1;
		char ch='?';
		
		for(int i=0; i<26; i++) {
			if(engnum[i]>max) {
				max=engnum[i];
				// 다시 대문자로 변경
				ch=(char)(i+65); 
			}
			else if(engnum[i]==max) {
				// 반복문으로 하다가 똑같이 많이 나온 문자면 ?로 변경
				ch = '?';
			}
		}
		
		System.out.println(ch);

	}

}
