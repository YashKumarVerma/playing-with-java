# DA2.2
## Question
Write a Java program to sort an array of positive integers of an given array, in the sorted array the value of the first element should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.

#### Code
```JAVA
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class AlternateOrder {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.print("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        Collections.sort(Arrays.asList(data), Collections.reverseOrder());

        int[] finalArr = new int[data.length];
        for (int i = 0; i < data.length; i += 2) {
            finalArr[i] = data[i];
            finalArr[i + 1] = data[data.length - i - 1];
        }

        for (int i = 0; i < finalArr.length; i++) {
            System.out.println(finalArr[i]);
        }
    }
}
```

#### Output
![https://i.imgur.com/77YZ3CZ.png](https://i.imgur.com/77YZ3CZ.png)

---

## Question
Write a Java program to separate even and odd numbers of an given array of integers. Put all
even numbers first, and then odd numbers.

#### Code
```JAVA
import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = handler.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int odd = n - 1;
        int even = 0;

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = handler.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[even] = a[i];
                even++;
            } else {
                b[odd] = a[i];
                odd--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
```

#### Output
![https://i.imgur.com/WaNydzo.png](https://i.imgur.com/WaNydzo.png)

---

## Question
Java program generates random numbers within the provided range.

#### Code
```JAVA
import java.util.Scanner;
import java.util.Random;

public class RandomNumbersInGivenRange {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter max range : ");
        int maxRange = handler.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("> " + random.nextInt(maxRange));
        }
    }
}
```

#### Output
![https://i.imgur.com/QXAkhCI.png](https://i.imgur.com/QXAkhCI.png)

---

## Question
Write a Java Program to generate the random number between the ranges.

#### Code
```JAVA
import java.util.Scanner;

public class RandomNumberBetweenGivenRange {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter starting range : ");

        int lowerRange = handler.nextInt();
        System.out.print("Enter final range : ");
        int upperRange = handler.nextInt();
        int randomNumber = lowerRange + (int) (Math.random() * ((upperRange - lowerRange) + 1));
        System.out.println("Random number between given range : " + randomNumber);
    }
}
```

#### Output
![https://i.imgur.com/SMkX5SP.png](https://i.imgur.com/SMkX5SP.png)

---

## Question
Java program to reverse a number.

#### Code
```JAVA
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int temp;
        int number;
        int number2 = 0;
        System.out.print("Enter a number : ");
        number = handler.nextInt();

        while (number != 0) {
            temp = number % 10;
            number2 = number2 * 10 + temp;
            number = number / 10;
        }
        System.out.println("Reversed Number is " + number2);
    }
}
```

#### Output
![https://i.imgur.com/OvcxRfa.png](https://i.imgur.com/OvcxRfa.png)

---

## Question
Write a Java program to convert a binary number to decimal number and to
decimal number to binary number

#### Code
```JAVA
import java.util.Scanner;

public class BaseConversion {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        long number1 = handler.nextLong();
        int decimal = convertBinaryToDecimal(number1);
        System.out.printf("%d in binary = %d in decimal", number1, decimal);

        System.out.print("\nEnter Decimal number : ");
        int number2 = handler.nextInt();
        long binary = convertDecimalToBinary(number2);
        System.out.printf("%d in decimal = %d in binary", number2, binary);
        System.out.println("");
    }

    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

    public static long convertDecimalToBinary(int n) {
        long binaryNumber = 0;
        int remainder, i = 1;

        while (n != 0) {
            remainder = n % 2;
            n = n / 2;
            binaryNumber += remainder * i;
            i = i * 10;
        }
        return binaryNumber;
    }
}
```

#### Output
![https://i.imgur.com/WEmN9mm.png](https://i.imgur.com/WEmN9mm.png)

---

## Question
Write a Java program to create and display unique three-digit number using 1,
2, 3, 4. Also count how many three-digit numbers are there.

#### Code
```JAVA
public class UniqueThreeDigits {
    public static void main(String[] args) {
        int temp = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        temp++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three digit number is " + temp);
    }
}
```

#### Output
![https://i.imgur.com/APhF4Xr.png](https://i.imgur.com/APhF4Xr.png)

---

## Question
Write a Java program that accepts an integer (n) and computes the value of
n+nn+nnn.

#### Code
```JAVA
import java.util.Scanner;

public class FormulaQuestion {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter n to calculate n + nn + nnn : ");
        int n = handler.nextInt();
        System.out.println("> " + (n + n * n + n * n * n));

    }
}
```

#### Output
![https://i.imgur.com/f4NNCm9.png](https://i.imgur.com/f4NNCm9.png)

---

## Question
Write a program to display system time

#### Code
```JAVA
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DisplaySystemTime {
    public static void main(String args[]) {
        System.out.println("Displaying Current Time");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        format.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));

        System.out.println("Now: " + format.format(System.currentTimeMillis()));
    }
}
```

#### Output
![https://i.imgur.com/8Ez5i7x.png](https://i.imgur.com/8Ez5i7x.png)

---

## Question
Write a Java program to calculate the sum of two integers and return true if
the sum is equal to a third integer.

#### Code
```JAVA
import java.util.Scanner;

public class SumOfTwoEqualToThird {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.println("Enter three Numbers :");
        System.out.print("Enter first Number : ");
        int first = handler.nextInt();
        System.out.print("Enter second Number : ");
        int second = handler.nextInt();
        System.out.print("Enter third Number : ");
        int third = handler.nextInt();

        if (first + second == third || second + third == first || third + first == second) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

#### Output
![https://i.imgur.com/9bwEA4s.png](https://i.imgur.com/9bwEA4s.png)

---

## Question
Write a Java program that accepts three integers from the user and return true
if the second number is greater than first number and third number is greater
than second number. If "abc" is true second number does not need to be
greater than first number. 

#### Code
```JAVA
import java.util.Scanner;

public class NumberOrder {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.println("Enter three Numbers :");
        System.out.print("Enter first Number : ");
        int first = handler.nextInt();
        System.out.print("Enter second Number : ");
        int second = handler.nextInt();
        System.out.print("Enter third Number : ");
        int third = handler.nextInt();

        System.out.println("The result is " + (first < second && second < third));

    }
}
```

#### Output
![https://i.imgur.com/GJO7pHw.png](https://i.imgur.com/GJO7pHw.png)

---

## Question
Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to 2.
Test Data: array = `50, -20, 0, 30, 40, 60, 10`
Sample Output: `False`

#### Code
```JAVA
import java.util.Scanner;

public class FirstAndLastOfTwoArr {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements in array 1 : ");
        int items1 = handler.nextInt();
        int data1[] = new int[items1];
        System.out.println("Enter " + items1 + " values : ");

        for (int i = 0; i < items1; i++) {
            data1[i] = handler.nextInt();
        }

        System.out.print("Enter number of elements in array 2 : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        System.out.println("Starting elements of both array are same: " + (data[0] == data1[0]));
        System.out.println("Last elements of both array are same: " + (data[items - 1] == data1[items1 - 1]));
        System.out.println("First element of first array is equal to last element of second array : "
                + (data1[0] == data[items - 1]));
        System.out.println("Last element of first array is equal to first element of second array : "
                + (data1[items1 - 1] == data[0]));

    }
}
```

#### Output
![https://i.imgur.com/21x841k.png](https://i.imgur.com/21x841k.png)

---

## Question
Write a Java program to create a new array of length 2 from two arrays of
integers with three elements and the new array will contain the first and last
elements from the two arrays
Test Data: 
```
array1 = 50, -20, 0
array2 = 5, -50, 10
```
Sample Output:
```
Array1: [50, -20, 0]
Array2: [5, -50, 10]
New Array: [50, 10]
```

#### Code
```JAVA
import java.util.Scanner;

public class NewArrContainingFirstAndLast {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements in array 1 : ");
        int items1 = handler.nextInt();
        int data1[] = new int[items1];
        System.out.println("Enter " + items1 + " values : ");

        for (int i = 0; i < items1; i++) {
            data1[i] = handler.nextInt();
        }

        System.out.print("Enter number of elements in array 2 : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        int finalArr[] = { data1[0], data[items - 1] };
        System.out.println("First element of new arr : " + finalArr[0]);
        System.out.println("Second element of new arr : " + finalArr[1]);

    }
}
```

#### Output
![https://i.imgur.com/Kmp6c8B.png](https://i.imgur.com/Kmp6c8B.png)

---

## Question
Write a Java program to test that a given array of integers of length 2
contains a 4 or a 7.

#### Code
```JAVA
import java.util.Scanner;

public class ContainsTwoOrSeven {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int data[] = new int[2];
        System.out.print("Enter first number : ");
        int first = handler.nextInt();
        System.out.print("Enter second number : ");
        int second = handler.nextInt();

        data[0] = first;
        data[1] = second;

        if (data[0] == 4 || data[0] == 7 || data[1] == 4 || data[1] == 7) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
```

#### Output
![https://i.imgur.com/E5oDxe3.png](https://i.imgur.com/E5oDxe3.png)

---


## Question
Write a Java program to rotate an array (length 3) of integers in left direction

#### Code
```JAVA
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int[] a;
        int temp;
        a = new int[3];

        System.out.println("Enter three of array : ");
        for (int i = 0; i < 3; i++) {
            a[i] = handler.nextInt();
        }

        System.out.print("Original Array : [");
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i] + "]");
            }
        }

        temp = a[0];
        for (int i = 0; i < 2; i++) {
            a[i] = a[i + 1];
        }
        a[2] = temp;
        System.out.print("Rotated Array : [");
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i] + "]");
            }
        }
    }
}
```

#### Output
![https://i.imgur.com/QUEmkLW.png](https://i.imgur.com/QUEmkLW.png)

---


## Question
Write a Java program to get the larger value between first and last element of
an array (length 3) of integers .

#### Code
```JAVA
import java.util.Scanner;

