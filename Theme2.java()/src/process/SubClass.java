package process;

import java.util.Random;

public class SubClass extends SuperClass { // SuperClassを継承（extends）し、ステータスを具体的に設定する

    public SubClass(String name) {
        // 名前をSuperClassのフィールドにセット
        setName(name);

        // ランダムにステータス値を生成してセット（毎回変わる）
        Random rand = new Random();
        setHp(rand.nextInt(1000));         // 0〜999のHP
        setMp(rand.nextInt(1000));         // 0〜999のMP
        setAttack(rand.nextInt(500));      // 0〜499の攻撃力
        setSpeed(rand.nextInt(1000));      // 0〜999の素早さ
        setDefense(rand.nextInt(100));     // 0〜99の防御力
    }
}
