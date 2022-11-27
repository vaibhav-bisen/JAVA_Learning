package Assignment;

import java.util.Scanner;

class SmallestNo{
    int a,b,c;
    SmallestNo(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }
    int smallestnum(){
        return Math.min(a, Math.min(b, c));
    }
}

public class Que5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        SmallestNo obj = new SmallestNo(a, b, c);
        System.out.println(obj.smallestnum());
    }
}
