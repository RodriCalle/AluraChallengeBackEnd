import com.rodbel.models.ConversionDataRequest;
import com.rodbel.models.CurrencyInformation;
import com.rodbel.requests.CurrenciesSingleton;
import com.rodbel.requests.ExchangeRateApi;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CurrenciesSingleton singleton = CurrenciesSingleton.getInstance();
        Scanner scanner = new Scanner(System.in);
        ExchangeRateApi exchangeRateApi = new ExchangeRateApi();
        int option = 0;
        ArrayList<ArrayList<CurrencyInformation>> currenciesMix = new ArrayList<>();

        for (CurrencyInformation currencyFrom : singleton.getCurrencies()) {
            for (CurrencyInformation currencyTo : singleton.getCurrencies()) {
                if (!currencyFrom.equals(currencyTo)) {
                    var list = new ArrayList<CurrencyInformation>();
                    list.add(currencyFrom);
                    list.add(currencyTo);
                    currenciesMix.add(list);
                }
            }
        }


        while (option != currenciesMix.size() + 1) {
            showMenu(currenciesMix);
            option = scanner.nextInt();
            if (option >= currenciesMix.size() + 1) {
                break;
            }
            var amount = askForAmount();
            var currencyFrom = currenciesMix.get(option - 1).get(0).getCurrencyCode();
            var currencyTo = currenciesMix.get(option - 1).get(1).getCurrencyCode();

            ConversionDataRequest conversionDataRequest = new ConversionDataRequest(currencyFrom, currencyTo, amount);
            var response = exchangeRateApi.getConversion(conversionDataRequest);

            showConversionResult(conversionDataRequest, response.getConversionResult());
        }


    }

    static void showMenu(ArrayList<ArrayList<CurrencyInformation>> currenciesMix) {
        int nroOption = 1;
        System.out.println("*******************************************");
        for (ArrayList<CurrencyInformation> mix : currenciesMix) {
            var currencyFrom = mix.get(0);
            var currencyTo = mix.get(1);
            System.out.println(MessageFormat.format("{0}) {1} => {2}", nroOption, currencyFrom.getCurrencyName(), currencyTo.getCurrencyName()));
            nroOption++;
        }
        System.out.println(MessageFormat.format("{0}) Salir", nroOption));
        System.out.println("*******************************************");
    }

    static double askForAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor a convertir: ");
        return scanner.nextDouble();
    }

    static void showConversionResult(ConversionDataRequest conversionDataRequest, double response) {
        System.out.println(MessageFormat.format("El valor de {0} {1} corresponde al valor final de =>> {2} {3}",
                conversionDataRequest.getAmount(),
                conversionDataRequest.getCurrencyFrom(),
                Double.toString(response),
                conversionDataRequest.getCurrencyTo()));
    }
}