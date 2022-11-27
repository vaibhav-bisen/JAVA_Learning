package Assignment;

import java.util.Scanner;

class IsLeapYear{
    int year;
    IsLeapYear(int n){
        year = n;
    }
    boolean leapYear(){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}

public class Que4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        IsLeapYear obj = new IsLeapYear(num);
        if(obj.leapYear()){
            System.out.println(num+" is a Leap year.");
        }else{
            System.out.println(num+" is a Non-leap year.");
        }
    }
   

}
