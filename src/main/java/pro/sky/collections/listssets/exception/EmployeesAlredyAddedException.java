package pro.sky.collections.listssets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeesAlredyAddedException extends RuntimeException{

    public EmployeesAlredyAddedException(String message) {
        super(message);
    }

}
