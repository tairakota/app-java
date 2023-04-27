package oop;

public class Main {
    public static void main(String[] args) {
        var smartPhone = new SmartPhone("XPERIA", "Android");
        var account = new Account("Kota",
                "11133335678",
                "test@gmail.com",
                "797-0655");
        var addressBooks = new AddressBook("Kota",
                "11133335678",
                "test@gmail.com");
        var addressBooks2 = new AddressBook("retro",
                "11122223333",
                "r59133@gmail.com");

        //アカウント情報をセットして表示
        smartPhone.setAccount(account);
        smartPhone.displayMyAccount();

        //デバイス情報を表示
        smartPhone.displayDeviceInfo();

        //アドレス情報を登録できたのかを判定
        smartPhone.addAddressBook(addressBooks);
        smartPhone.addAddressBook(addressBooks2);


    }
}
