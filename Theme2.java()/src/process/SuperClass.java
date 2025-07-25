package process; // ステータス関連の処理をまとめるパッケージ

public class SuperClass { // スーパークラス：共通する情報（名前やステータス）を持つ
    private String name;     // 名前（外から直接触れないようprivate）
    private int hp;          // HP（体力）
    private int mp;          // MP（魔力）
    private int attack;      // 攻撃力
    private int speed;       // 素早さ
    private int defense;     // 防御力

    // コンストラクタ：オブジェクト生成時に初期値を設定する
    public SuperClass() {
        // 初期化処理はsubclassで行う
    }

    // 以下は全てフィールドへのgetterとsetter（カプセル化の基本）

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // 引数で受け取ったnameをフィールドに代入
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
