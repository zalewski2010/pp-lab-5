import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;



public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Angelina", 30);
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Oh no invalid age provided for person1: " + e.getMessage() + " Please provide age under 125");
        }

        try {
            Person person2 = new Person("Marek", 130);
            System.out.println("Name: " + person2.getName());
            System.out.println("Age: " + person2.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Oh no invalid age provided for person2: " + e.getMessage() + " Please provide age under 125");
        }

        int num1 = 10;
        int num2 = 5;

        int sum = MathUtils.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Hej. To email testowy");

        Messenger messengerSum = new EmailMessenger();
        messengerSum.sendMessage("The sum of " + num1 + " and " + num2 + " is: " + sum);

        Person[] people = new Person[5];

        final int b = 10; // stała

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Joe Smith", 25);
            people[2] = new Person("John Johnson", 40);
            people[3] = new Person("Mike Micheal", 35);
            people[4] = new Person("Michael Mike", 28);
        } catch (InvalidAgeException e) {
            System.err.println("Invalid age provided: " + e.getMessage());
        }

        Messenger messenger3 = new EmailMessenger();

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                int age = people[i].getAge();
                int value = MathUtils.add(age, b);
                messenger3.sendMessage(people[i].getName() + " is " + age + " years old. Calculated value is: " + value);
            }
        }

    }
}
