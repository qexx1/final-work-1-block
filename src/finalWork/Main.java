package finalWork;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employee = new Employee("Смирнов Георгий Александрович", 45000,1);
        employees = new Employee[] {
                new Employee("Абрамов Арсен Араратович", 45000, 2),
                new Employee("Бромов Борис Борисович", 47000, 3),
                new Employee("Въюгов Венсент Владимирович", 55000, 5),
                new Employee("Громов Георгий Георгич", 40000,1),
                new Employee("Дроздов Дмитрий Дмитриевич", 44000, 1),
                new Employee("Евсеев Евгений Евгеньевич", 41000, 4),
                new Employee("Жоржинье Жерар", 38000,2),
                new Employee("Золотарёва Злата Захаровна", 75000, 5),
                new Employee("Игнатов Игнат Игнатович", 50000,4),
                new Employee("Карасёв Карат Каратович", 25000,3)
        };
        printEmployees();
        System.out.println("Полная сумма затрат на зарплату = " + calculateAllSum());
        findMaxSalary();
        findMinSalary();
        findAvgSalary();
    }

    public static int calculateAllSum() {
        int sum = 0;
        for ( Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static Employee findMaxSalary() {
        Employee arr1 = employees[0];
        int max = arr1.getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                arr1 = employee;
            }
        }
        System.out.println("Максимальная зарплата = " + max);
        return arr1;
    }

    public static Employee findMinSalary() {
        Employee arr2 = employees[0];
        int min = arr2.getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                arr2 = employee;
            }
        }
        System.out.println("Минимальная зарплата = " + min);
        return arr2;
    }

    public static int findAvgSalary() {
        int i = 0;
        for (Employee employee : employees) {
            i = calculateAllSum() / employee.getCounter();
        }
        System.out.println("Средняя зарплата = " + i);
        return i;
    }
}