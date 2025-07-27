package main;

import java.util.Scanner;

import process.SubClass2;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);          // Scannerオブジェクトを生成し、コンソール入力を受け取る準備をする


        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();                   // 1行分の文字列を読み込む

        String[] animals = input.split(",");                 // 入力された文字列をカンマで分割し、動物ごとの配列を作成

        for (String animal : animals) {                      // 動物情報ごとにループ処理
            String[] parts = animal.split(":");              // コロンで名前、長さ、速度の3要素に分割
            String name = parts[0];                          // 動物の名前を取得
            double length = Double.parseDouble(parts[1]);    // 長さを文字列からdouble型に変換
            int speed = Integer.parseInt(parts[2]);          // 速度を文字列からint型に変換

            SubClass2 animalObj = new SubClass2(name, length, speed);         // SubClass2のインスタンスを生成
            animalObj.printInfo();                                           // 生成したインスタンスの情報を出力
        }

        scanner.close();
    }
}
