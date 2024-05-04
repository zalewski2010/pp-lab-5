import company.beans.Person;
import company.exceptions.InvalidAgeException;



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
    }
}
