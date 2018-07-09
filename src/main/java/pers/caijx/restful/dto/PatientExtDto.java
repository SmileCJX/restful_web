package pers.caijx.restful.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by caijx on 2018/7/2/002.
 */
@Entity
@Table(name =  "T_PATIENT_EXT")
public class PatientExtDto {

    @Id
    @GeneratedValue
    private Integer id;

    private String memberName;

    private String memberSex;

    private String delFlg;

    private String memberPhone;

    private String patientId;

    public PatientExtDto() {
    }

    public PatientExtDto(Integer id, String memberName, String memberSex, String delFlg, String memberPhone, String patientId) {
        this.id = id;
        this.memberName = memberName;
        this.memberSex = memberSex;
        this.delFlg = delFlg;
        this.memberPhone = memberPhone;
        this.patientId = patientId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "PatientExtDto{" +
                "id=" + id +
                ", memberName='" + memberName + '\'' +
                ", memberSex='" + memberSex + '\'' +
                ", delFlg='" + delFlg + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                ", patientId='" + patientId + '\'' +
                '}';
    }
}
