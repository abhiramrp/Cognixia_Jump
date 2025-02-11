package pac1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Hello {

    public static String q9changeString(String str, int choice) {
        switch (choice) {
            case 1:
                return str.concat(str);
            case 2:
                char[] chArr = str.toCharArray();

                for (int i = 0; i < chArr.length; i++) {
                    if(i % 2 == 0) {
                        chArr[i] = '#';
                    }
                }

                return new String(chArr);

            case 3:
                LinkedHashSet<Character> s = new LinkedHashSet<>();
                char[] result = new char[str.length()];
                int index = 0;

                for(char c : str.toCharArray()) {
                    if(!(s.contains(c))) {
                        result[index] = c;
                    }
                }




        }
    }


    public static void main(String[] args) {

        // Question 1.5
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1.5 - Type a number: ");

        int num = sc.nextInt();
        if ( num < 0) {
            System.out.println("You have entered a negative number");
        } else  {
            System.out.println("You have entered a positive number");
        }

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

        // Question 9
        System.out.println("Question 9 - Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Question 9 - Enter a choice between 1-4: ");
        int choice = sc.nextInt();




    }
}
