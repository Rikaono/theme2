package run;

import logic.AnimalInfo;

public class RunAnimal {
	 // mainメソッド（実行用）
    public static void main(String[] args) {
        AnimalInfo lion = new AnimalInfo();  // インスタンス作成

        // setterを使って値を代入
        lion.setName("ライオン");      //動物の名前を出力メソッドにsetterを通して代入       
        lion.setLength(2.1);          //動物の体長を代入
        lion.setSpeed(80);            //動物の速度を代入

        // 結果を出力
        lion.printInfo();
        
    }
}
