package oop;

public class SmartPhone {
    String model;
    String os;
    Account account;
    AddressBook[] addressBooks;
    String[] apps;

    public SmartPhone(String model, String os) {

    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void displayDeviceInfo() {
        System.out.println(model);
        System.out.println(os);
    }

    public void displayMyAccount() {
        System.out.println(account);
    }

    public boolean addAddressBook(AddressBook addressBooks) {
        return true;
    }

    public void displayAooList() {
        for (var i = 0; i >= 0; i++) {
            System.out.println(apps);
        }
    }
}
