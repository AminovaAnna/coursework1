public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {


        PersonName fullName1 = new PersonName("Аминова", "Анна", "Игоревна");
        PersonName fullName2 = new PersonName("Игнатьев", "Федор", "Николаевич");
        PersonName fullName3 = new PersonName("Слабенко", "Юлия", "Владимировна");
        PersonName fullName4 = new PersonName("Сыщиков", "Алексей", "Владимирович");
        PersonName fullName5 = new PersonName("Усанова", "Яна", "Александровна");
        PersonName fullName6 = new PersonName("Кочетков", "Анатолий", "Демьянович");
        PersonName fullName7 = new PersonName("Седых", "Виктор", "Михайлович");
        PersonName fullName8 = new PersonName("Кудрявцев", "Артур", "Арнольдович");
        PersonName fullName9 = new PersonName("Иванова", "Виктория", "Павловна");
        PersonName fullName10 = new PersonName("Чернышова", "Евгения", "Владимировна");

        employees[0] = new Employee(fullName1, 1, 70000);
        employees[1] = new Employee(fullName2, 2, 50000);
        employees[2] = new Employee(fullName3, 5, 47000);
        employees[3] = new Employee(fullName4, 4, 100000);
        employees[4] = new Employee(fullName5, 3, 20000);
        employees[5] = new Employee(fullName6, 2, 46000);
        employees[6] = new Employee(fullName7, 4, 80011);
        employees[7] = new Employee(fullName8, 1, 40000);
        employees[8] = new Employee(fullName9, 5, 30000);
        employees[9] = new Employee(fullName10, 3, 65000);

        printEmployees();
        System.out.println(calculatedAllSalary());
        System.out.println(maxSalary());
        System.out.println(minSalary());
        System.out.println(calculatedMiddleSalary());
        printFullName();

    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculatedAllSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    private static int minSalary() {
        int min = 0;
        for (Employee employee : employees) {
            min = employees[0].getSalary();
            break;
        }
        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
            }
        }
        return min;
    }

    private static int maxSalary() {
        int max = 0;
        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    private static double calculatedMiddleSalary() {
        double middle = (double) calculatedAllSalary() / employees.length;
        return middle;
    }

    private static void printFullName(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }

    }
}

