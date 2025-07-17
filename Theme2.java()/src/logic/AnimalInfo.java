package logic;

public class AnimalInfo {
	 // フィールド（動物の情報を保持する）
    private String name;      // 動物名
    private double length;    // 体長（メートル）
    private int speed;        // 速度（km/h）

    // setter（フィールドに値をセットする）
    public void setName(String name) {   //動物の名前をセット（代入）する
        this.name = name;                // thisを使って、クラスのフィールドに代入
    }
    
    public void setLength(double length) {     //動物の体長（メートル）をセット
        this.length = length;                  //thisを使って、クラスのフィールドに代入
    }

    public void setSpeed(int speed) {          //動物の速度（km/h）をセット
        this.speed = speed;                    //thisを使って、クラスのフィールドに代入
    }
    
    // getter（フィールドの値を取得する）
    public String getName() {                  //出力用メソッドに動物の名前のsetterを取得
        return this.name;                      //フィールドの中身にアクセス
    }

    public double getLength() {                //出力用メソッドに動物の体長のsetterを取得
        return this.length;                    //フィールドの中身にアクセス
        
    }

    public int getSpeed() {                    //出力用メソッドに動物の速度のsetterを取得
        return this.speed;                     //フィールドの中身にアクセス
    }

    // 出力用メソッド
    public void printInfo() {
        System.out.println("動物名：" + getName());                //動物の名前を出力
        System.out.println("体長：" + getLength() + "m");          //動物の体長（m）を出力
        System.out.println("速度：" + getSpeed() + "km/h");        //動物の速度(km/h)を出力
    }

  
    }
