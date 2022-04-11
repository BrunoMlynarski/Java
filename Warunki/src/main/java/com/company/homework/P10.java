package main.java.com.company.homework;


import java.text.NumberFormat;
import java.util.Locale;

public class P10 {
    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    double payment = scanner.nextDouble();
//    scanner.close();

        double payment = 12324.134 ;
    //12324,134

        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
    String us = usa.format(payment);

        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = in.format(payment);
        NumberFormat chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chi.format(payment);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fr.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


}
}


