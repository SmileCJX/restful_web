package pers.caijx.restful.handle;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pers.caijx.restful.domain.JSONResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by caijx on 2018/7/17/017.
 */
@RestControllerAdvice
public class AjaxExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public JSONResult defaultErrorHandler(HttpServletRequest req,Exception e) {
        e.printStackTrace();
        return JSONResult.errorException(e.getMessage());
    }

}
