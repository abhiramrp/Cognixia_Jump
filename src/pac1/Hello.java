package pac1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        // Question 1.5
        Scanner sc = new Scanner(System.in);
        System.out.print("Question 1.5 - Type a number: ");

        int num = sc.nextInt();
        if ( num < 0) {
            System.out.println("You have entered a negative number");
        } else  {
            System.out.println("You have entered a positive number");
        }
        sc.nextLine();

        // Question 6
        Person p = new Person("Abhiram Rishi", "Prattipati", 'M');
        // Question 4
        p.printInfo();

        // Question 7
        p.setPhone("123-456-7890");
        System.out.println("Phone number: " + p.getPhone());

        // Question 8
        p.setGender('F');
        System.out.println("Gender: " + p.getGender());


        Q9Q10String q9q10StringObject = new Q9Q10String();

        // Question 9
        System.out.print("Question 9 - Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Question 9 - Enter a choice between 1-4: ");
        int choice = sc.nextInt();
        System.out.println(q9q10StringObject.q9(str, choice));

        sc.nextLine();

        // Question 10
        System.out.print("Question 10 - Enter a String: ");
        String str2 = sc.nextLine();
        System.out.print(str2 + " is positive: "  + q9q10StringObject.q10(str2));





    }
}
