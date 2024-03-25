package ua.nure.kp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    public void doesNotAllowToSetNegativeSalary() {
        Employee employee = new Employee();
        employee.setSalary(10);

        assertThatThrownBy(() -> employee.setSalary(-10))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("negative salary");

        assertThat(employee.getSalary()).isEqualTo(10);
    }

    @Test
    public void savesToFile() throws IOException {
        Employee employee = new Employee();
        employee.setName("Mary");

        employee.saveToFile("employee.txt");

        assertThat(Path.of("employee.txt")).exists();
    }

    @Test
    public void throwsExceptionIfFailsToSaveToFile() {
        Employee employee = new Employee();
        employee.setName("Mary");

        assertThatThrownBy(() -> employee.saveToFile("/as132/employee.txt"))
            .isInstanceOf(IOException.class);
    }

}
