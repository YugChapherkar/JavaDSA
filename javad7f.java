//import java.util.Scanner;
public class javad7f {
    
 //Function overloading using parameters
// public static int sum (int a, int b) {
// return a+b;
// }
// public static int sum (int a, int b, int c ) {
// return a+b+c;
// }


// function overloading using data types
public static int sum (int a, int b) {
return a+b;
}

public static float sum (float a, float b) {
return a+b;
}

public static void main (String args[]) {
System.out.println("The sum of 2 numbers: " + sum (5,10));
System.out.println("The sum of 3 numbers: " + sum (3.2f, 4.3f));
}

}