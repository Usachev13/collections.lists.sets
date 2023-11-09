package pro.sky.collections.listssets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeInvalidInputException extends RuntimeException{

    public EmployeeInvalidInputException(String message) {
        super(message);
    }

}
