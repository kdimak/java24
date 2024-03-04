package ua.nure.kp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class EmployeeImmutable {
    private String name;
    private double salary;
    private List<LocalDate> dayOffs;

    public EmployeeImmutable(String name, double salary, List<LocalDate> dayOffs) {
        this.name = name;
        this.salary = salary;
        this.dayOffs = new ArrayList<>(dayOffs);
    }

    public List<LocalDate> getDayOffs() {
        return new ArrayList<>(dayOffs);
    }

}
