package InterviewQue.Comparator;

import java.util.*;

public class StudentApp {
    public static void main(String[] args) {

        List<Student> s1 = new ArrayList<>();
        s1.add(new Student(1, "Jameson",22,"Java Full Stack"));
        s1.add(new Student(2, "John", 24, "Python"));
        s1.add(new Student(3,"Jimmy",20,"Javascript"));
        s1.add(new Student(4,"Jameson",34,"QA"));
        s1.add(new Student(5,"Selena",25,"Java Full Stack"));
        s1.add(new Student(6,"Serena",25,"Python"));

        Collections.sort(s1, new StudentComp());

        Iterator<Student> studentIterator = s1.iterator();

        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }


    }

    static class StudentComp implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            int nameComp = s1.getName().compareTo(s2.getName());
            int ageComp = s1.getAge().compareTo(s2.getAge());

            return (nameComp==0)? ageComp:nameComp;
        }

    }
}