public class LargestValueOfArray {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int items = 3;
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        if (data[0] > data[2]) {
            System.out.println(data[0] + " is greater than " + data[2]);
        } else {
            System.out.println(data[2] + " is greater than " + data[0]);
        }

    }
}
```

#### Output
![https://i.imgur.com/MVaSEyA.png](https://i.imgur.com/MVaSEyA.png)

---


## Question
Write a Java program to swap the first and last elements of an array (length
must be at least 1) and create a new array.

#### Code
```JAVA
import java.util.Scanner;

public class SwapFirstAndLast {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        int newArray[] = new int[items];
        for (int i = 0; i < items; i += 1) {
            newArray[i] = data[i];
        }

        newArray[0] = data[items - 1];
        newArray[items - 1] = data[0];

        System.out.print("[");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
```

#### Output
![https://i.imgur.com/6PTqfMK.png](https://i.imgur.com/6PTqfMK.png)
---

## Question
Write a Java program to find the largest element between first, last, and
middle values from an array of integers (even length).

#### Code
```JAVA
import java.util.Scanner;

public class FirstLastAndMiddle {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();

        /** ensure only even length */
        while (items % 2 == 0) {
            System.out.println("Enter an odd length.");
            items = handler.nextInt();
        }

        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        int middle = data[items / 2];
        if (data[0] > middle) {
            if (data[0] > data[items - 1]) {
                System.out.println("> " + data[0] + " is largest.");
            } else {
                System.out.println("> " + data[items - 1] + " is largest.");
            }
        } else {
            if (middle > data[items - 1]) {
                System.out.println("> " + middle + " is largest.");
            } else {
                System.out.println("> " + data[items - 1] + " is largest.");
            }
        }
    }
}
```

#### Output
![https://i.imgur.com/JcBUw2a.png](https://i.imgur.com/JcBUw2a.png)

---

## Question
Write a Java program to multiply corresponding elements of two arrays of
integers.

#### Code
```JAVA
import java.util.Scanner;

