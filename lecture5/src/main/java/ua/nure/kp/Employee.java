package ua.nure.kp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
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

    public void saveToFile(String filePath) {
        try {
            Files.writeString(Path.of(filePath), toString());
        } catch (Exception e) {
            log.info("Failed to save an employee to {}", filePath);
        }

        log.info("Saved employee to file");
    }

    @Override
    public String toString() {
        return "Employee " + name;
    }
}
