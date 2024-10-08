package com.rodbel.requests;

import com.rodbel.models.CurrencyInformation;

import java.util.ArrayList;

public final class CurrenciesSingleton {
    private static CurrenciesSingleton instance;
    private ArrayList<CurrencyInformation> currencies;

    private CurrenciesSingleton() {
        currencies = new ArrayList<>();
        currencies.add(new CurrencyInformation("USD", "United States Dollar",
                "United States"));
        currencies.add(new CurrencyInformation("ARS", "Argentine Peso",
                "Argentina"));
        currencies.add(new CurrencyInformation("BRL", "Brazilian Real",
                "Brazil"));
        currencies.add(new CurrencyInformation("COP", "Colombian Peso",
                "Colombia"));
        currencies.add(new CurrencyInformation("PEN", "Peruvian Sol",
                "Peru"));
    }

    public static CurrenciesSingleton getInstance() {
        if (instance == null) {
            instance = new CurrenciesSingleton();
        }
        return instance;
    }

    public ArrayList<CurrencyInformation> getCurrencies() {
        return currencies;
    }
}
