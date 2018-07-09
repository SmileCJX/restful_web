package pers.caijx.restful.dto;

import javax.persistence.*;
import java.sql.Clob;

/**
 * Created by caijx on 2018/7/2/002.
 */
@Entity
@Table(name =  "T_PATIENT_LOG")
public class PatientLogDto {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ", sequenceName = "SEQ_PATIENT_LOG_ID", allocationSize=1)
    private Integer id;

    private Integer patientId;

    private Clob xmlContent;

    private String createDatetime;

    private String modifyDatetime;

    private String createName;

    private String modifyName;

    private String updateVersion;

    public PatientLogDto() {
    }

    public PatientLogDto(Integer id, Integer patientId, Clob xmlContent, String createDatetime, String modifyDatetime,
                         String createName, String modifyName, String updateVersion) {
        this.id = id;
        this.patientId = patientId;
        this.xmlContent = xmlContent;
        this.createDatetime = createDatetime;
        this.modifyDatetime = modifyDatetime;
        this.createName = createName;
        this.modifyName = modifyName;
        this.updateVersion = updateVersion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Clob getXmlContent() {
        return xmlContent;
    }

    public void setXmlContent(Clob xmlContent) {
        this.xmlContent = xmlContent;
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(String modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }

    public String getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion;
    }

    @Override
    public String toString() {
        return "PatientLogDto{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", xmlContent=" + xmlContent +
                ", createDatetime='" + createDatetime + '\'' +
                ", modifyDatetime='" + modifyDatetime + '\'' +
                ", createName='" + createName + '\'' +
                ", modifyName='" + modifyName + '\'' +
                ", updateVersion='" + updateVersion + '\'' +
                '}';
    }
}
