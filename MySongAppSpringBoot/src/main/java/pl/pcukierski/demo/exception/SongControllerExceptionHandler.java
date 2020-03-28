package pl.pcukierski.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.pcukierski.demo.exception.ExceptionResponse;
import pl.pcukierski.demo.exception.IdException;

@ControllerAdvice
@RestController
public class SongControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IdException.class)
    public ResponseEntity<ExceptionResponse> handleIdException(Exception exception, WebRequest webRequest){
        ExceptionResponse exceptionResponse = new ExceptionResponse(exception.getMessage(), exception.getStackTrace()[0].toString());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
