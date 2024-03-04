package ua.nure.kp;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;

class EmployeeImmutableTest {

    @Test
    public void checkEmployeeDayOffsImmutability() {
        EmployeeImmutable john = new EmployeeImmutable("John", 200., List.of(
            LocalDate.of(2024, 5, 12),
            LocalDate.of(2024, 5, 13),
            LocalDate.of(2024, 5, 14)
        ));

        assertThat(john.getName()).isEqualTo("John");
        assertThat(john.getDayOffs()).hasSize(3);

        john.getDayOffs().add(LocalDate.of(2024, 6, 1));
        assertThat(john.getDayOffs()).hasSize(3);
    }

}
