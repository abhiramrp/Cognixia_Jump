package pac1;

import java.util.LinkedHashSet;

public class Q9Q10String {

    // question 9
    public String q9(String str, int choice) {
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
                StringBuilder result = new StringBuilder();

                for (char ch : str.toCharArray()) {
                    if (s.add(ch)) { // Adds only if not already present
                        result.append(ch);
                    }
                }

                return result.toString();

            case 4:
                char[] chArray = str.toCharArray();
                for (int i = 0; i < chArray.length; i++) {
                    if(i % 2 == 0) {
                        chArray[i] = Character.toUpperCase(chArray[i]);
                    }
                }

                return new String(chArray);
            default:
                System.out.println("Not a valid choice");
                break;
        }

        return "";

    }

    // question 10
    public boolean q10(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
