package ua.nure.kp;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("negative salary");
        }

        this.salary = salary;
    }


}
