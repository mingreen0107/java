import java.util.Scanner;

public class b1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double[] score = new double[1000];
		double max=-1;
		double sum=0;
		
		for(int i=0; i<N; i++) {
			score[i] = scan.nextInt();
			
			if(score[i]>=max)
				max=score[i];
		}
		for(int i=0; i<N; i++) {
			score[i]= (score[i]/max)*100;
			sum+=score[i];
		}
		System.out.println(sum/N);
		
		scan.close();
	}

}
