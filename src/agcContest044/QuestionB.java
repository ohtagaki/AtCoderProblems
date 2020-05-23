package agcContest044;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		boolean[][] seat = new boolean[N][N];
		for(int i = 0; i < N * N; i++) {
			list.add(Integer.parseInt(sc.next()) - 1);
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				seat[i][j] = false;
			}
		}
		sc.close();

		int[] dx = {0,1,0,-1};
		int[] dy = {-1,0,1,0};

		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			int sy = list.get(i) / N;
			int sx = list.get(i) % N;
			boolean checkCount = run(N, sx, sy, seat, dx, dy);
			if(checkCount) count++;
		}
		System.out.println(count);
	}

	public static boolean run(int N ,int x, int y , boolean[][] seat, int[] dx, int[] dy) {
		boolean check = false;
		//スタックを作成、スタート地点を先頭に追加し、スタート地点を探索済みにする
		Deque<Point> stack = new ArrayDeque<Point>();
		stack.addFirst(new Point(x,y));
		seat[y][x] = true;
		System.out.println(y + " " + x);

		//ここからスタックを用いた深さ優先探索
		while (!stack.isEmpty()) {
			Point p = stack.removeFirst(); //先頭の座標を取得後、削除
			for (int i=0; i<4; i++) {
				//forループで、上下左右に分岐させる
				int tmpX = p.x + dx[i];
				int tmpY = p.y + dy[i];
				System.out.println(tmpY + "::" + tmpX);
				if(tmpX % N == 0 || tmpX % N == N - 1 || tmpY < N || N * (N - 1) < tmpY) {
					check = true;
					return check;
				}
				if (seat[tmpY][tmpX]) {
						stack.addFirst(new Point(tmpX,tmpY));
						seat[tmpY][tmpX] = true; //追加した座標を探索済みにする
				}

			}
		}
		return check;
	}
}

class Point {
	int x;
	int y;
	Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
}
