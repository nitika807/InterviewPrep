package Streams.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<employees> emp = new ArrayList();
        emp.add(new employees("John","Smith","sjohn@gmail.com", 30500,34));
        emp.add(new employees("Rachel", "Green","rgreen@gmail.com", 20600,40));
        emp.add( new employees("Ross", "Geller","rgeller@gmail.com", 22900,32));
        Optional<employees> max = emp.stream().max(Comparator.comparing(employees::getSalary).thenComparing(employees::getAge));
        //        List<employees> collect = emp.stream().sorted(Comparator.comparing(employees::getSalary).reversed()).skip(1).findFirst().stream().collect(Collectors.toList());
        System.out.println(max);
    }
}