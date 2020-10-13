# Assignment 1
> Yash Kumar Verma, 19BCE2669


*all codes available here [https://github.com/yashkumarverma-bot/semester3/tree/master/java/da1](https://github.com/yashkumarverma-bot/semester3/tree/master/java/da1)*


## Question1
```JAVA
import java.util.Scanner;
public class Arithmetic_Operators
{
   public static void main(String args[])
   {   
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println();
            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            int x = sc.nextInt();
            System.out.print("Enter the second number : ");
            int y = sc.nextInt();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                int add;
                add = x + y;
                System.out.println("Result : "+add);
                break;
 
                case 2:
                int sub;
                sub = x - y;
                System.out.println("Result : "+sub);
                break;
 
                case 3:
                int mul;
                mul = x * y;
                System.out.println("Result : "+mul);
                break;
 
                case 4:
                float div;
                div = (float) x / y;
                System.out.print("Result : "+div);
                break;
 
                case 5:
                int mod;               
                mod = x % y;
                System.out.println("Result : "+mod);
                break;
 
                case 6:
                System.exit(0);
            }
        }
    }
}
```

**Output**

![https://i.imgur.com/naIzJ0B.png](https://i.imgur.com/naIzJ0B.png)

## Question2
Write a Java program to perform operation (Addition, Subtraction, Multiplication, Division) without using third variable.

```JAVA
import java.util.Scanner;

public class ArithmeticOperator2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            float x = sc.nextInt();
            System.out.print("Enter the second number : ");
            int y = sc.nextInt();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    x = x + y;
                    System.out.println("Result : " + x);
                    break;

                case 2:
                    x = x - y;
                    System.out.println("Result : " + x);
                    break;

                case 3:
                    x = x * y;
                    System.out.println("Result : " + x);
                    break;

                case 4:
                    x = (float) x / y;
                    System.out.print("Result : " + x);
                    break;

                case 5:
                    x = x % y;
                    System.out.println("Result : " + x);
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
```

**Output**
![https://i.imgur.com/IooHIPz.png](https://i.imgur.com/IooHIPz.png)


## Question3
Write a Java program to perform Multiplication of two numbers without using * operator.

```JAVA
import java.util.Scanner;

public class MultiplicationWithoutSign {
    static int multiply(int x, int y) {
        if (y == 0)
            return 0;
        if (y > 0)
            return (x + multiply(x, y - 1));
        if (y < 0)
            return -multiply(x, -y);
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number  :");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number :");
        int n2 = sc.nextInt();
        System.out.println();
        System.out.print(multiply(n1, n2));
        System.out.println();
    }
}
```

**Output**

![https://i.imgur.com/WWvOLoJ.png](https://i.imgur.com/WWvOLoJ.png)


## Question4
Write a Java program to check the year is leap year or not.

```JAVA
import java.util.Scanner;

public class LeapYear{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    if((year%4 == 0)&& (year % 100!=0) || (year%400 ==0)){
        System.out.println("This is Leap Year");
    }
    else{
        System.out.println("This is Common Year");
    }
    } 
}
```

**Output**

![https://i.imgur.com/4ps9l0W.png](https://i.imgur.com/4ps9l0W.png)

## Question5 
Write a Java program to print multiplication Table (1 to 15).

```JAVA
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {
        /** starting from 1 to 15 */
        for (int i = 1; i <= 15; i++) {
            /** show till 10 multiplication rows */
            for (int j = 1; j <= 10; j++)
                System.out.println(i + " x " + j + " = " + i * j);

            System.out.println();
        }
    }
}
```

**Output**

![https://i.imgur.com/wd1JjrE.png](https://i.imgur.com/wd1JjrE.png)
![https://i.imgur.com/4sKVBfW.png](https://i.imgur.com/4sKVBfW.png)


## Question6
Write a Java Program to print ASCII Table.

```JAVA
public class AsciiTable {
    public static void main(String args[]) {
        int i;
        /** show all characters till 255 : the limit of ASCII */
        for (i = 0; i < 255; i++) {
            System.out.println("ASCII Character with value " + i + " is " + (char) i);
        }
    }
}
```

**Output**

![https://i.imgur.com/ZGXAgRz.png](https://i.imgur.com/ZGXAgRz.png)
![https://i.imgur.com/b0FH69B.png](https://i.imgur.com/b0FH69B.png)


## Question7
Write a Java program to Calculate and Display the sum of 4 digits number.

```JAVA
import java.util.Scanner;

public class SumOfFourDigit {
    public static void main(String[] args) {
        /** take input from user */
        Scanner handle = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        int number1 = handle.nextInt();
        System.out.print("Enter second number : ");
        int number2 = handle.nextInt();

        /** calculate sum */
        int sum = 0;
        sum += number1 + number2;

        /** show to ser */
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum);
    }
}
```

**Output**

![https://i.imgur.com/omGNJjz.png](https://i.imgur.com/omGNJjz.png)

## Question8
Write a Java program to Obtain the sum of first and last digit of four digit number. 

```JAVA
import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a 4 digit number : ");
        int n = s.nextInt();
        int first = n / 1000;
        int last = n % 10;
        int sum = first + last;
        System.out.println("First digit is :" + first);
        System.out.println("Last digit is :" + last);
        System.out.println("Sum is : " + sum);
    }
}
```

**Output**
![https://i.imgur.com/mK09poA.png](https://i.imgur.com/mK09poA.png)

## Question 9
Write a Java program to check whether given number is Armstrong or not.

```JAVA
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0, a, temp;

        System.out.print("Enter a number to check if it's ArmStrong or not : ");
        int n = sc.nextInt();
        temp = n;

        while (n > 0) {
            a = n % 10;
            n = n / 10;
            k = k + (a * a * a);
        }

        if (temp == k) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
```

**Output**
![https://i.imgur.com/AWJxqjp.png](https://i.imgur.com/AWJxqjp.png)


## Question10
Write a Java program to print Fibonacci Series.

```JAVA
import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        int number, first = 0, third = 0, second = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        number = sc.nextInt();

        System.out.println("First " + number + "fibbonacci number are \n" + first + "\n" + second);

        for (int i = 0; i < number - 2; i++) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
```
**Output**
![https://i.imgur.com/kOWarhr.png](https://i.imgur.com/kOWarhr.png)


## Question11
Write a Java program to print Factorial of Number

```JAVA
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, k, factorial;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        factorial = 1;
        for (k = 1; k <= number; k++) {
            factorial = factorial * k;
        }
        System.out.println("Factorial is " + factorial);

    }
}
```

![https://i.imgur.com/c5u0cQU.png](https://i.imgur.com/c5u0cQU.png)

## Question12
Write a Java program to swap two numbers using third variable.

```JAVA
import java.util.Scanner;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int n2 = sc.nextInt();

        int temp;
        System.out.println("Before swapping number " + n1 + " and " + n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("after swapping number " + n1 + " and " + n2);
    }
}
```

**Output**

![https://i.imgur.com/zvpI5w1.png](https://i.imgur.com/zvpI5w1.png)


## Question13
Write a Java program to swap two numbers without using third variable.

```JAVA
import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter first number : ");
        int n2 = sc.nextInt();

        System.out.println("value of n1:" + n1);
        System.out.println("value of n1:" + n2);
        System.out.println("Before swapping number " + n1 + " and " + n2);
        System.out.println();
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("value of n1:" + n1);
        System.out.println("value of n1:" + n2);
        System.out.println();
        System.out.println("After swapping number " + n1 + " and " + n2);
    }
}
```

![https://i.imgur.com/8wB0uyL.png](https://i.imgur.com/8wB0uyL.png)


## Question14
Write a Java program to calculate the power of Number.

```JAVA
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.print("Enter number : ");
        a = in.nextInt();

        System.out.print("Enter power : ");
        b = in.nextInt();

        a = (int) Math.pow(a, b);
        System.out.println(a);
    }
}
```

**Output**
![https://i.imgur.com/9r8Ux9s.png](https://i.imgur.com/9r8Ux9s.png)

## Question 15
Write a Java program to add two matrix.

```JAVA
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int n;
        System.out.print("Enter the size of matrix : ");
        n = in.nextInt();
        a = new int[n][n];
        System.out.print("Enter the elements of first matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter the elements of second matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] += in.nextInt();
            }
        }

        System.out.println("final matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
```

**Output**
![https://i.imgur.com/MModTW4.png](https://i.imgur.com/MModTW4.png)


## Question16
Write a Java program to multiply two matrix.

```JAVA
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.print("Enter the first matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the second matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/WkoxmN7.png](https://i.imgur.com/WkoxmN7.png)

## Question17
Write a Java program to Calculate diagonal element.

```JAVA
import java.util.Scanner;

public class DiagonalOfMatrix {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int n, ans = 0;

        System.out.print("Enter the size of matrix : ");
        n = in.nextInt();
        a = new int[n][n];
        System.out.print("Enter the elements of the matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (i == j) {
                    ans += a[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal element is : " + ans);
    }
}
```

**Output**
![https://i.imgur.com/4eLTYOI.png](https://i.imgur.com/4eLTYOI.png)


## Question18
Write a Java program to find sum of all digits between 10 and 50, which are divisible by 3.


```JAVA
import java.util.Scanner;

public class SumOfDigitsDivisibleBy3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        for (int i = 12; i < 50; i += 3) {
            ans += i;
        }
        System.out.println("The final answer is : " + ans);
    }
}
```

**Output**
![https://i.imgur.com/NJLnlqO.png](https://i.imgur.com/NJLnlqO.png)


## Question19
Write a Java program to find out all odd numbers divisible by 5 from the range of integers 200 to 800.

```JAVA
import java.util.Scanner;

public class OddDivisibleBy5 {
    public static void main(String args[]) {
        int i;
        int j = 800;
        for (i = 200; i < j; i += 5) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
```

**Output**
![https://i.imgur.com/FefjEoo.png](https://i.imgur.com/FefjEoo.png)


## Question20
Write a Java Program to read the number and check whether it is divisible by 3 and 5.

```JAVA
import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter a number : ");
        n = in.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is Divisible by 3 and 5.");
        } else {
            System.out.println(n + " is Not Divisible by 3 or 5.");
        }
    }
}
```

**Output**
![https://i.imgur.com/l0cmusU.png](https://i.imgur.com/l0cmusU.png)

## Question21
Write a Java Program to display Subject Name based on room number. If the user enters 604 then display Java Programming , If the user enters 605 then display Python programming for any other input display Invalid input to the user

```JAVA
import java.util.Scanner;

public class SubjectNameByRoomNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a class number : ");
        n = in.nextInt();
        if (n == 604) {
            System.out.println("Java Programming");
        } else if (n == 605) {
            System.out.println("Python Programming");
        } else {
            System.out.println("Invalid input");
        }
    }
}
```

**Output**
![https://i.imgur.com/0zdV2xi.png](https://i.imgur.com/0zdV2xi.png)

## Question22
Write a Java Program to print the sum of first n numbers. If n is 3 then print the sum of 1+2+3 to the user. Get n from the user

```JAVA
import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = in.nextInt();
        System.out.print("This is sum from 1 to " + n + " = ");
        System.out.println(n * (n + 1) / 2);
    }
}
```

**Output**
![https://i.imgur.com/BvfktSl.png](https://i.imgur.com/BvfktSl.png)

## Question23
Write a Java Program to print the sum of the series 1^2 +2^2 +3^2 up to n terms

```JAVA
import java.util.Scanner;

public class SumOfSquaresTillN {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = in.nextInt();

        System.out.print("This is the sum of series : ");
        System.out.println(n * (n + 1) * (2 * n + 1) / 6);
    }
}
```

**Output**
![https://i.imgur.com/4Abl1VD.png](https://i.imgur.com/4Abl1VD.png)

## Question24
Write a Java Program to print the multiplication table by getting the n from the user.


```JAVA
import java.util.Scanner;

public class MultiplicationTableByUser {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for multiplication Table : ");
        n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
```

**Output**
![https://i.imgur.com/JtoP18M.png](https://i.imgur.com/JtoP18M.png)

## Question25
Write a Java Program to provide the option of adding two numbers to the user until the user wants to exit.

```JAVA
import java.util.Scanner;

public class AddTillExit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, ans = 0;
        System.out.println("Type 0 for answer");
        System.out.println("Type numbers of sum:");
        do {
            System.out.print("> ");
            n = in.nextInt();
            ans += n;
        } while (n != 0);
        System.out.println("The final answer is :" + ans);
    }
}
```

**Output**
![https://i.imgur.com/MqVKNzw.png](https://i.imgur.com/MqVKNzw.png)

## Question26
Pattern Questions
```
*
**
***
****
```

```JAVA
public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/BEDyDA2.png](https://i.imgur.com/BEDyDA2.png)

## Question27
Pattern:
```
1234
123
12
1
```

```JAVA
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/GT3hsQI.png](https://i.imgur.com/GT3hsQI.png)

## Question28
```
1
12
123
1234
1234
123
12
1
```

```JAVA
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            for (int l = 1; l <= (k + 1); l++) {
                System.out.print(l);
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/8Qyh5jV.png](https://i.imgur.com/8Qyh5jV.png)

## Question29
Half pyramid using *

```JAVA
import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            for (int l = 1; l <= (k + 1); l++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/cq2S6hU.png](https://i.imgur.com/cq2S6hU.png)

## Question30
```
A
BB
CCC
DDDD
EEEEE
```

```JAVA
public class AlphabetPyramid {
    public static void main(String[] args) {
        char last = 'E', alphabet = 'A';
        for (int i = 1; i <= (last - 'A' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet);
            }
            ++alphabet;
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/ha89knA.png](https://i.imgur.com/ha89knA.png)

## Question31
```
* * * * *
* * * *
* * *
* *
*
```

```JAVA
import java.util.Scanner;

public class InvertedStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/HDrRHfM.png](https://i.imgur.com/HDrRHfM.png)

## Question32
Inverted Number Pyramid
```
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

```JAVA
import java.util.Scanner;

public class InvertedNumberPryamid {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n, i;
        System.out.println("Enter a number : ");
        n = in.nextInt();
        i = n;
        while (i > 0) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            i--;
        }
    }
}
```

**Output**
![https://i.imgur.com/J23soG6.png](https://i.imgur.com/J23soG6.png)


## Question33
```
     *
   * * *
  * * * * *
* * * * * * *
```

```JAVA
import java.util.Scanner;

public class FullPyramid {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter limit for pattern : ");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/OfT9gSD.png](https://i.imgur.com/OfT9gSD.png)

## Question34
Pyramid of numbers

```JAVA
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, temp = 0;
        System.out.print("Enter limit for pattern : ");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            temp = i;
            for (int k = 0; k < i; k++) {
                System.out.print(temp++ + " ");
            }
            temp--;
            for (int l = 1; l < i; l++) {
                System.out.print(--temp + " ");
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/dyTixPF.png](https://i.imgur.com/dyTixPF.png)

## Question35
Inverted Pyramid of numbers

```JAVA
import java.util.Scanner;

public class Pattern35 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter limit for pattern : ");
        n = in.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

**Output**
![https://i.imgur.com/nqtTYDM.png](https://i.imgur.com/nqtTYDM.png)

## Question36
Floyd's Triagle

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

**Output**
![https://i.imgur.com/T2F93Cb.png](https://i.imgur.com/T2F93Cb.png)

## Question37
Write a Java program to check whether a number is palindrome or not Write a Java program to print the odd and even values in an array

```JAVA
import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (rev == m)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number not is Palindrome");
        System.out.print("Enter no. of elements you want in array:");
        int k = sc.nextInt();
        int a[] = new int[k];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

    }
}

```

**Output**
![https://i.imgur.com/a5DEmXY.png](https://i.imgur.com/a5DEmXY.png)

## Question38
Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
```JAVA
import java.util.Scanner;

public class RemoveDuplicateFromArray {
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

    /** main caller function */
    public static void main(String[] args) {
        int arr[] = { 50,50,50,50,50,100,100,100,30,50,40,80,90 };
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
```

**Output**
![https://i.imgur.com/mmN4qwn.png](https://i.imgur.com/mmN4qwn.png)

## Question39
Write a Java Program to read the number and check whether it is divisible by 3 and 5. 

```JAVA
import java.util.Scanner;

public class DivisibilityBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println("Number is divided by 3 and 5");
            } else
                System.out.println("Number is not divided by 3 and 5");
        } else
            System.out.println("Number is not divided by 3 and 5");
    }
}

```

**Output**
![https://i.imgur.com/nFY987q.png](https://i.imgur.com/nFY987q.png)

## Question40
Write a Java program to print the third largest number in an array
```JAVA
import java.util.Scanner;

public class ThirdLargestInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Third Largest: " + getThirdLargest(a, a.length));
    }

    public static int getThirdLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 3];
    }
}
```

**Output**
![https://i.imgur.com/0L2Tz5C.png](https://i.imgur.com/0L2Tz5C.png)

## Question41
Write a Java program to print the pascal triangle
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

**Output**
![https://i.imgur.com/GMYOlqq.png](https://i.imgur.com/GMYOlqq.png)

## Question42
Write a Java program to print the floyds triangle

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

**Output**
![https://i.imgur.com/RXrlJDl.png](https://i.imgur.com/RXrlJDl.png)
