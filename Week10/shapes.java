import java.util.Scanner;

public class shapes {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        Header();
         int loopnum = input.nextInt();
        while (loopnum == 1) {
            calc();
            loopnum = input.nextInt();
        }

    }//end of main

    public static void Header(){
        System.out.println("Press 1 to start.");
        
    }

    public static class Rectangular{
        double length;
        double width;
    
        void setLength(double L){
            length = L;
            System.out.println("The length values is: " + L);
        }
        void setWidth(double W){
            width = W;
            System.out.println("The width value is: " + W);
        }
        double getArea(){
            return length * width;
        }
        double getPerimeter(){
            return ((length + width) * 2);
        }
    
    }//end of rectangle class
    public static class Circle{
        double radius;
        void setRadius(double r){
            if(r < 0){
                System.out.print("Enter a positive number.");
            }
            radius = r;
            System.out.println("The radius value is: " + r);
        }
        double getArea(){
            return (radius * radius * 3.14156);
        }
    }//end of circle class

    public static class Triangle{
        double base;
        double height;
        void setBase(double b){
            if(b < 0){
                System.out.print("Enter a positive number.");
            }
            base = b;
            System.out.println("The base value is: " + b);
        }
        void setHeight(double h){
            if(h < 0){
                System.out.print("Enter a positive number.");
            }
            height = h;
            System.out.println("The height value is: " + h);
        }
        double getArea(){
            return ((0.5 * (base * height)));
        }
    }//end of triangle class

    public static class Cyclinder{
        double radius;
        double Height;
        void setRadius(double r){
            if(r < 0){
                System.out.print("Enter a positive number.");
            }
            radius = r;
            System.out.println("The radius value is: " + r);
        }
        void setHeight(double h){
            if(h < 0){
                System.out.print("Enter a positive number.");
            }
            Height = h;
            System.out.println("The height value is: " + h);
        }
        double getArea(){
            return ((2 * radius * 3.14156 * Height) + (2 * 3.14156 * radius * radius));
        }
        double getVolume(){
            return((2 * radius * 3.14156 * Height) + (2 * 3.14156 * radius * radius) * Height);
        }
    }//end of cylinder class

    public static void calc(){
            System.out.println(" ");
            System.out.println("Press 1 for Rectangle, Press 2 for Circle, Press 3 for Triangle, Press 4 for Cyclinder, or Press 0 to exit the program.");
            Scanner input = new Scanner(System.in);
            Rectangular Rec1 = new Rectangular();
            Circle C1 = new Circle();
            Triangle T1 = new Triangle();
            Cyclinder CY1 = new Cyclinder();

            double myLength;
            double myWitdh;
            double myRadius;
            double myBase;
            double myHeight;
            int num = input.nextInt();
             switch(num){
            case 1:
                //Rectangle
                System.out.println("Enter a value for length.");
                myLength = input.nextDouble();
                System.out.println("Enter a value for width.");
                myWitdh = input.nextDouble();
                Rec1.setLength(myLength);
                Rec1.setWidth(myWitdh);
                System.out.println("The area of the rectangle is: " + Rec1.getArea());
                System.out.println("The perimeter of the rectangle is: " + Rec1.getPerimeter());
            break;

            case 2:
                 //Circle
                System.out.println("Enter a value for radius.");
                myRadius = input.nextDouble();
                C1.setRadius(myRadius);
                System.out.println("The area of the circle is: " + C1.getArea());
            break;

            case 3:
                 //Triangle
                System.out.println("Enter a value for base.");
                myBase = input.nextDouble();
                System.out.println("Enter a value for height.");
                myHeight = input.nextDouble();
                T1.setBase(myBase);
                T1.setHeight(myHeight);
                System.out.println("The area of the triangle is " + T1.getArea());
            break;

            case 4:
                //Cylinder
                System.out.println("Enter a value for the radius of the base.");
                myRadius = input.nextDouble();
                System.out.println("Enter a value for height.");
                myHeight = input.nextDouble();
                CY1.setRadius(myRadius);
                CY1.setHeight(myHeight);
                System.out.println("The area of the cylinder is " + CY1.getArea());
            break;
        }
        System.out.println("Press 1 to continue, or press 0 to exit");
    }

    
    
}//end of shapes class 
 /* 
 
 outputs 

 Name: Inigo Dela Vega

 Class: CS 113

 Project: 10 classes 

 C:\Users\Inigo\Desktop\Java\Week10>javac shapes.java

C:\Users\Inigo\Desktop\Java\Week10>java shapes
Press 1 to start.
1

Press 1 for Rectangle, Press 2 for Circle, Press 3 for Triangle, Press 4 for Cyclinder, or Press 0 to exit the program.
1
Enter a value for length.
15
Enter a value for width.
6
The length values is: 15.0
The width value is: 6.0
The area of the rectangle is: 90.0
The perimeter of the rectangle is: 42.0
Press 1 to continue, or press 0 to exit
1

Press 1 for Rectangle, Press 2 for Circle, Press 3 for Triangle, Press 4 for Cyclinder, or Press 0 to exit the program.
2
Enter a value for radius.
1
The radius value is: 1.0
The area of the circle is: 3.14156
Press 1 to continue, or press 0 to exit
1

Press 1 for Rectangle, Press 2 for Circle, Press 3 for Triangle, Press 4 for Cyclinder, or Press 0 to exit the program.
3
Enter a value for base.
19
Enter a value for height.
6
The base value is: 19.0
The height value is: 6.0
The area of the triangle is 57.0
Press 1 to continue, or press 0 to exit
1

Press 1 for Rectangle, Press 2 for Circle, Press 3 for Triangle, Press 4 for Cyclinder, or Press 0 to exit the program.
4
Enter a value for the radius of the base.
10
Enter a value for height.
12
The radius value is: 10.0
The height value is: 12.0
The area of the cylinder is 1382.2864
Press 1 to continue, or press 0 to exit
0

C:\Users\Inigo\Desktop\Java\Week10> */




