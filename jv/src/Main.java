import company.beans.Person;
import company.exceptions.InvalidAgeException;



public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Angelina", 130);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Oh no invalid age provided: " + e.getMessage() + " Please provide age under 125");
        }
    }
}
