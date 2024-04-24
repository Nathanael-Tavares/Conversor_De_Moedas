package service;

import com.google.gson.JsonSyntaxException;
import model.Currency;
import model.CurrencyReceiver;
import model.FetchCurrencyPair;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int choice=1;
        try {
            while (choice!=7){
                System.out.println("***********************************************");
                System.out.println("1.Dollar Americano>>Real\n2.Real>>Peso Argentino\n3.Libra Esterlina>>Real\n4.Real>>Boliviano boliviano\n5.Real>>Dollar Americano\n6.Peso colombiano>>Peso Chileno\n7.SAIR");
                System.out.println("***********************************************");
                System.out.print("Escolha uma das opções acima:");
                choice=scanner.nextInt();
                FetchCurrencyPair getCurrencyPair=new FetchCurrencyPair();
                String[] pairOfCurrencies= getCurrencyPair.intToCurrencies(choice);
                if (choice==7){
                    break;
                }
                System.out.println("Digite o valor a ser convertido:");
                String brlValue=scanner.next();
                CurrencyReceiver currencyReceiver=new CurrencyReceiver();
                Currency currency= currencyReceiver.receiver(brlValue.replace(",","."), pairOfCurrencies[0],pairOfCurrencies[1]);
                System.out.println("Valor convertido: "+currency.getConversion_result()+" "+pairOfCurrencies[1]+"\n");


            }
        }catch (InputMismatchException |NullPointerException e){
            System.out.println("Opção inválida!");

        } catch (JsonSyntaxException e){
            System.out.println("Valor a ser convetido inserido de forma incorreta!");
        }



    }
}