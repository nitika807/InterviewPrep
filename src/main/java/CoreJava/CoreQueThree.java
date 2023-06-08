package CoreJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CoreQueThree {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23,"India"));
        list.add(new Person("Joe", 18,"USA"));
        list.add(new Person("Ryan", 54,"Canada"));
        list.add(new Person("Iyan", 95,"India"));
        list.add(new Person("Ray", 63,"China"));

        List<Person> collect = list.stream().filter(i -> i.country.contains("India")).collect(Collectors.toList());
        System.out.println(collect);// person belonging to particular country.
        list.stream().
                filter(i -> i.country.contains("India")).
                findFirst().ifPresent(System.out::println);//first person in particular country
        List<Person> collect1 = list.stream().
                max(Comparator.comparing(Person::getAge)).
                stream().
                collect(Collectors.toList());
        System.out.println(collect1);//person with max age

        list.stream().map(i->i.name.toUpperCase()).forEach(i-> System.out.println(i+ " - "+i.length()));

    }
}
class Person {
    String name;
    int age;
    String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }



    @Override
    public String toString() {
        return "{ "+ name+","+age+","+country + " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

