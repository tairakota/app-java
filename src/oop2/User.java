package oop2;

import java.util.Objects;

public class User {
    String name;
    String from;
    int birth;

    public User(String name, String from, int birth) {
        this.name = name;
        this.from = from;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object obj){
        User i = (User)obj;
        if (this.name == i.name && this.from == i.from && this.birth == i.birth) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "名前：" + name + ",　出身地：" + from + ",　生年月日：" + birth;
    }
}
