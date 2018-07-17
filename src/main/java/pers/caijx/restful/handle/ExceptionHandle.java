package pers.caijx.restful.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.caijx.restful.domain.Result;
import pers.caijx.restful.enums.ResultEnum;
import pers.caijx.restful.execption.PatientException;
import pers.caijx.restful.utils.ResultUtil;

/**
 * Created by caijx on 2018/7/3/003.
 */
//@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof PatientException) {
            PatientException patientException = (PatientException)e;
            return ResultUtil.error(patientException.getCode(),patientException.getMessage());
        } else {
            LOGGER.error(" 【系统异常】{}",e);
            return ResultUtil.error(ResultEnum.UNKNOW_ERROR.getCode(), ResultEnum.UNKNOW_ERROR.getMsg());
        }
    }
}
