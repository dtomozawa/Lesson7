package javaapis.string;

public class StringComparison01 {

    public static void main(String[] args) {
        String str1=new String("abc");
        String str2=new String("abc");
                
if(str1.equals(str2)){
    System.out.println("一致しました");
}else {
    System.out.println("しませんでした");
    
}
}
}
