package record;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("佐藤", "sato", 34),
                new Person("鈴木", "suzuki", 49),
                new Person("高橋", "takahasi", 63),
                new Person("田中", "tanaka", 14),
                new Person("渡辺", "watanabe", 23)
        };

        var indexMax = 0;
        var indexMin = 0;
        var numMax = 0;
        var numMin = 200;
        for (var i = 0; i < persons.length; i++) {
            if (persons[i].age() > numMax) {
                numMax = persons[i].age();
                indexMax = i;
            }
            if (persons[i].age() < numMin) {
                numMin = persons[i].age();
                indexMin = i;
            }
        }
        System.out.println("最年長：　" + persons[indexMax].name());
        System.out.println("最年少：　" + persons[indexMin].name());

        System.out.println("-----------------------------------------");

        for (var i = 0; i < persons.length; i++) {
            for (var j = persons.length - 1; j != i; j--) {
                if (persons[j].age() < persons[j - 1].age()) {
                    Person temp = persons[j - 1];
                    persons[j - 1] = persons[j];
                    persons[j] = temp;
                } else {
                }
            }
            System.out.println(persons[i]);
        }
    }
}
