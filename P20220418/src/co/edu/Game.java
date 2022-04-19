package co.edu;

import java.util.Arrays;

// [0],[1],[2],[3],[4] => 1 ~ 5까지 임의 값을 생성.
// [3],[2],[1],[5],[4] => 5가 들어있는 위치를 찾는 게임.
// 1 1 2 3
//1번째 1 엔터.
// 맞췄습니다.
public class Game {
	public static void main(String[] args) {

		int[] num = new int[5];
		System.out.println("랜덤값 생성");

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) ((Math.random() * 5) + 1);

			for (int j = 0; j < i; i++) {

				if (num[i] == num[j]) {
					i--;
					break;
				}

			}

		}
		System.out.println(Arrays.toString(num));
	}

}
