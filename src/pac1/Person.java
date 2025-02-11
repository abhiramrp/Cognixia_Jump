package pac1;

enum Gender {
    M, F
}

public class Person {
    private String firstName;
    private String lastName;

    private int age;
    private double weight;
    private String phone;
    private Gender gender;

    public Person(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setGender(gender);
    }

// Question 1.4
    public void printInfo() {
        System.out.println("Person Details");
        System.out.println("_________________");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    // Question 1.8
    public void setGender(char gender) {
        if (gender == 'M') {
            this.gender = Gender.M;
        } else if (gender == 'F') {
            this.gender = Gender.F;
        } else {
            System.out.println("Invalid Gender. Setting Gender to M.");
            this.gender = Gender.M;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
