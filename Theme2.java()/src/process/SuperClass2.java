package process;

public class SuperClass2 {
	
    protected String name;      // 名前を保持するフィールド
    protected double length;    // 長さを保持するフィールド
    protected int speed;        // スピードを保持するフィールド

    public SuperClass2(String name, double length, int speed) {
        this.name = name;         // フィールドnameに引数nameを代入
        this.length = length;     // フィールドlengthに引数lengthを代入
        this.speed = speed;       // フィールドspeedに引数speedを代入
    }

    public String getName() {     
        return name;                // nameを返す
    }

    public double getLength() {
        return length;              // lengthを返す
    }

    public int getSpeed() {
        return speed;               // speedを返す
    }
}
