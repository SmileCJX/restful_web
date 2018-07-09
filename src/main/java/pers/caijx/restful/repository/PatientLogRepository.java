package pers.caijx.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.caijx.restful.dto.PatientLogDto;

import java.util.List;

/**
 * Created by caijx on 2018/7/3/003.
 */
public interface PatientLogRepository extends JpaRepository<PatientLogDto,Integer> {

    //通过病人ID来查询
    public List<PatientLogDto> findByPatientId(Integer patientId);
}
