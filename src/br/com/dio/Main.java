package br.com.dio;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Calendar vencimento = Calendar.getInstance();

        System.out.println("A data de vencimento do boleto é" +vencimento.getTime());
        vencimento.add(Calendar.DATE, 10);
        System.out.println("Você poderá pagar sem juros até dia " +vencimento.getTime());








    }
}
