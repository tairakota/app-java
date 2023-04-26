package oop2;

public class main {
    public static void main(String[] args) {
        var i = new User("cent", "tokoy", 20040613);
        var j = new User("cent", "tokoy", 20040613);
        System.out.println(i.equals(j));
        System.out.println(i.toString());
    }
}
