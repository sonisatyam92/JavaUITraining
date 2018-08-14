package anusha;
import java.util.Scanner;
public class SwitchScannerHW {

   public static void main(String args[]) {
      Scanner input= new Scanner(System.in);
      System.out.println("Enter your birth month\n 1. Jan\n 2. Feb\n 3. Mar\n 4. Apr\n 5. May\n 6. June\n 7. July\n 8. Aug\n 9. Sept\n 10. Oct\n 11. Nov\n 12. Dec\n");
      int month= input.nextInt();
      System.out.println("Your birth month is " + month);
      //Remark for the marks
      switch(month) {
        case 1:
        case 2:
        case 3:
             System.out.println("Spring");
            break;
        case 4:
        case 5:
        case 6:
             System.out.println("Summer");
            break;
        case 7:
        case 8:
        case 9:
             System.out.println("Monsoon");
            break;   
        case 10:
        case 11:
        case 12:
             System.out.println("Winter");
            break;
        default :
            System.out.println("Invalid Month");
			}
		}
	}