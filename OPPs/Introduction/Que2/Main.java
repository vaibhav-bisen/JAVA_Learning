//  Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
// creating a class named 'Triangle' without any parameter in its constructor

package Que2;
class Triangle{
    int a, b, c;
    public double getArea(){
        double semi_perimeter = (a+b+c)/2.0;
        return Math.pow((semi_perimeter * (semi_perimeter - a)*(semi_perimeter - b)*(semi_perimeter - c)), 0.5);
    }
    public double getPerimeter(){
        return (a+b+c);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 2;
        t.b = 5;
        t.c = 6;
        System.out.println("Area = " + t.getArea());
        System.out.println("Perimeter = "+ t.getPerimeter());
    }
    


    
}
