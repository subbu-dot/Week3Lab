package hit.day12;

import java.util.Scanner;

//Lab-2
//Java’s defining characteristics come from?
// b. It’s predecessors

//Java derives it’s syntax from …….. and many of Java’s object-oriented features were influenced by…….? 
//Answer: C,C++

// Java?
//b. Platform-independent

//Which type of programming language is Java?
//b. Object-oriented programming 

//Write a simple Java program to print the statement “This is My First Java program”? 
class JavaProgram {
	public static void main(String[] args) {
		System.out.println("This is my First Java Program");
	}
}

//What is the return type of program’s main() method?
//void return type

//What is the argument type of program’s main() method?
//String[] array as an argument

//Which of the following signatures are valid for the main() method entry point of an application? 
//b. public static void main(String args[]

//Name two keywords in Java that are reserved but not used? 
//goto and constant

//Choose the valid keywords from those listed below?
//a. bytes
//b. byte

//What are the operators used in Java? 
//Unary Operator, Arithmetic Operator, Shift Operator, Relational Operator, Bitwise Operator, Logical Operator, Ternary & Assignment Operator.

//Write a program to print the reminder of division operation (22/10 & 22.25/10)? 
public class Remainder {
	public static void main(String[] args) {
		int dividend = 22, divisor = 10;
		int remainder = dividend % divisor;
			System.out.println("Remainder = " + remainder);
	}
}

public class Remainder {
	public static void main(string[] args) {
		int dividend = 22.25, divisor = 10;
		int remainder = dividend % divisor;
		System.out.println("Remainder = +remainder");
	}
}

//Write a program to demonstrate several assignment operators (+=, -=, *=, /=)?
class OperatorExample {
	public static void main(String[] args) {
		int a=10;
		a+=3;
		System.out.println(a);
		a-=4;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		a/=2;
		System.out.println(a);
	}
}

//. a = 4; b = 1;Boolean c = a<b; Value of c?
//b. false

//Choose valid statements in java?
//a. if(!done)

															//Lab 3
														//Control Statements 
//27. What are the three categories of control statements?
//Loop statements
//Jump statements
//Decision Making statements

//28. Write a program that uses an if-else-if ladder to determine which season a particular month is in?
class IfElse {
	public static void main(String[] args) {
		int month = 4;
		String season;
		if(month == 12 || month == season ="Winter");
		else if(month == 03 || month == season ="Spring");
		else if(month == 06 || month == season ="Summer");
		else if(month == 9 || month == season ="Winter");
		else
			season = "Bogus Month";
		System.out.println("April");
	}
}

//29. Write a program that uses a switch case to determine given character is vowel or not?
public class Vowel {
	public static void main(String[] args) {
		boolean bool = false;
		System.out.println("Enter a character:");
		Scanner sc = new Scanner("System.in");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' : bool = true;
		}
		if(bool == true) {
			System.out.println("Given character is an vowel");
		}else {
			System.out.println(Given charatcer is an consonant");"
					+ "}"
					+ "}"
					+ "}
		}
	}
}

//30. Write a program that uses a switch case to determine which season a particular month is in?
class IfElse {
	public static void main(String[] args) {
		int month = 4;
		String season;
		if(month == 12 || month == season ="Winter");
		else if(month == 03 || month == season ="Spring");
		else if(month == 06 || month == season ="Summer");
		else if(month == 9 || month == season ="Winter");
		else
			season = "Bogus Month";
		System.out.println("April");
	}
}

//31. Write a program for four-function calculator using switch case?(add,sub,mul,div)
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}