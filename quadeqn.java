import java.util.*;
import java.util.Scanner;
class quadeqn
{
   public static void main(String ss[])
   {
       double d;
       int a,b,c;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the values of a, b and c");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
       d= (b*b)-(4*a*c);
       if (a==0)
      {
         System.out.println("Invalid input");
       }
       else if(d>0)
       {
            double r1=(-b+Math.pow(d,0.5))/(2*a);
            double r2=(-b-Math.pow(d,0.5))/(2*a);
            System.out.println("Roots are real and distinct");  
            System.out.println("r1 = "+r1 +" " + "r2= "+r2);
           
        }
        else if(d==0.0)
        {
            double r1 = -b/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("r1 = r2 = "+r1);
        }
         else if(d<0)
         {
            System.out.println("Roots are imaginary ");
			double real = -b/2*a;
			double img = (Math.sqrt(Math.abs(d)))/(2*a);
            System.out.println("r1= " +real+"+i"+img);
            System.out.println("r2= " +real+"+i"+img);
         
         }
      }
}