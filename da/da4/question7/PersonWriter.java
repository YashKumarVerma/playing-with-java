import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import Packages.Person;

public class PersonWriter implements Serializable {
    public static void main(String args[]) {
        System.out.println("Starting Serialization");
        Person yash = new Person("Yash Kumar Verma", 20, 5000);
        Person dhruv = new Person("Dhruv Kumar Verma", 27, 10000);
        Person ravi = new Person("Ravi Kishan", 68, 100000);
        Person shyam = new Person("Shyam Mukherjee", 48, 60000);
        Person[] persons = { yash, dhruv, ravi, shyam };

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("object.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(persons);
            System.out.println("Objects Written to disk");

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not found!");
        } catch (IOException e) {
            System.out.println("IO Exception!");
        }

    }
}