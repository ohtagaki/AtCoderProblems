package contest167;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int[] C = new int[N];
		int[][] A = new int[N][M];
		int[] sat = new int[M];
		int cost = 0;
		for(int i = 0; i < N; i++) {
			C[i] = Integer.parseInt(sc.next());
			cost += C[i];
			for(int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(sc.next());
				sat[j] = 0;
			}
		}
		sc.close();

		for(int i = 0; i < N; i++) {
			boolean[] check = new boolean[M];
			Arrays.fill(check, false);
			Arrays.fill(sat, 0);
			int tmpCost = 0;
			for(int j = 0; j < M; j++) {
				tmpCost += C[i];
				sat[j] += A[i][j];
				if(sat[j] >= X) {
					check[j] = true;
				}
				if(!Arrays.asList(check).contains(false)) {
					cost = tmpCost;
					continue;
				}
			}

			for(int k = i + 1; k < N; k++) {
				for(int x = k; x < N; x++) {
					for(int l = 0; l < M; l++) {
						tmpCost += C[x];
						sat[l] += A[x][l];
						if(sat[l] >= X) {
							check[l] = true;
						}
					}
					if(!Arrays.asList(check).contains(false)) {
						if(cost > tmpCost) {
							cost = tmpCost;
						}
						tmpCost = 0;
						for(int j = 0; j < M; j++) {
							tmpCost += C[i];
							sat[j] += A[i][j];
							if(sat[j] >= X) {
								check[j] = true;
							}
						}
						continue;
					}
				}
			}
		}
		System.out.println(cost);


	}

}
