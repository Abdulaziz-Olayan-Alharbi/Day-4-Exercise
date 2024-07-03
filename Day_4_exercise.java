import java.util.Scanner;

public class Day_4_exercise {
    public static void main(String[] args) {
        /*1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that
        number.*/
       for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
             if(i % 3 == 0){
                 System.out.println("Fizz");
             }
             if(i % 5 == 0){
                 System.out.println("Buzz");
             }
             System.out.println(i);
        }
        System.out.println("***********************************");

        /*2.Write a Java program to reverse a string.
        Test Data: Input a string: The quick brown fox Expected Output: Reverse
        string: xof nworb kciuq ehT*/
        System.out.println("Enter a word to reverse: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int num = word.length()-1;
        for (int i = 0 ; i< word.length() ; i++) {
                System.out.print(word.charAt(num));

                num--;
        }
        System.out.println(" ");
        System.out.println("***********************************");

        /*3.Write a program to find the factorial value of any number entered
        through the keyboard.*/
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        int number2 = number;
        int factorial_value = 1;
        for (int i = 0 ; i < number ; i++) {
            factorial_value = factorial_value*number2;
            number2--;
        }
        System.out.println(factorial_value);
        System.out.println("***********************************");

        /*4.Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another. (Do not use Java
        built-in method)*/
        System.out.println("Enter a number: ");
        int number3 = scan.nextInt();
        System.out.println("Enter another number: ");
        int number4 = scan.nextInt();
        int total = 1;
        for(int i = 0 ; i < number4 ; i++) {
            total = total * number3;
        }
        System.out.println(total);
        System.out.println("***********************************");

        /*5.Write a program that reads a set of integers, and then prints the sum of
            the even and odd integers.*/
        String str= "";
        int oddSum = 0;
        int evenSum = 0;
        do{
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            if(num % 2 == 0){
                evenSum += num;
            }
            else {
                oddSum += num;
            }
            System.out.println("do you want continue (y/n):");
            str = scan.next();
        }while(str.equals("y"));
        System.out.println("the sum of odd number is:"+oddSum);
        System.out.println("the sum of even number is:"+evenSum);
        System.out.println("***********************************");

        /*6.Write a program that prompts the user to input a positive integer. It
        should then output a message indicating whether the number is a prime
        number.*/
        System.out.println("Enter a number: ");
        int number5 = scan.nextInt();
        boolean is_prime = true;
        if (number5 > 0){
            for (int i = 2 ; i < number5 ; i++) {
                if (number5 % i == 0){
                    System.out.println("it is not a prime number");
                    is_prime = false;
                    break;
                }
            }
            if (is_prime==true){
                System.out.println("it is a prime number");
            }
        }else {
            System.out.println("it is not a positive number");
        }
        System.out.println("***********************************");
        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        another for loop to print the days (Days 1 -7) for each week.*/
        for (int i = 1 ; i<=4; i++){
            System.out.println("Week "+i);
            for (int j = 1 ; j<=7; j++){
                System.out.println("Day "+j);
            }
        }
        System.out.println("***********************************");

        //8.Write a program thats check if the word is a palindrome or not.
        System.out.println("Enter a word: ");
        String word2 = scan.next();
        int len = word2.length() - 1;
        boolean is_palindrome = true;
        for (int i = 0 ; i < word2.length() ; i++) {
            if (word2.charAt(len) != word2.charAt(i)){
                is_palindrome = false;
                break;
            }
            len--;
        }
        System.out.println("it is "+is_palindrome+" that this word is palindrome");







    }
}
