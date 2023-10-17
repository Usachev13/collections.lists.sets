package pro.sky.collections.listssets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeesNotFoundException extends RuntimeException{
    public EmployeesNotFoundException() {
    }

    public EmployeesNotFoundException(String message) {
        super(message);
    }

    public EmployeesNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeesNotFoundException(Throwable cause) {
        super(cause);
    }

    public EmployeesNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
