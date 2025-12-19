// Java Day 7 Functions and Methods Example

/*     returntype name(parameters){
       // body
       return value;

       functions inside class are called methods
       if printHello this function is called method because it is inside class of javad7


 */
import java.util.Scanner;
public class javad7 {

    // public static void add(int a, int b) {
   
    //     int sum = a+b;
    //     System.out.println("Sum is: " + sum);     
    // } 
    // public static void main (String args[]) {
    //      System.out.println("Enter two numbers");
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     add();

    public static void add(int num1, int num2) { // parameters or formal arguments
        int sum = num1 + num2; 
        System.out.println("Sum is: " + sum);
    }

    // formal parameters are used in method/function declaration/definition and actual parameters(arguments) are used in method/function call (actual value passed)
    public static void main (String args []) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    add(a,b);

  //  pass a and b as arguments to the add method
  // if the input taking from main class then we have to pass the values as arguments to the method like add(a,b);  
    }
}



