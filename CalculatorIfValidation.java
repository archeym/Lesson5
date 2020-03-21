package lesson5;


import lesson4.*;

import java.util.Scanner;

public class CalculatorIfValidation {
    public static void main(String args[]){
        // input
        // prompt the user to specify the operation to be performed
        System.out.println("Choose operation");
        System.out.println("addition -- 1:");
        System.out.println("subtraction -- 2:");
        System.out.println("multiplication -- 3:");
        System.out.println("division -- 4");

        // declare and create an object of type Scanner
        Scanner input = new Scanner(System.in);

        // declare a local variable to store the user's choice
        int operation;
        // read the input
        operation = input.nextInt(); // reads and returns one int value

        // validate the operation to be performed
        // if operation is invalid display a message and programs ends
        if (operation != 1 && operation != 2 && operation !=3 && operation != 4){
            System.out.println("unknown operation");
        } else { // otherwise, if operation is valid execute the next statements (i.e. the body of the else { ... }

            // prompt the user to enter the two numbers
            System.out.println("enter 1st number:");
            // declare local variables to store the input received from the user
            double n1, n2;
            n1 = input.nextDouble();
            System.out.println("enter 2nd number:");
            n2 = input.nextDouble();

            // declare a variable of type SimpleCalculator
            SimpleCalculator myCalc;
            // create an object of type SimpleCalculator using the no-arguments constructor
            myCalc = new SimpleCalculator();

            // use the setters methods to store in the object's instance variables the 2 numbers provided by the user
            // use the setter method to store the value of n1 in the firstNumber instance variable
            myCalc.setFirstNumber(n1);
            // use the setter method to store the value of n2 in the secondNumber instance variable
            myCalc.setSecondNumber(n2);


            // process
            // user's choice is stored in the variable operation
            // use the nested if else if selection statements to decide the arithmetic operation to be performed based on the user's input
            if (operation == 1){ // if the operation is equal to 1 (i.e. the user entered 1) then execute the next statements
                // invoke/call method add() on the object to perform the addition
                myCalc.add();
            } else if (operation == 2){ // if the operation is equal to 2 then execute the next statement(s)
                // invoke/call method subtract() on the object to perform the subtraction
                myCalc.subtract();
            } else if (operation == 3){ // if the operation is equal to 3 then execute the next statement(s)
                // invoke/call method multiply() on the object to perform the multiplication
                myCalc.multiply();
            } else if (operation == 4){ // if the operation is equal to 4 then execute the next statement(s)
                // invoke/call method divide() on the object to perform the division
                myCalc.divide();
            }

            // output
            // declare a variable named res to store the result return by the getter method
            // use the getter method to retrieve the result of the arithmetic operation
            double res;
            res = myCalc.getResult();
            System.out.println(res);

        } // ends the if else statement (i.e. the if which validates the operation)

    } // ends the main method

} // ends the class declaration