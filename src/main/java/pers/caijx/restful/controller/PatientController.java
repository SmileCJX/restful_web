package pers.caijx.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import pers.caijx.restful.domain.Result;
import pers.caijx.restful.dto.PatientDto;
import pers.caijx.restful.dto.PatientLogDto;
import pers.caijx.restful.repository.PatientLogRepository;
import pers.caijx.restful.repository.PatientRepository;
import pers.caijx.restful.service.PatientService;
import pers.caijx.restful.utils.ResultUtil;

import java.util.List;

/**
 * Created by caijx on 2018/7/2/002.
 */
@RestController
public class PatientController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientLogRepository patientLogRepository;

    @Autowired
    private PatientService patientService;

    //获取所有病人的记录
    @GetMapping("/patients")
    public List<PatientDto> getPatients() throws Exception {
//        throw new PatientException(ResultEnum.PATIENT_ERROR);
        return patientRepository.findAll();
    }

    //通过id查询一个病人
    @GetMapping(value = "/patient/{id}")
    public PatientDto patientFindOne(@PathVariable("id") Integer id) {
        return patientRepository.findOne(id);
    }

    // 添加一个病人
    @PostMapping(value = "/patient")
    public PatientDto patientAdd(PatientDto patientDto) {
//        PatientDto patientDto = new PatientDto();
//        patientDto.setLognm(lognm);
//        patientDto.setSex(sex);
        return patientRepository.save(patientDto);
    }

    // 病人更新
    @PutMapping(value = "/patient/{id}")
    public PatientDto patientUpdate(@PathVariable("id") Integer id,
                                    @RequestParam("lognm") String lognm,
                                    @RequestParam("sex") String sex) {
        PatientDto patientDto = new PatientDto();
        patientDto.setId(id);
        patientDto.setLognm(lognm);
        patientDto.setSex(sex);
        return patientRepository.save(patientDto);
    }

    //查询病人历史
    @GetMapping(value = "/patient/{patientId}/_history")
    public List<PatientLogDto> patientHistory(@PathVariable("patientId") Integer patientId) {
        return patientLogRepository.findByPatientId(patientId);
    }

    //删除一条病人记录
    @DeleteMapping(value = "/patient/{id}")
    public void patientDelete(@PathVariable("id") Integer id) {
        patientRepository.delete(id);
    }

    //通过姓名查找病人记录
    @GetMapping(value = "/patient")
    public List<PatientDto> patientFind(@RequestParam("name") String name) {
        return patientRepository.findByName(name);
    }

    //测试事务
    @GetMapping(value = "/patient/two")
    public Result patientTwo() {
        patientService.insertTwo();
        return ResultUtil.success();
    }
}
