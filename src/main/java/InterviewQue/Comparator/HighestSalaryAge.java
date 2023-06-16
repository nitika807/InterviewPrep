package InterviewQue.Comparator;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryAge {
    public static void main(String[] args) {
        List<Student> s1 = new ArrayList<>();
        s1.add(new Student(1, "Jameson",22,"Java Full Stack",7000, "HR"));
        s1.add(new Student(2, "John", 24, "Python", 6500,"Development"));
        s1.add(new Student(3,"Jimmy",20,"Javascript",6800, "Development"));
        s1.add(new Student(4,"Jameson",34,"QA",6800,"Management"));
        s1.add(new Student(5,"Selena",25,"Java Full Stack",8000,"HR"));
        s1.add(new Student(6,"Serena",25,"Python",7000,"Development"));

// this finds out the highest salary
        System.out.println("\n");
        System.out.println(s1.stream().max(Comparator.comparingInt((Student::getAge)).thenComparing(Student::getSalary)));

        // this finds out the minimum salary
        System.out.println(s1.stream().min(Comparator.comparingInt((Student::getSalary)).thenComparing(Student::getAge)));


        //this finds out the second highest salary. withour reversed(), the result will be min to max.
        System.out.println("\n");
        System.out.println(s1.stream().sorted(Comparator.comparingInt(Student::getSalary).reversed()).skip(1).findFirst());
//    this will give the whole sorted list of salary from highest to lowest
        System.out.println("\n");

        s1.stream().sorted(Comparator.comparingInt(Student::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);


//
//
//     the below function sorts the list according to the age and name as specified in the method.
//
//        Collections.sort(s1, new compFunc());
//        Iterator<Student> itStu = s1.iterator();
//
//        while(itStu.hasNext()){
//            System.out.println(itStu.next());
//        }
    }

}

class compFunc implements Comparator<Student>{

     @Override
     public int compare(Student s1, Student s2) {
         int nameComp = s1.getName().compareTo(s2.getName());
         int ageComp = s1.getAge().compareTo(s2.getAge());

         return (nameComp==0)?ageComp:nameComp;
     }
 }