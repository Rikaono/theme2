package main;

 import java.util.Scanner;

import process.SubClass; // サブクラスをインポート

public class main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // ユーザーからの入力を受け取るScanner

	        System.out.print("名前を入力してください：");
	        String inputName = scanner.nextLine(); // 入力された名前を取得

	        SubClass player = new SubClass(inputName); // 入力された名前でキャラを作成（SubClassのコンストラクタが動く）

	        // 結果を出力
	        System.out.println("\nこんにちは 「 " + player.getName() + " 」 さん");
	        System.out.println("ステータス");
	        System.out.println("HP：" + player.getHp());
	        System.out.println("MP：" + player.getMp());
	        System.out.println("攻撃力：" + player.getAttack());
	        System.out.println("素早さ：" + player.getSpeed());
	        System.out.println("防御力：" + player.getDefense());
	        System.out.println("\nさあ冒険に出かけよう！");

	        scanner.close(); // Scannerを閉じる（リソース解放）
	    }
	}
