package pers.caijx.restful.handle;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;
import pers.caijx.restful.domain.JSONResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by caijx on 2018/7/17/017.
 */
@RestControllerAdvice
public class AjaxExceptionHandler {

    public static final String ERROR_VIEW = "thymeleaf/error";

//    @ExceptionHandler(value = Exception.class)
//    public JSONResult defaultErrorHandler(HttpServletRequest req,Exception e) {
//        e.printStackTrace();
//        return JSONResult.errorException(e.getMessage());
//    }

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,
                               HttpServletResponse response,Exception e) {
        e.printStackTrace();
        if (isAjax(request)) {
            return JSONResult.errorException(e.getMessage());
        } else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("exception",e);
            modelAndView.addObject("url",request.getRequestURL());
            modelAndView.setViewName(ERROR_VIEW);
            return modelAndView;
        }
    }

    public static boolean isAjax(HttpServletRequest httpRequest) {
        return (httpRequest.getHeader("X-Requested-With") != null
                && "XMLHttpRequest"
                .equals(httpRequest.getHeader("X-Requested-With").toString()));
    }

}
