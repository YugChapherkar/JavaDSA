//Array Day 9
//creating an array
/* dataType[] arrayName = new dataType[size];   
Creating an array
int marks[]= new int [50]
 */

import java.util.Scanner;

public class javad9 {

    public static void update (int marks[]) {
        for ( int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main (String args[]){
       
        //int marks[]= new int [100]; // array of 100 integers
        // int num [] = {1,2,3,4,5,6,7,8,9,10}; // automatic size allocation like 10 in this case
        // String fruits []= {"pineapple", "apple", "mango", "banana"}; // size 4
        // System.out.println("First fruit is: " + fruits[0]);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter marks for 1 subjects: ");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Marks for subject 1 is: " + marks[0]);
        // System.out.println("Marks for subject 2 is: " + marks[1]);     
        // System.out.println("Marks for subject 3 is: " + marks[2]);
        
        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage is: " + percentage + "%");
        
        int marks []= {97, 98, 99, 100, 95};
        update(marks);

        // print updated marks
        for ( int i=0; i<marks.length; i++) {
            System.out.println("Marks for subject is"  + marks[i]);
        }
        }
        //System.out.println("Length of marks array is: " + marks.length); // dot operator to get length of array and marks is the name of array
    }

