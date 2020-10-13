# Digital Assignment 2.1

- Submitted by: Yash Kumar Verma / 19BCE2669
- All codes in this document are available at [https://github.com/yashkumarverma-bot/semester3](https://github.com/yashkumarverma-bot/semester3)
- The questions from problem set "Assignment 2" are solved first, then the remaining questions from "Assignment 1"
  
---
 
## Question
Write a Java program to print all the distinct elements in an array. Distinct elements are
nothing but the unique (non-duplicate) elements present in the given array.

#### Code
```JAVA
import java.util.Scanner;

public class DistinctElementsOfArray {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        int dc = 0;
        System.out.println("Enter " + items + " values : ");
        int temp;

        for (int i = 0; i < items; i++) {
            temp = handler.nextInt();
            if (!DistinctElementsOfArray.arrayContains(data, temp)) {
                System.out.println("> " + temp + " ");
                data[dc++] = handler.nextInt();
            }
        }

        handler.close();
    }

    static boolean arrayContains(int[] haystack, int needle) {
        for (int item : haystack) {
            if (item == needle) {
                return true;
            }
        }
        return false;
    }
}
```

#### Output
![https://i.imgur.com/J9CBLu3.png](https://i.imgur.com/J9CBLu3.png)

---

## Question
Write a Java program to check if the given character is a vowel or consonant.

#### Code
```JAVA
import java.util.Scanner;

interface ArrayFiltering {
    static boolean arrayContains(char[] haystack, char needle) {
        for (char item : haystack) {
            if (item == needle) {
                return true;
            }
        }
        return false;
    }
};

public class VowelOrConsonant implements ArrayFiltering {
    public static void main(String args[]) {
        char vowels[] = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
        Scanner handler = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String string = handler.nextLine();

        for (int i = 0; i < string.length(); i += 1) {
            if (ArrayFiltering.arrayContains(vowels, string.charAt(i))) {
                System.out.println("> " + string.charAt(i) + " is a vowel.");
            } else {
                System.out.println("> " + string.charAt(i) + " is a consonant.");
            }
        }
    }

}
```

#### Output
![https://i.imgur.com/8TK8k3R.png](https://i.imgur.com/8TK8k3R.png)

---

## Question
Program to find frequency of words

#### Code
```JAVA
import java.util.Scanner;

interface ArrayUtil {
    static boolean arrayContains(char[] haystack, char needle) {
        for (char item : haystack) {
            if (item == needle) {
                return true;
            }
        }
        return false;
    }

    static int indexOf(char[] haystack, char needle) {
        for (int i = 0; i < haystack.length; i += 1) {
            if (haystack[i] == needle) {
                return i;
            }
        }

        return -1;
    }
};

public class FrequencyOfItems implements ArrayUtil {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();
        char characters[] = new char[string.length()];
        int instances[] = new int[string.length()];
        int uniques = 0;

        for (int i = 0; i < string.length(); i += 1) {
            if (ArrayUtil.arrayContains(characters, string.charAt(i))) {
                instances[ArrayUtil.indexOf(characters, string.charAt(i))] += 1;
            } else {
                characters[uniques] = string.charAt(i);
                instances[uniques] = 1;
                uniques++;
            }
        }

        for (int i = 0; i < uniques; i += 1) {
            System.out.println("> " + characters[i] + " occurs " + instances[i] + " times.");
        }
    }
}

```

#### Output
![https://i.imgur.com/b8sf0BQ.png](https://i.imgur.com/b8sf0BQ.png)

---

## Question
Write a Java program to find the length of a string without using strlen()
function

#### Code
```JAVA
import java.util.Scanner;

public class LengthOfString {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();
        int stringLength = 0;

        for (char c : string.toCharArray()) {
            stringLength++;
        }

        System.out.println("> Length of String \"" + string + "\" is " + stringLength);
    }
}
```

#### Output
![https://i.imgur.com/dCuEeUJ.png](https://i.imgur.com/dCuEeUJ.png)

---

## Question
Write a Java program to remove all characters in a string except
alphabet.

#### Code
```JAVA
import java.util.Scanner;

public class LengthOfString {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();
        int stringLength = 0;

        for (char c : string.toCharArray()) {
            stringLength++;
        }

        System.out.println("> Length of String \"" + string + "\" is " + stringLength);
    }
}
```

#### Output
![https://i.imgur.com/xXpZABn.png](https://i.imgur.com/xXpZABn.png)

---

## Question
Write a Java program to find the largest palindrome in an array

#### Code
```JAVA
import java.util.Scanner;

public class LargestPalindrome {
    static void printSubString(String string, int low, int high) {
        System.out.println(string.substring(low, high + 1));
    }

    static int longestPalindromeString(String str) {
        int start = 0;
        int maxLength = 1;
        int length = str.length();
        boolean table[][] = new boolean[length][length];
        for (int i = 0; i < length; ++i) {
            table[i][i] = true;
        }

        // check for sub-string of length 2.
        for (int i = 0; i < length - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= length; ++k) {
            for (int i = 0; i < length - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubString(str, start, start + maxLength - 1);
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner handler = new Scanner(System.in);
        String string = handler.nextLine();
        System.out.println("Length is: " + longestPalindromeString(string));
    }
}
```

#### Output
![https://i.imgur.com/NPw7RZL.png](https://i.imgur.com/NPw7RZL.png)

---

## Question
Write a Java program to convert a number from decimal to binary.

#### Code
```JAVA
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a number in base 10 : ");
        System.out.println("> " + Integer.toBinaryString(handler.nextInt()));
    }
}
```

#### Output
![https://i.imgur.com/RF0MD1i.png](https://i.imgur.com/RF0MD1i.png)

---

## Question
Write a Java program to reverse every words in a sentence.

#### Code
```JAVA
import java.util.Scanner;

interface StringReverser {
    static String processString(String str) {
        char c[] = str.toCharArray();
        char temp;
        for (int i = 0; i < c.length / 2; i += 1) {
            temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }

        return String.valueOf(c);
    }
}

public class ReverseEachWord implements StringReverser {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();

        System.out.print("> ");
        for (String s : string.split(" ")) {
            System.out.print(StringReverser.processString(s) + " ");
        }
        System.out.println();
    }
}
```

#### Output
![https://i.imgur.com/lIPU0Xr.png](https://i.imgur.com/lIPU0Xr.png)

---

## Question
Write a Java program to check if two strings are anagrams or not.
Anagram means that both strings contain the same character set, only their order is
different. Therefore, in both strings, the frequency of each letter must be the same.
For example, strings "act" and "cat" are anagrams.

#### Code
```JAVA
import java.util.Scanner;

interface ArrayUtil {
    static boolean arrayContains(char[] haystack, char needle) {
        for (char item : haystack) {
            if (item == needle) {
                return true;
            }
        }
        return false;
    }

    static boolean checkAnagram(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            return false;
        }

        for (char c : s1) {
            if (!ArrayUtil.arrayContains(s2, c)) {
                return false;
            }
        }

        return true;
    }
}

public class Anagrams implements ArrayUtil {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String string1 = handler.nextLine();

        System.out.print("Enter second string : ");
        String string2 = handler.nextLine();

        char str1[] = string1.toCharArray();
        char str2[] = string2.toCharArray();

        if (ArrayUtil.checkAnagram(str1, str2)) {
            System.out.println("> Strings are Anagram");
        } else {
            System.out.println("> Strings are not anagrams");
        }
    }
}
```

#### Output
![https://i.imgur.com/UwKdxx0.png](https://i.imgur.com/UwKdxx0.png)

---
## Question
Write a Java program to sort a strings in alphabetical order

#### Code
```JAVA
import java.util.Scanner;
import java.util.Arrays;

interface StringUtil {
    static String sort(String string) {
        return string;
    }
}

public class SortString {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int items = handler.nextInt();
        String string[] = new String[items];

        /** taking input of data */
        handler.nextLine();
        for (int i = 0; i < items; i += 1) {
            System.out.print("Enter string " + (i + 1) + " :");
            string[i] = handler.nextLine();
        }

        Arrays.sort(string);

        for (String s : string) {
            System.out.println("> " + s);
        }
    }
}
```

#### Output
![https://i.imgur.com/VRcJreh.png](https://i.imgur.com/VRcJreh.png)

---

## Question
Write a Java program to check whether the given string is a palindrome or not

#### Code
```JAVA
import java.util.Scanner;

interface StringReverser {
    static String processString(String str) {
        char c[] = str.toCharArray();
        char temp;
        for (int i = 0; i < c.length / 2; i += 1) {
            temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }
        return String.valueOf(c);
    }
}

public class Palindrome implements StringReverser {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();

        System.out.println(StringReverser.processString(string));

        if (string.compareTo(StringReverser.processString(string)) == 0) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
```

#### Output
![https://i.imgur.com/AC3yDkw.png](https://i.imgur.com/AC3yDkw.png)

---

## Question
Program to convert numbers to words

#### Code
```JAVA
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

```

#### Output
![https://i.imgur.com/z0HkAHr.png](https://i.imgur.com/z0HkAHr.png)

---

## Question
Write a Java program to remove vowels from a string.

#### Code
```JAVA
import java.util.Scanner;
import java.util.Arrays;

public class VowelRemover {
    public static void main(String args[]) {
        System.out.print("Enter a string: ");
        Scanner handler = new Scanner(System.in);
        String string = handler.nextLine();

        String[] vowels = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
        for (int i = 0; i < vowels.length; i++) {
            string = string.replace(vowels[i], "");
        }

        System.out.println("New String : " + string);
    }

}
```

#### Output
![https://i.imgur.com/V9KSHXM.png](https://i.imgur.com/V9KSHXM.png)

---

## Question
Write a Java program to check whether a number is palindrome or not

#### Code
```JAVA
import java.util.Scanner;

public class OddAndEvenValues {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];

        System.out.print("Enter " + items + " items : ");
        for (int i = 0; i < items; i += 1) {
            data[i] = handler.nextInt();
        }
        System.out.println();

        System.out.println("Displaying even positioned values : ");
        for (int i = 0; i < items; i += 2) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.println("Displaying odd positioned values : ");
        for (int i = 1; i < items; i += 2) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }
}
```

#### Output
![https://i.imgur.com/NXI1bdE.png](https://i.imgur.com/NXI1bdE.png)

---

## Question
Write a Java program to print the odd and even values in an array

#### Code
```JAVA
import java.util.Scanner;

interface StringReverser {
    static String processString(String str) {
        char c[] = str.toCharArray();
        char temp;
        for (int i = 0; i < c.length / 2; i += 1) {
            temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }
        return String.valueOf(c);
    }
}

public class NumberPalindromeOrNot implements StringReverser {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String string = handler.nextLine();

        System.out.println(StringReverser.processString(string));

        if (string.compareTo(StringReverser.processString(string)) == 0) {
            System.out.println("Number is palindrome.");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
```

#### Output
![https://i.imgur.com/7rdj6qz.png](https://i.imgur.com/7rdj6qz.png)

---


## Question
Write a Java program to remove the duplicate elements of a given array and return the new
length of the array

#### Code
```JAVA
import java.util.Scanner;

public class RemoveDuplicate {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];

        System.out.print("Enter items : ");
        for (int i = 0; i < items; i += 1) {
            data[i] = handler.nextInt();
        }

        int length = removeDuplicateElements(data, data.length);

        System.out.println("New Length : " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }
}
```

#### Output
![https://i.imgur.com/nS1x7gv.png](https://i.imgur.com/nS1x7gv.png)


## Question
Write a Java Program to read the number and check whether it is divisible by 3 and 5.

#### Code
```JAVA
import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = handler.nextInt();

        if (n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println("Number is divided by 3 and 5");
            } else {
                System.out.println("Number is not divided by 3 and 5");
            }
        } else {
            System.out.println("Number is not divided by 3 and 5");
        }
    }
}
```

#### Output
![https://i.imgur.com/Mwh65FE.png](https://i.imgur.com/Mwh65FE.png)

---

## Question
Write a Java program to print the third largest number in an array

#### Code
```JAVA
import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < items; i += 1) {
            data[i] = handler.nextInt();
        }

        Arrays.sort(data);
        System.out.println("Third Largest Element is : " + data[data.length - 4]);

    }
}
```

#### Output
![https://i.imgur.com/mzx1ZjI.png](https://i.imgur.com/mzx1ZjI.png)

---

## Question
Write a Java program to print the pascal triangle

#### Code 
```JAVA
import java.util.Scanner;

public class PascalTriangle {
    static int factorial(int n) {
        int f;
        for (f = 1; n > 1; n--) {
            f *= n;
        }
        return f;
    }

    static int ncr(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit for triangle : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
    }
}
```

#### Output
![https://i.imgur.com/GMYOlqq.png](https://i.imgur.com/GMYOlqq.png)

---

## Question
Write a Java program to print the floyds triangle

#### Code
```JAVA
import java.util.Scanner;

public class FloydTriangle {
    public static void main(String args[]) {
        int n;
        int number = 1;
        int i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter limit for pattern : ");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((number++) + "\t");
            }
            System.out.println();
        }
    }
}
```

#### Output
![https://i.imgur.com/RXrlJDl.png](https://i.imgur.com/RXrlJDl.png)

---
