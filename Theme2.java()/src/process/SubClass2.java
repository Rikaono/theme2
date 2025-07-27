package process;

public class SubClass2 extends SuperClass2 { // SuperClass2 を継承したクラス SubClass2 を定義
    private String scientificName;           // 学名を格納するフィールドを定義

    public SubClass2(String name, double length, int speed) {   // コンストラクタで動物の名前・体長・速度を受け取る
        super(name, length, speed);                             // スーパークラスのコンストラクタを呼び出して初期化
        this.scientificName = getScientificNameByName(name);    // 動物名に応じた学名を設定
    }

    private String getScientificNameByName(String name) {       // 動物名を受け取り、学名を返すメソッド
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
    }

    public void printInfo() {              // 動物の情報を出力するメソッド
        System.out.println("動物名：" + name);           // 動物名を出力
        System.out.println("体長：" + length + "m");     // 体長を出力（単位：m）
        System.out.println("速度：" + speed + "km/h");   // 速度を出力（単位：km/h）
        System.out.println("学名：" + scientificName);   // 学名を出力
        System.out.println();                           // 改行
    }
}
