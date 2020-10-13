
import java.util.Date;
import java.util.Scanner;
import java.io.Serializable;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class TimeWorker {
    public static int compare(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = sdf.parse(date1);
            Date d2 = sdf.parse(date2);
            long getTimeStampDifference = d2.getTime() - d1.getTime();
            long getDifferenceInDays = (getTimeStampDifference / (1000 * 60 * 60 * 24)) % 365;
            return (int) getDifferenceInDays;
        } catch (ParseException e) {
            return -1;
        }
    }
}

class Patient implements Serializable {
    int age;
    String name;
    String address;
    String mobileNumber;
    String blood;
    String symptons;
    String date;

    Patient(int age, String name, String address, String mobileNumber, String blood, String symptons, String date) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.blood = blood;
        this.symptons = symptons;
        this.date = date;
    }
}

public class COVID19 {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of patients : ");
        int items = handler.nextInt();
        handler.nextLine();

        Patient patients[] = new Patient[items];
        System.out.println("Enter " + items + " details : ");

        int age;
        String name;
        String address;
        String mobileNumber;
        String blood;
        String symptons;
        String date;

        for (int i = 0; i < items; i++) {
            System.out.println();
            System.out.print("Enter Name: ");
            name = handler.nextLine();
            System.out.print("Enter Age: ");
            age = handler.nextInt();
            handler.nextLine();
            System.out.print("Enter Address: ");
            address = handler.nextLine();
            System.out.print("Enter Mobile Number: ");
            mobileNumber = handler.nextLine();
            System.out.print("Enter blood group: ");
            blood = handler.nextLine();
            System.out.print("Enter symptons: ");
            symptons = handler.nextLine();
            System.out.print("Enter Date: ");
            date = handler.nextLine();

            patients[i] = new Patient(age, name, address, mobileNumber, blood, symptons, date);
        }

        try {

            /** writing */
            FileOutputStream fos = new FileOutputStream("patients.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(patients);
            oos.close();

            FileInputStream fis = new FileInputStream("patients.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Patient[] savedPatient = (Patient[]) ois.readObject();
            ois.close();

            String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            System.out.println("Today: " + today);
            for (int i = 0; i < savedPatient.length; i += 1) {
                if (savedPatient[i].symptons.equals(new String("fever"))) {
                    if (TimeWorker.compare(savedPatient[i].date, today) <= 7) {
                        System.out.println("Name: " + savedPatient[i].name);
                        System.out.println("Mobile: " + savedPatient[i].mobileNumber);
                        System.out.println("Symptoms:" + savedPatient[i].symptons);
                        System.out.println("Symptom = " + savedPatient[i].symptons);
                        System.out.println("Date = " + TimeWorker.compare(savedPatient[i].date, today));
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("Error");
        }
    }
}
