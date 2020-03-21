package lesson5;

import lesson4.*;
import java.util.*;

public class IfCalculatorValidation {

    public static void main(String[] args) {
    //input
        //prompt user to specify the operation to be performed
        System.out.println("Choose Operation !");
        System.out.println("addition -- 1: ");
        System.out.println("subtraction -- 2");
        System.out.println("multiplication -- 3");
        System.out.println("devision -- 4");

        //declare and create an object of type Scanner
        Scanner input = new Scanner(System.in);

        //declare a local variable to store the users choice
        int operation = input.nextInt();//read and return 1 int value

        if (operation != 1 && operation != 2 && operation !=3 && operation !=4){
            System.out.println("Check your operations numbers .");
        }else {//otherwise, if operation is valid execute next statement {body}
            System.out.println("Please enter 1st number: ");
            double n1 = input.nextDouble();

            System.out.println("Please enter the 2nd number: ");
            double n2 = input.nextDouble();

            //declare and create type of object SimpleCalculator
            SimpleCalculator myCalc = new SimpleCalculator();

            //use the setter method to store the value n1 to the firstNumber of instance variable
            myCalc.setFirstNumber(n1);
            //use the setter method to store the value n2 to the secondNumber of instance variable
            myCalc.setSecondNumber(n2);

            //process
            if(operation ==1){
                //call add() method on the object to perform the addition
                myCalc.add();
            }else if(operation == 2){
                //call subtract() method on the object to perform the subtract
                myCalc.subtract();
            }else if (operation ==3){
                //call multiply() method on the object to perform the multiply
                myCalc.multiply();
            }else if(operation == 4) {
                //call devide() method on the object to perform the devide
                myCalc.divide();
            }

            //output
            double res = myCalc.getResult();
            System.out.println("Result: "+ res);

        }//end else

    }//end main
}//end class
