package Lesson03;

import Lesson03.staff.Workers;
import Lesson03.staff.Boss;


public class Main {

    public static void main(String[] args) {
               
        Operations();
    }
        
    private static void Operations() {
        Workers employee1 = new Workers();
        int result = employee1.compareDates(2024, 10, 25, 2022, 05, 19);
        System.out.println("Cравнение дат: " + result + "\n");

        // Создаём работников 
        Workers emp1 = new Workers("Shuhrat worker", 750000);
        Workers emp2 = new Workers("Dima worker", 402000);
        Workers emp3 = new Workers("Aziz", 700000);
        Boss director = new Boss("Daniyar Azizov direktor", 1000000);
        Boss zamdirector = new Boss("Aleksandr Fedorov zamdirektor", 950000);

        // Объединяем их в одном массиве сотрудников
        Workers[] employees = {emp1, emp2, emp3, director,zamdirector};

        System.out.println("До осушествления повышения:");
        for (Workers worker : employees) {
            System.out.println(worker);
        }

        // Повышаем зарплату всем сотрудникам на 12%, кроме директора и замдиректора
        Boss.raiseWorkerSalary(employees, 12);

        System.out.println("\nПосле осуществления повышения зарплаты:");
        for (Workers worker: employees) {
            System.out.println(worker);
        }
    }
}