package pers.caijx.restful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.caijx.restful.dto.PatientDto;
import pers.caijx.restful.repository.PatientRepository;

/**
 * Created by caijx on 2018/7/3/003.
 */
@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public void insertTwo(){
        PatientDto a = new PatientDto();
        a.setSex("1");
        a.setName("james");
        patientRepository.save(a);

        PatientDto b = new PatientDto();
        b.setSex("1");
        b.setName("hollow");
        patientRepository.save(b);
    }
}
