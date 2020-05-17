package contest168;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[][] road = new int[N][N];
		for(int[] x: road){
		    java.util.Arrays.fill(x, 0);
		}
		for(int i = 0; i < M; i++) {
			int from = Integer.parseInt(sc.next()) - 1;
			int to = Integer.parseInt(sc.next()) - 1;
			road[from][to] = road[to][from] =  1;
		}
		sc.close();
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 1; i < N; i++) {
			int goal = dijkstra(road, i, N);
			answer.add(goal);
		}
		if(answer.contains(-1)) {
			System.out.println("No");
			for(int i = 0; i < answer.size(); i++) {
				System.out.println(answer.get(i));
			}
		}else {
			System.out.println("Yes");
			for(int i = 0; i < answer.size(); i++) {
				System.out.println(i);
			}
		}
	}
	public static int dijkstra(int[][] road,int num ,int N) {

		boolean tmpCheck = true;
		int start = num;
		while(tmpCheck) {
			for(int i = 0; i < N; i++) {
				if(road[start][i] == 0 & i == N - 1) {
					tmpCheck = false;
				}

				if(road[start][i] == 1 & i == 0) {
					return start;
				}else if(road[start][i] == 1) {
					start = i;
					continue;
				}
			}
		}
		return -1;

	}

}
