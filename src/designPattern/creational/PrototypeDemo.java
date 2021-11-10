package designPattern.creational;

public class PrototypeDemo {
    public static void main(String[] args) {
        EmployeeRecord e1=new EmployeeRecord(1,"Echo","Intern",20000,"Dhaka");
        Prototype e2= e1.getClone();
    }
}

interface Prototype {
    public Prototype getClone();
}

class EmployeeRecord implements Prototype{
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id,name,designation,salary,address);
    }
}
