package ua.nure.kp;

public class EmployeePersistenceException extends RuntimeException {

    public EmployeePersistenceException() {
        super();
    }

    public EmployeePersistenceException(String errorMessage) {
        super(errorMessage);
    }

}
