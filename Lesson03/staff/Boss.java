package Lesson03.staff;


public class Boss extends Workers {

    public Boss(String name, double salary) {
        super(name, salary);
    }
  
    public static void raiseWorkerSalary (Workers[] employees, double raise) {
        for (Workers worker: employees) {
            if (!(worker instanceof Boss)) {
                double newSalary = worker.getSalary() * (1 + raise / 100);
                newSalary = Math.round(newSalary * 100.0) / 100.0;
                worker.setSalary(newSalary);
            }
        }
    }
}