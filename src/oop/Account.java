package oop;

public class Account {
    String name;
    String tel;
    String email;
    String address;

    public Account(String name, String tel, String email, String address) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo() {
        name = "名前：" + name;
        tel = "TEL：" + tel;
        email = "メール" + email;
        address = "アドレス" + address;
        var info = name;
        info += tel;
        info += email;
        info += address;

        return info;
    }
}
