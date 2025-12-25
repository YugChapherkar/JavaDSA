import java.util.Scanner;
public class javabasics {
    public static void main (String[] args) {
    //    int a=5;
    //    int b=10;
    //    int sum=a+b;
    //    String name="Hello World";
    //    System.out.println(name);
    //    System.out.println(a);
    //    System.out.println("The sum of a and b is :" +sum);  
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter 1st number");
    // int a = sc.nextInt();
    // System.out.println("Enter 2nd number");
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("The sum of a and b is :" + sum);
System.out.println("Enter the radius of circle");
    float rad = sc.nextFloat();
float area = 3.14f * rad * rad;
System.out.println("The area of circle is :" + area);
sc.close();

}
}