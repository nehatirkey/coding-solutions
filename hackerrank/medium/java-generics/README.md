# Java Currency Formatter

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a **single** method *printArray* that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

    1
    2
    3
    Hello
    World

Do not use method overloading because your answer will not be accepted.

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T20:39:08.375Z  

```java
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceF = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usF.format(payment);
        String india = indiaF.format(payment);
        String china = chinaF.format(payment);
        String france = franceF.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-generics/problem)