package lesson5;

/** Home Work:

 Write an application that prompts a student to input a day of the week, and then it will display whether there are classes scheduled for that day.
 Day        Message
 Monday:	Evening classes at 19:00
 Tuesday:   No classes
 Wednesday:	Evening classes at 19:00
 Thursday:  No classes
 Friday:	No classes
 Saturday:	Whole day Labs :)
 Sunday:	It's finally Sunday! :-)
 default:   check your input mate/fella/gal
 */

import java.util.Scanner;
    public class SwitchDays {

        public static void main(String args[]){
            int day;
//            String day;
            //declare variable scan to be able to work with object of type Scanner
            Scanner scan = new Scanner(System.in);

//            System.out.println("Please enter a day of the week to see whether " +
//                                "there are any classes scheduled for that day");
            System.out.println("Please enter a day(as a number i.e. 1-7) of the week to see whether " +
                    "there are any classes scheduled for that day!");

            //day = scan.next();
            //day = day.toLowerCase();
            day = scan.nextInt();


            switch (day) {
                case 1:
                case 3:
                    System.out.println("Evening classes at 19:00");
                    break;
                case 2:
                case 4:
                case 5:
                    System.out.println("No classes");
                    break;
                case 6:
                    System.out.println("Whole day Labs :) ");
                    break;
                case 7:
                    System.out.println("It's finally Sunday!");
                    break;
                default:
                    System.out.println ("Check your input mate!");
            }

//            switch (day) {
//                case "monday":
//                case "wednesday":
//                    System.out.println("Evening classes at 19:00");
//                    break;
//                case "tuesday":
//                case "thursday":
//                case "friday":
//                    System.out.println("No classes");
//                    break;
//                case "saturday":
//                    System.out.println("Whole day Labs :) ");
//                    break;
//                case "sunday":
//                    System.out.println("It's finally Sunday!");
//                    break;
//                default:
//                    System.out.println ("Check your input mate!");
//            }
        }
    }
