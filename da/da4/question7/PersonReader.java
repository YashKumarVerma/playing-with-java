import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import Packages.Person;

/** person class implementing Serializable */

public class PersonReader {
    public static void main(String args[]) {
        System.out.println("Starting de-serialization: ");
        try {
            System.out.println("Reading objects from disk: ");

            FileInputStream fileInputStream = new FileInputStream("object.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person[] persons = (Person[]) objectInputStream.readObject();

            // looping over all persons
            for (Person person : persons) {
                processAge(person);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not found!");
        } catch (IOException e) {
            System.out.println("IO Exception!");
        } catch (ClassNotFoundException e) {
            System.out.println("Undefined Class called");
        }

    }

    static void processAge(Person p) {
        if (p.age > 65) {
            System.out.println(p.name + " is very old");
        } else if (p.age > 45) {
            System.out.println(p.name + " is old");
        } else if (p.age > 25) {
            System.out.println(p.name + " not young");
        } else {
            System.out.println(p.name + " is very young");
        }
    }
}