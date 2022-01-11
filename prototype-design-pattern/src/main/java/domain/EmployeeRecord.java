package main.java.domain;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name;
    private double salary;
    private String address;

    public EmployeeRecord(int id, String name, double salary, String address) {
        this();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public EmployeeRecord() {

    }

    public void getEmployee() {
        System.out.println("EmployeeRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}');
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, salary, address);
    }
}
