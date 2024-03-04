package ua.nure.kp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

}
