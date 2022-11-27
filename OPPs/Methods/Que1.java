package Assignment;

import java.util.Scanner;

class Avarage{
    int a,b,c;
    Avarage(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }
    int avg(){
        return (a+b+c)/3;
    }
}
public class Que1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Avarage obj = new Avarage(a, b, c);
        System.out.println("Avarage of " + a +", "+ b +", " +"and "+ c+ " is "+ obj.avg());
    }
    
    
}
