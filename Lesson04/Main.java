package Lesson04;


import Lesson04.prog.Customer;
import Lesson04.prog.Employee;
import Lesson04.prog.Holiday;


public class Main {

      public static void main(String[] args) {
       Homework4();
    }

    
    private static void Homework4() {
        Employee[] employees = {
            new Employee("Шухрат", Customer.Gender.MALE),
            new Employee("Азиза", Customer.Gender.FEMALE),
            new Employee("Данияп", Customer.Gender.MALE)
        };

        // Поздравление сотрудников с праздниками
        Holiday.greetingEmployees(employees);
    }
}