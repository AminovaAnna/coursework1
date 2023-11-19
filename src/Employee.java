public class Employee {
    private static int idCounter = 1;
    private final int id;
    private final PersonName fullName;
    private int department;
    private int salary;

    public Employee(PersonName fullName, int department, int salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public PersonName getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName=" + fullName +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
