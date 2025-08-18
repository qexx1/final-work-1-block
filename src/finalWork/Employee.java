package finalWork;

public class Employee {
    private final String fullname;
    private int salary;
    private int id;
    private int department;
    private static int counter = -1;

    public Employee(String name, int salary, int department) {
        this.fullname = name;
        this.salary = salary;
        this.department = department;
        this.id = ++counter;
    }

    public String getFullname() { return fullname;}
    public int getSalary() { return salary;}
    public int getDepartment() { return department; }
    public int getCounter() {return counter;}
    public int getId() {return id;}
    public void setSalary(int salary) { this.salary = salary; }
    public void setDepartment(int department) { this.department = department; }

    @Override
    public String toString() {
        return "id = " + id + "; " + fullname + "; Зарплата = " + salary + "; Отдел = " + department + ";";
    }
}
