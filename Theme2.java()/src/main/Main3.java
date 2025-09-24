package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import process.Prefecture;     // Prefectureクラスを利用

public class Main3 {
    public static void main(String[] args) {
        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner scanner = new Scanner(System.in);

        // 入力例: 8,5,9
        System.out.println("番号をカンマ区切りで入力してください (例: 8,5,9):");
        String[] indices = scanner.nextLine().split(",");

        System.out.println("昇順: asc, 降順: desc を入力してください:");
        String order = scanner.nextLine().trim();

        List<Prefecture> selected = new ArrayList<>();
        for (String indexStr : indices) {
            int idx = Integer.parseInt(indexStr.trim());
            if (idx >= 0 && idx < prefectures.length) {
                selected.add(prefectures[idx]);
            }
        }

     // 選択したインデックスを一緒に保持する
        List<Integer> indexList = new ArrayList<>();
        for (String indexStr : indices) {
            int idx = Integer.parseInt(indexStr.trim());
            if (idx >= 0 && idx < prefectures.length) {
                indexList.add(idx);
            }
        }

        // ソート（番号順）
        if ("asc".equalsIgnoreCase(order)) {
            indexList.sort(Comparator.naturalOrder());
        } else if ("desc".equalsIgnoreCase(order)) {
            indexList.sort(Comparator.reverseOrder());
        }

        // 出力
        for (int idx : indexList) {
            System.out.println(prefectures[idx]);
        }
        
        scanner.close();
    }
}