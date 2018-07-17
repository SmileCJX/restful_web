package pers.caijx.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.caijx.restful.domain.JSONResult;
import pers.caijx.restful.domain.Result;
import pers.caijx.restful.enums.ResultEnum;
import pers.caijx.restful.execption.PatientException;

/**
 * Created by caijx on 2018/7/17/017.
 */
@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error() {
//        throw new PatientException(ResultEnum.PATIENT_ERROR);
//        int a =  1 / 0;
        return "thymeleaf/error";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxerror() {
        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    @ResponseBody
    public JSONResult getAjaxError() {
        int a = 1 / 0;
        return JSONResult.ok();
    }
}
