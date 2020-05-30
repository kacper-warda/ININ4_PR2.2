package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    private static final String DEFAULT_APP_PROTOCOL = "HTTPS";
    private static final String DEFAULT_APP_SERVER = "me.appstore.com";
    private static final int DEFAULT_PORT_NUMBER = 443;

    public Phone(String mark, String model, Integer yearOfProduction) {
        super(mark, model, yearOfProduction);
    }

    @Override
    void turnOn() {
        System.out.println("hello kitty");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        try {
            super.sell(seller, buyer, price);

            buyer.phone = this;
            if (seller.phone == this) {
                seller.phone = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void installAnApp(String[] names) throws Exception {
        System.out.println("instalowanie aplikacji na podstawie tablicy nazw");
        if (names.length == 0) {
            throw new Exception("nie podano żadnych plikacji");
        }
        for (String name : names) {
            this.installAnApp(name);
        }
    }

    public void installAnApp(String name) throws Exception {
        System.out.println("instalowanie aplikacji na podstawie nazwy");
        if (name.equals("")) {
            throw new Exception("aplikacja musi mieć nazwę");
        }
        this.installAnApp(name, "latest");
    }

    public void installAnApp(String name, String version) throws MalformedURLException {
        System.out.println("instalowanie aplikacji na podstawie nazwy i wersji");
        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT_NUMBER, name + "-" + version);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("instalowanie aplikacji na podstawie url");
        //walidacje
        //sprawdzenie płatności
        //połączenie z serwerem
        //sprawdzenie miejsca na dysku
        //pobranie pliku
        //walidacja pliku
        //unzip
        //instalacja
        //komunikacja błędów do użytkownika
        //dodanie ikony
        System.out.println("poprawnie zainstalowano " + url.getFile() + " z serwera " + url.getHost());
    }


}
