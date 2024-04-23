package service;

import model.Currency;
import model.CurrencyReceiver;
import model.FetchCurrencyPair;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner= new Scanner(System.in);
        int choice=0;


        while (choice!=7){
            System.out.println("***********************************************");
            System.out.println("1.USD>>BRL\n2.BRL>>EUR\n3.EUR>>BRL\n4.BRL>>JPY\n5.BRL>>USD\n6.EUR>>USD\n7.SAIR");
            System.out.println("***********************************************");
            System.out.print("Escolha uma das opções:");
            choice=scanner.nextInt();
            FetchCurrencyPair getCurrencyPair=new FetchCurrencyPair();
            String[] pairOfCurrencies= getCurrencyPair.intToCurrencies(choice);
            if (choice==7){
                break;
            }
            System.out.println("Digite o valor a ser convertido:");
            String brlValue=scanner.next();
            CurrencyReceiver currencyReceiver=new CurrencyReceiver();
            Currency currency= currencyReceiver.receiver(brlValue, pairOfCurrencies[0],pairOfCurrencies[1]);
            System.out.println("Valor convertido: "+currency.getConversion_result()+"\n");


        }




    }
}