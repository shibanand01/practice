import java.util.ArrayList;

class School {
    String s = "happy School";
}
class Student extends School{
    String s = "happy Student";
}
class Demo2 {
    //UpperBound -> Same calss or the child of the class
    public static void main(String[] args) {
        School s1 = new School();
        Student s2 = new Student();

        s1 = s2;

        ArrayList <? extends School> l1 = new ArrayList<>();
        ArrayList <Student> l2 = new ArrayList<>();

        l1=l2;
    }
}
class Demo3{
    //Lowerbound -> Same class or the parent of the class
    public static void main(String[] args) {
        ArrayList<? super School> sc = new ArrayList<>();

        ArrayList<School> sc1 = new ArrayList<>();
        ArrayList<Student> sc2 = new ArrayList<>();
        ArrayList<Object> sc3 = new ArrayList<>();

        // sc = sc2;
        sc = sc1;
        sc = sc3;
    }
}