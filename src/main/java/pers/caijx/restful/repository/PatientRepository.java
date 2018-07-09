package pers.caijx.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.caijx.restful.dto.PatientDto;

import java.util.List;

/**
 * Created by caijx on 2018/7/2/002.
 */
public interface PatientRepository extends JpaRepository<PatientDto,Integer> {

    //通过年龄来查询
    public List<PatientDto> findByName(String name);
}
