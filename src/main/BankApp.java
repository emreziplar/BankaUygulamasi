package main;

import gui.GirisEkrani;
import database.DatabaseActions;

public class BankApp {

    public static void main(String[] args) {
        DatabaseActions databaseActions = new DatabaseActions();
        databaseActions.createTable();
        GirisEkrani girisEkrani = new GirisEkrani();
    }
}
