import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        staff[1] = new Employee("Сергеев Сергей Сергеевич", 3, 45000);
        staff[2] = new Employee("Александров Александр Александрович", 2, 47000);
        staff[3] = new Employee("Михайлов Михаил Михайлович", 5, 37000);
        staff[4] = new Employee("Владимиров Владимир Владимировичвич", 4, 96000);
        staff[5] = new Employee("Анатольев Анатолий Анатльевич", 3, 46000);
        staff[6] = new Employee("Юрьев Юрий Юрьевич", 2, 158000);
        staff[7] = new Employee("Алексеев Алексей Алексеевич", 1, 22000);
        staff[8] = new Employee("Павлов Павел Павлович", 3, 105000);
        staff[9] = new Employee("Дмитриев Дмитрий Дмитриевич", 5, 33000);

        // Получить список сотрудников
        Employee.getEmployeeList(staff);
        System.out.println();

        // Сумма затрат на зарплаты в месяц
        System.out.println(Employee.getSumSalary(staff));
        System.out.println();

        // Сотрудник с минимальной зарплатой
        Employee.getMinSalary(staff);
        System.out.println();

        // Сотрудник с максимальной зарплатой
        Employee.getMaxSalary(staff);
        System.out.println();

        // Среднее значение зарплат
        System.out.println(Employee.getSumSalary(staff)/ staff.length);
        System.out.println();

        // ФИО всех сотрудников
        Employee.getFullnameList(staff);
    }
}