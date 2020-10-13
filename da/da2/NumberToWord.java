import java.util.Scanner;

public class NumberToWord {
    public static void main(String args[]) {
        Scanner handle = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = handle.nextInt();

        NumberToWord converter = new NumberToWord(number);
        System.out.println(number + " into words is : " + converter.toWords() + ".");
    }

    private int number;
    private int[] edgeCases;

    NumberToWord(int number) {
        this.number = number;
        this.edgeCases = new int[] { 0, 10 };
    }

    public String toWords() {
        /** when only single number provided */
        int lengthOfInput = String.valueOf(this.number).length();

        if (this.number == 0) {
            return this.toCapital("zero");
        } else if (this.number < 10) {
            return this.toCapital(this.singleDigit(this.number));
        } else if (this.number < 20) {
            return this.toCapital(this.doubleDigit(this.number - 10));
        } else if (this.number < 100) {
            return this.toCapital(this.multipleOfTen(this.number / 10) + " " + this.singleDigit(this.number % 10));
        } else if (this.number < 1000) {
            return this.toCapital(this.singleDigit(this.number / 100) + " " + this.powerOfTen(2) + " "
                    + this.multipleOfTen(this.number / 10) + " " + this.singleDigit(this.number % 10));
        } else if (this.number < 10000) {
            return this.toCapital(this.singleDigit(this.number / 1000) + " " + this.powerOfTen(3) + " "
                    + this.singleDigit(this.number / 100) + " " + this.powerOfTen(2) + " "
                    + this.multipleOfTen(this.number / 10) + " " + this.singleDigit(this.number % 10));
        }

        else if (lengthOfInput == 2) {
            return this.toCapital(this.multipleOfTen(this.number / 10) + " " + this.singleDigit(this.number % 10));
        }

        return "Only 4 digit numbers are allowed";

    }

    String toCapital(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    String singleDigit(int digit) {
        String[] wordList = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        return wordList[digit];
    }

    String doubleDigit(int digit) {
        String[] wordList = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        return wordList[digit];
    }

    String multipleOfTen(int digit) {
        String[] wordList = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        return wordList[digit];
    }

    String powerOfTen(int power) {
        String[] wordList = { "", "", "hundred", "thousand" };
        return wordList[power];
    }

}
