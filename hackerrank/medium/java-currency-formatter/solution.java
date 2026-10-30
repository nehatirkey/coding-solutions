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
