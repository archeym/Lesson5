package lesson5;

import java.util.*;

public class Operators {

    public static void main(String[] args) {

        
        int num = 100;

        switch(num) {
            case 1:
                System.out.println("Variable is:  1");
                break;
            case 23:
                System.out.println("Variable is: 23");
                break;
            case 10:
                System.out.println("Variable is: 10");
                break;
            case 100:
                System.out.println("Variable is: 100");
                break;
            case 89:
                System.out.println("Variable is: 89");
                break;
            default:
                System.out.println("Variable is something else ?!");
        }
        
        
        boolean isEven = true;
        if(!isEven)
            System.out.println("boolean is "+isEven);

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        //  ==	Equal to	      x == y
        //  !=	Not equal	      x != y
        //  >	Greater than	x > y
        //  <	Less than	      x < y
        //  >=	Greater than or equal to	x >= y
        //  <=	Less than or equal to	      x <= y


        //if operator to check (logic)
        if(age < 18 ){
            if(age >= 10 && age <=15 ){
                System.out.println("Its teen's age !");
            }else if ((age > 15 && age <= 18) ) {//age == 19
                System.out.println("Its grown teenager's age with parents !");
            }else{
                System.out.println("Its child's age !");
            }

        } else if( age == 20 || (age >21 && age <= 109)){
            System.out.println("Its grown up's age !");
        }else{
            if(age >= 110){
                System.out.println("No one live too long !");
            }else {
                System.out.println("Update your logic !");
            }
        }

    //  && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
    //  || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
    //  !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)



    }//end main

}
