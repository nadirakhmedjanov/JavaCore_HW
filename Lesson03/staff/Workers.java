package Lesson03.staff;

public class Workers {
    private String name;
    private double salary;

    public Workers(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Workers() {
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;
        return Integer.compare(date1, date2);
    }
}