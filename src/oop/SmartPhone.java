package oop;

public class SmartPhone {
    String model;
    String os;
    Account account;
    AddressBook[] addressBooks = new AddressBook[1];
    String[] apps;

    public SmartPhone(String model, String os) {
        this.model = model;
        this.os = os;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void displayDeviceInfo() {
        System.out.println(model);
        System.out.println(os);
    }

    public void displayMyAccount() {
        System.out.println(account.getAccountInfo());
    }

    public boolean addAddressBook(AddressBook addressBooks) {
        if (this.addressBooks[0] == null) {
            this.addressBooks[0] = addressBooks;
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public void displayAppList() {
        for (var i = 0; i < apps.length; i++) {
            System.out.println(apps[i]);
        }
    }
}
