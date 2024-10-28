package Lesson04.prog;

import java.time.LocalDate;


public class Holiday {
    public enum Celebration {
        NEW_YEAR,      // Новый год
        MARCH_8,       // 8 марта
        FEBRUARY_23,    // 23 февраля
        NO_HOLIDAY,    // Нет праздника
    }

    public static void greetingEmployees(Employee[] employees) {
        LocalDate today = LocalDate.now(); 
        Celebration holiday = isHoliday(today); 

        if (holiday == Celebration.NO_HOLIDAY) {
            System.out.println("Никому не отвлекаться, всем работать!");
            return; 
        }
        
        for (Employee employee : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("С Новым годом, С Новым счастьем" + employee.getName() + "!");
                    break;
                case MARCH_8:
                    if (employee.getGender() == Customer.Gender.FEMALE) {
                        System.out.println("С международным днём женщин. С 8 марта, " + employee.getName() + "!");
                    }
                    break;
                case FEBRUARY_23:
                    if (employee.getGender() == Customer.Gender.MALE) {
                        System.out.println("С праздником защитника Отечества, дорогой, " + employee.getName() + "!");
                    }
                    break;
                case NO_HOLIDAY:
                    break;
                default:
                    break;
            }
        }
    }

   
    private static Celebration isHoliday(LocalDate date) {
        if (date.getMonthValue() == 1 && date.getDayOfMonth() == 1) {
            return Celebration.NEW_YEAR;
        } else if (date.getMonthValue() == 3 && date.getDayOfMonth() == 8) {
            return Celebration.MARCH_8;
        } else if (date.getMonthValue() == 2 && date.getDayOfMonth() == 23) {
            return Celebration.FEBRUARY_23;
        } else {
            return Celebration.NO_HOLIDAY;
        }
    }
}