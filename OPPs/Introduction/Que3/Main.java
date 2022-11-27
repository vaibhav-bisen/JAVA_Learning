// Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
// of its length and breadth as parameters of its constructor and having a method named 'returnArea' 
// which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard

package Que3;

import java.util.*;

class Area {
    int length;
    int breadth;

    public Area(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        System.out.println("Enter length");
        l = sc.nextInt();
        System.out.println("Enter breadth");
        b = sc.nextInt();
        Area a = new Area(l, b);
        System.out.println("Area : " + a.getArea());
    }
}
