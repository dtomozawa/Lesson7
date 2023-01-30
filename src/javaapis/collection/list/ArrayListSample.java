package javaapis.collection.list;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<String>();
        al.add("アイスランド");
        al.add("スペイン");
        al.add("ナポリ");
        al.add("リスボン");
        al.add("オーストリア");
        
        String place = al.get(2);
        System.out.println(place);
                
        int listcount=al.size();
        System.out.println(listcount);

        al.remove(2);
        place=al.get(2);
        System.out.println(place);
    

        System.out.println("ループここから");

        for(String nation : al){
            System.out.println(nation);
    }
    }

}
