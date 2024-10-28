package Lesson04.prog;

import Lesson04.prog.Customer.Gender;

public class Employee {
    private String name; 
    private Customer.Gender gender; 

    
    public Employee(String name, Customer.Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}