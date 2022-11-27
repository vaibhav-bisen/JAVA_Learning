package Assignment;

import java.util.Scanner;

class MiddleNo{
    String s;
    MiddleNo(String str){
        s = str;
    }
    String mid(){
        if(s.length() % 2 == 0){
            return s.substring(s.length()/2, s.length()/2 + 2);
        }else{
            return s.substring(s.length()/2, s.length()/2 + 1);
        }
    }
}

public class Que3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        MiddleNo obj = new MiddleNo(str);
        System.out.println(obj.mid());
    }
}
