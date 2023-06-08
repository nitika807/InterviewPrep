package InterviewQue.Comparator;

public class Student {
    private String name;
    private int rollNo;
    private int age;
    private String subject;

    public Student( int rollNo, String name, int age, String className) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.subject = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
