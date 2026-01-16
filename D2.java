class Employee{
    String name;
    int base_salary;
    Employee(String name ,int base_salary){
        this.name = name;
        this.base_salary = base_salary;
    }
    public String getSalary(){
        return name +" - "+base_salary;
    }
}
class Manager extends Employee{
    int bonus;
    Manager(String name ,int base_salary, int bonus){
        super(name,base_salary);
        this.bonus = bonus;
    }
    public String getSalary(){
        return name +" - "+(base_salary+bonus);
    }
}
class Info{
    public static void main(String [] args)
    {
        Employee e1 = new Employee("Sahil", 35000);
        Employee e2 = new Manager("Navin", 55000, 5000);

        System.out.println(e1.getSalary());;
        System.out.println(e2.getSalary());;
    }
}