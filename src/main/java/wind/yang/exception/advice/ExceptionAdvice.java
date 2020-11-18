package wind.yang.exception.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import wind.yang.exception.ExceptionResult;
import wind.yang.exception.NoSearchResultException;

@Slf4j
@RestControllerAdvice(basePackages = "wind.yang.ctr")
public class ExceptionAdvice {
    @ExceptionHandler(NoSearchResultException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    protected ExceptionResult NoSearchResultExceptionHandler(NoSearchResultException ex){
        log.error(ex.getMessage());
        return new ExceptionResult(ex.getMessage());
    }
}
