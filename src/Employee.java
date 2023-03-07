public class Employee {
    private String employeeFullName;
    private int employeeDepartment;
    private int employeeSalary;
    public static int counter;
    private int employeeId = ++counter;

    public Employee(String employeeFullName, int employeeDepartment, int employeeSalary) {
        this.employeeFullName = employeeFullName;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "ФИО - " + employeeFullName +
                ", отдел - " + employeeDepartment +
                ", зарплата = " + employeeSalary +
                ", id - " + employeeId;
    }

    public static void getEmployeeList(Employee [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static int getSumSalary(Employee [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i].getEmployeeSalary();
        } return sum;
    }

    public static void getMinSalary (Employee [] arr) {
        int minSalary = arr[0].getEmployeeSalary();
        String person = arr[0].toString();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEmployeeSalary()<minSalary) {
                minSalary = arr[i].getEmployeeSalary();
                person = arr[i].toString();

            }
    } System.out.println("Сотрудник с минимальной зарплатой: " + person);
    }

    public static void getMaxSalary (Employee [] arr) {
        int maxSalary = arr[0].getEmployeeSalary();
        String person = arr[0].toString();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEmployeeSalary() > maxSalary) {
                maxSalary = arr[i].getEmployeeSalary();
                person = arr[i].toString();
            }
        } System.out.println("Сотрудник с максимальной зарплатой: " + person);
    }

    public static void getFullnameList(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getEmployeeFullName());
        }
    }
}