public class MultiplyCorrespondingArray {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        int data2[] = new int[items];
        System.out.println("Enter values of second array : ");
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data2[i] = handler.nextInt();
        }

        for (int i = 0; i < data.length; i += 1) {
            System.out.println("> " + data[i] + " * " + data2[i] + " = " + data[i] * data2[i]);
        }
    }
}
```

#### Output
![https://i.imgur.com/y10z7Pc.png](https://i.imgur.com/y10z7Pc.png)

---
## Question
Write a program to demonstrate the knowledge of students in multidimensional arrays
and looping constructs.
Eg., If there are 4 batches in BTech - “CSE1007” course, read the count of the slow
learners (who have scored <25) in each batch. Tutors should be assigned in the ratio of
1:4 (For every 4 slow learners, there should be one tutor). Determine the number of
tutors for each batch. Create a 2-D jagged array with 4 rows to store the count of slow
learners in the 4 batches. The number of columns in each row should be equal to the
number of groups formed for that particular batch ( Eg., If there are 23 slow learners in
a batch, then there should be 6 tutors and in the jagged array, the corresponding row
should store 4, 4, 4, 4, 4,3). Use for-each loop to traverse the array and print the details.
Also print the number of batches in which all tutors have exactly 4 students. 

#### Code
```JAVA

```

#### Output


---