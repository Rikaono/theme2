package logic;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SushiInfo {

	    String greeting;
	    String taste;
	    String category;
	    String nowDate;

	    public SushiInfo() {
	        this.greeting = "こんにちは！ここは日本です！";
	        this.taste = "この寿司はうまい";
	        this.category = "寿司は和食です";

	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        this.nowDate = "今の現在日時は" + now.format(formatter) + "です";
	    }

	    public void printAll() {
	        System.out.println(this.greeting);
	        System.out.println(this.taste);
	        System.out.println(this.category);
	        System.out.println(this.nowDate);
	    }
	}
