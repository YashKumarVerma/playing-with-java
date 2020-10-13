import java.util.Scanner;

class Train {
    public int time;
    private String src;
    private String dest;
    private int platform;
    public int train_no;
    private int traveltime;
    private char traveltype;

    Train(int train_no, String src, String dest, int time, int traveltime, int platform, char traveltype) {
        this.train_no = train_no;
        this.src = src;
        this.dest = dest;
        this.time = time;
        this.traveltime = traveltime;
        this.platform = platform;
        this.traveltype = traveltype;
    }

    void printDetails() {
        System.out.println("Displaying Train Details:");
        System.out.println("Train no.: " + this.train_no);
        System.out.println("Source: " + this.src);
        System.out.println("Destination: " + this.dest);
        System.out.println("Time: " + this.time + "hrs");
        System.out.println("Travel Time: " + this.traveltime + "hrs");
        System.out.println("Platform number: " + this.platform);
        System.out.println("Travel Type: " + this.traveltype);
        System.out.println("---");
    }
}

public class MGRStation {
    public static void main(String args[]) {
        Train Train1 = new Train(5, "PUNE", "MUMBAI", 1400, 3, 1, 'A');
        Train Train2 = new Train(2, "MUMBAI", "PUNE", 900, 3, 2, 'D');
        Train Train3 = new Train(3, "KOLKATA", "PUNE", 1800, 12, 3, 'D');
        Train Train4 = new Train(1, "GOA", "MUMBAI", 700, 2, 4, 'A');
        Train Train5 = new Train(4, "KOLKATA", "GOA", 2100, 11, 5, 'D');

        // create array of trains
        Train[] trains = { Train1, Train2, Train3, Train4, Train5 };

        // user interaction
        System.out.print("Enter train number to search: ");
        Scanner handler = new Scanner(System.in);
        int trainNumber = handler.nextInt();
        handler.nextLine();

        MGRStation station = new MGRStation();
        try {
            station.SearchFunction(trains, trainNumber).printDetails();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Train Not found");
        }

        try {
            System.out.print("Enter sorting method (TN OR TM): ");
            String method = handler.nextLine();
            Train sortedTrains[] = new Train[5];
            sortedTrains = station.SortFunction(trains, method);
            for (Train t : sortedTrains) {
                t.printDetails();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Search method");
        }

        handler.close();
    }

    // search trains by id
    public Train SearchFunction(Train[] trains, int trainNumber) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].train_no == trainNumber) {
                return trains[i];
            }
        }
        throw new ArrayIndexOutOfBoundsException("Train Not found");
    }

    // sort trains
    public Train[] SortFunction(Train[] trains, String method) throws ArrayIndexOutOfBoundsException {
        // if (method == "TM") {
        return this.sortByTrainNumber(trains);
        // } else if (method == "TN") {
        // return this.sortByTime(trains);
        // } else {
        // throw new ArrayIndexOutOfBoundsException();
        // }
    }

    // sort by train number
    private Train[] sortByTrainNumber(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].train_no > trains[j].train_no) {
                    Train temp = trains[j];
                    trains[j] = trains[i];
                    trains[i] = temp;
                }
            }
        }
        return trains;
    }

    // sort by time
    private Train[] sortByTime(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].time > trains[j].time) {
                    Train temp = trains[j];
                    trains[j] = trains[i];
                    trains[i] = temp;
                }
            }
        }
        return trains;
    }
}