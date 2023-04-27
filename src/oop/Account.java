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
        return "名前：" + name + ", TEL：" + tel + ", メールアドレス：" + email + ", 住所：" + address;
    }
}
