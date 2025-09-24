package process;

public class Prefecture {

	public Prefecture() {
	
	}
		
		// TODO 自動生成されたコンストラクター・スタブ
		private String name;          // 都道府県名
	    private String capital;       // 県庁所在地
	    private double area;          // 面積 (km2)

	    
	    //それぞれのコンストラクターの箱を指定
	    public Prefecture(String name, String capital, double area) { 
	        this.name = name;
	        this.capital = capital;
	        this.area = area;
	    }
	    
	   //String型引数を受取り、それぞれを返却するgetメソッドを作成
	    public String getName() {
	        return name;
	    }

	    public String getCapital() {
	        return capital;
	    }

	    public double getArea() {
	        return area;
	    }

	    //コンソール出力用フォーマット
	    @Override
	    public String toString() {
	        return "都道府県名：" + name + "\n" +
	               "県庁所在地：" + capital + "\n" +
	               "面積：" + area + "km2\n";
	    
	        
	}

}
