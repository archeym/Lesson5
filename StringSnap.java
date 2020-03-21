package lesson5;
/**
     StringSnap -- checks whether 2 Strings are the same, and then prints "SNAP" if they are the same.

     Instruction: Once we finish writing a program we must test it to make sure that the program works exactly as described in the problem's text.
     Compile and run the program with the next inputs:
     Test 1:
     enter first word:
     john
     enter second word:
     john

     the result should be:
     SNAP !!!
 ------------------------
     Test2:
     enter first word:
     john
     enter second word:
     mark

     no message should be displayed
 -------------------------
     Test 3:
     enter first word:
     john
     enter second word:
     JOHN

     the result should be:
     SNAP1, with ignoreCase
     SNAP2 with UpperCase

 */
import java.util.Scanner;

    // declare a class named StringSnap
    public class StringSnap {


        public static void main(String args[]){
            // declare 2 local variables to store the input provided by the user
            String text1, text2;

            // declare a variable named sc of type Scanner, and create an instance/object of type Scanner
            Scanner sc = new Scanner(System.in);

            // input
            // prompt the user to provide the input
            // prompt the user to provide the first word
            System.out.println("Please, enter word 1: ");
            text1 = sc.next(); // reads one word
		/* next() method returns one token (i.e. by default one word)
		 if we want to read an entire line from the keyboard we can use the nextLine() method which returns the String corresponding to that line. For example,
		text1.nextLine();
		*/

            // prompt the user to provide the second word
            System.out.println("Please, enter word 2: ");
            text2 = sc.next(); // reads one word -- next() method returns one token (i.e. by default one word)

            // processing
            // we compare Strings, and objects in general, with the method equals() (note: all the objects have the method equals() available)

            // we cannot compare objects (e.g. Strings) with the equality operator ==
            // recall that Java is case sensitive, the method equals() on Strings returns true only
            // if the two words are written using the same format (e.g. 1)
            // if text1="joHN" and text2=joHN" equals() method returns true,
            // 2) if text1="joHN" and text2=JOhn" equals() method returns false)
            if (text1.equals(text2)){
                System.out.println("SNAP !!");
            }

            // Extra task: check that two pieces of text are different, note the usage of ! NOT operator
            System.out.println("Extra task: lets check that two pieces of text are different !");
            if (!text1.equals(text2)){
                System.out.println("Yes, the two pieces of text are different.");
            }else{
                System.out.println("Nope, the two pieces of text are same.");
            }
            System.out.println("-----------------");
            // we cannot compare objects (e.g. Strings) with the equality operator ==
            // below we use the method called equalsIgnoreCase() -- the method compares two pieces of text
            // (i.e. two objects of type String) and returns true if
            // the two contain the same text without taking into consideration how the text is written
            // (i.e. upper case, lower case or a combination of upper and lower case) (e.g. 1) text1="joHN" and text2=joHN" equalsIgnoreCase() method returns true, 2) if text1="joHN" and text2=JOhn" equalsIgnoreCase() method returns true)
            if (text2.equalsIgnoreCase(text1)){
                System.out.println("SNAP1, with ignoreCase");
            }
            System.out.println("-----------------");
            /*
		// the above code can be rewritten as follows
		boolean isEqual = text2.equalsIgnoreCase(text1);
		if (isEqual){
			System.out.println("SNAP1");
		}
		*/

            //convert the input provided by the user to either lowercase (using the method toLowerCase()) or uppercase (using the method toUpperCase()) and in this case we are not concerned about the letter case used to write the two pieces of text
            text1 = text1.toUpperCase(); // the method toUpperCase() returns a new string, a copie of the initial value of text1 where all the letters are written in uppercase; we save the new string in the local variable text1 as we do not need the initial content of text1
            text2 = text2.toUpperCase(); // the method toUpperCase() returns a new string, a copie of the initial value of text2 where all the letters are written in uppercase; we save the new string in the local variable text2
            if (text1.equals(text2)){
                System.out.println("SNAP2 with UpperCase");
            }
        }
    }
