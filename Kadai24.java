package kadai;

import java.util.concurrent.TimeUnit;

public class Kadai24 {
	//Mainメソッド
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*	数あてゲーム。0から99までの整数を決めてその数字をあてさせるゲーム。
		 *	入力された数字が決めた数より大きいか小さいかを伝え、数を当てさせる。
		 *	何回目で当たり、そこにかかった時間を表示する。
		 */

		int i = 0; //回数カウント用変数。初期値0
		int num; //検索値代入用変数
		System.out.println("0～99までの数字を1つ決めてそれが何回目で当たり、どのくらい時間がかかったか測る数あてゲームです");
		System.out.println("まず整数値を0～99の間で1つ決めて入力してください");
		int search = input();
		System.out.println("それではゲーム開始です\nよーい...");
		try { //5秒間ストップ
			 Thread.sleep(5000);
			 } catch (InterruptedException e) {
			 }
		System.out.println("スタート");
		long start = System.currentTimeMillis(); //スタート時刻取得

		System.out.println("検索値を入力してください");
		do {	//後判定で1回は必ず処理し、数字があたるまで繰り返す
			i++;
			System.out.println(i  + "回目");
			num = input();
			if (num > search) {
				System.out.println("それより小さいです");
			} else if (num < search) {
				System.out.println("それより大きいです");
			}
		} while (num != search);

		long end = System.currentTimeMillis(); //終了時刻取得
		System.out.println("アタリです！\n" + i + "回目で正解しました");
		System.out.println("かかった時間は" + TimeUnit.MILLISECONDS.toSeconds(end - start) + "秒です");
		System.out.println("これでプログラムを終了します");
	}
	//数字入力メソッド
	public static int input() {
		while (true) {
			try {
				int num = new java.util.Scanner(System.in).nextInt();
				if (num >= 0 && num <= 99) {
					return num;
				} else {
					System.out.println("0～99以外の数値が入力されました");
				}
			} catch (Exception e) {
				System.out.println("数字以外が入力されました");
			}
		}
	}
}
