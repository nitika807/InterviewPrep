package Streams.example;

public class employees {
    String fName;
    String lName;
    String email;
    int salary;
    int age;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public employees(String fName, String lName, String email, int salary, int age) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "employees{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
