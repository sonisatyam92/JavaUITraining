package anusha;
import java.util.Scanner;
public class SwitchHW{

   public static void main(String args[]) {
      int Marks = 1;
      //Printing students marks
      System.out.println("Your Marks are " + Marks);
      //Remark for the marks
      switch(Marks) {
         case 0:
            System.out.println("Fail"); 
            break;
        case 1:
        case 2:
        case 3:
             System.out.println("Needs work");
            break;
        case 4:
        case 5:
        case 6:
             System.out.println("Average");
            break;
        case 7:
        case 8:
        case 9:
             System.out.println("Good");
            break;   
        case 10:
             System.out.println("Excellent");
            break;
         default :
            System.out.println("Invalid Marks");
			}
		}
	}