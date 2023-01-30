package javaapis.collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

    public static void main(String[] args) {
        // 初期化
        HashSet<String> set= new HashSet<String>();

        
        set.add("東京都");
        set.add("大阪府");
        set.add("北海道");
        set.add("広島県"); 
        set.add("北海道");
        set.add("兵庫県");
        

        for (String str : set) {
            System.out.println(str);
        }
        if (set.contains("広島県")) {
            System.out.println("広島県に行ったことがある");
        }else {
            System.out.println("いったことがない");
        }
        if (set.contains("群馬県")) {
            System.out.println("群馬県に行ったことがある");
        } else {
            System.out.println("群馬県に行ったことがない");
        }
        set.remove("北海道");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println(item);      
    }

    }
}
