import java.util.Scanner;

public class javad4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your marks: ");
        // int marks = sc.nextInt();
        // if (marks > 32) {
        //     System.out.println("You are passed");
        //     }
        //     else {
        //         System.out.println("You are failed");
        //     }
//     System.out.println("Enter 1 number: ");
//     int a = sc.nextInt();
//     System.out.println("Enter 2 number: ");
//     int b = sc.nextInt();
//     System.out.println("Enter 3 number: ");
//     int c = sc.nextInt();

//     if (a> b && a>c ) {
//         System.out.println(a+" is greater than "+b +c );
//     }
//     else if (b>c) {
//         System.out.println("Both are equal");
//     }
// else {
//     System.out.println(c+" is greater than ");
// }
System.out.print("Enter a days of week (1-7): ");
int day = sc.nextInt();
switch (day) {
    case 1:
        System.out.println("Monday");
        break;      
    case 2:
        System.out.println("Tuesday");  
        break;
    case 3:
        System.out.println("Wednesday");  
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");
        break;
    }
    sc.close();
}
}
