package Assignment;

import java.util.Scanner;

class Count{
    String str;
    Count(String s){
        str = s;
    }
    int countVowels(){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}

public class Que2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Count obj = new Count(s);
        System.out.println(obj.countVowels());
    }
}
