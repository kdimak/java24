package ua.nure.kp;

import java.io.IOException;
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

//    public void saveToFile(String filePath) throws EmployeePersistenceException {
    public void saveToFile(String filePath) throws IOException {
//        try {
//            Files.writeString(Path.of(filePath), toString());
//        } catch (Exception e) {
//            //TODO use logger when its configuration is done
////            log.error("Failed to save an employee to {} due to exception: {}", filePath, e.getMessage(), e);
//            System.err.printf(
//                "Failed to save an employee to %s\n",
//                filePath
//            );
////            e.printStackTrace();
//
//            throw new EmployeePersistenceException("Failed to save an employee to " + filePath);
//        }

        try {
            Files.writeString(Path.of(filePath), toString());
        } catch (IOException e) {
            log.error("rwrewr");
            throw e;
        }

        log.info("Saved employee to file");
    }

    @Override
    public String toString() {
        return "Employee " + name;
    }
}
