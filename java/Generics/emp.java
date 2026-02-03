import java.util.ArrayList;

class Student {
    String name;
    int id;
    public Student(int id, String name){
        this.name = name;
        this.id = id;
    }
}
class Employee{
    String name ;
    int id;

    public Employee(int id, String name)
    {
        this.name = name;
        this.id= id;
    }
}
class School{
    public static void main(String[] args) {
        Student std1 = new Student(1, "Dev");
        Student std2 = new Student(2, "Danish");
        Student std3 = new Student(3, "Subham");

        Employee emp1 = new Employee(143, "Aradhana");
        Employee emp2 = new Employee(772, "Deepa");

        ArrayList <Student>ar = new ArrayList<>();

        ArrayList <Employee> ar2 = new ArrayList<>();

        ar.add(std1);
        ar.add(std2);
        ar.add(std3);
        ar2.add(emp1);
        ar2.add(emp2);

        System.out.println(ar.get(0));
    }
}
