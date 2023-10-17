package pro.sky.collections.listssets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeesAlredyAddedException extends RuntimeException{
    public EmployeesAlredyAddedException() {
    }

    public EmployeesAlredyAddedException(String message) {
        super(message);
    }

    public EmployeesAlredyAddedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeesAlredyAddedException(Throwable cause) {
        super(cause);
    }

    public EmployeesAlredyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
