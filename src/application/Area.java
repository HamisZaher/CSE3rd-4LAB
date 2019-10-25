package application;

import java.util.Scanner;

public class Area {

	public static void main(String args[]) 
    {   
       
         Scanner scanner1= new Scanner(System.in);
         System.out.println("What do you to create Area for:  ");
         System.out.println("1.Cicle ... 2.Tringle ...3.Rectangle ...4.Square ?");
         System.out.println("Press the number of the shape you want! ");
         int a= scanner1.nextInt();
         
         if(a==1) {
        	 Scanner scanner2= new Scanner(System.in);
             
             System.out.println("Enter the radius:");
             double r = scanner2.nextDouble();
             
             //Area = PI*(r^2)
             double  area=(22*r*r)/7 ;
             System.out.println("Area of Circle is: " + area);
         }
         else if(a==2) {
        	 Scanner scanner3 = new Scanner(System.in);

             System.out.println("Enter the width of the Triangle:");
             double base = scanner3.nextDouble();

             System.out.println("Enter the height of the Triangle:");
             double height = scanner3.nextDouble();

             //Area = (width*height)/2
             double area = (base* height)/2;
             System.out.println("Area of Triangle is: " + area); 
         }
    }
}
