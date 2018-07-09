package pers.caijx.restful.dto;

import javax.persistence.*;
import java.sql.Clob;

/**
 * Created by caijx on 2018/7/2/002.
 */
@Entity
@Table(name =  "T_PATIENT")
public class PatientDto {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ", sequenceName = "SEQ_PATIENT_ID", allocationSize=1)
    private Integer id;

    private String lognm;

    private String active;

    private String name;

    private String sex;

    private String delFlg;

    private String birthDate;

    private String idCardNumber;

    private String phone;

    private String emailAddress;

    private String introduction;

    private String familyPhone;

    private String nationCode;

    private String maritalStatusCode;

    private String birthPlace;

    private String nationalityCode;

    private String jobClassCode;

    private String jobName;

    private String highestEducation;

    private String graduationSchool;

    private String academicDegree;

    private String politicalStatus;

    private String comments;

    private String spellCode;

    private String wubiCode;

    private String createName;

    private String modifyName;

    private String passwd;

    private String socialSecurityCard;

    private String familyAddress;

    private String familyAddProvice;

    private String familyAddCity;

    private String familyAddCountry;

    private String familyAddTown;

    private String familyAddCode;

    private Clob xmlContent;

    private String createDatetime;

    private String modifyDatetime;

    public PatientDto() {
    }

    public PatientDto(Integer id, String lognm, String active, String name, String sex, String delFlg, String birthDate,
                      String idCardNumber, String phone, String emailAddress, String introduction, String familyPhone,
                      String nationCode, String maritalStatusCode, String birthPlace, String nationalityCode,
                      String jobClassCode, String jobName, String highestEducation, String graduationSchool,
                      String academicDegree, String politicalStatus, String comments, String spellCode,
                      String wubiCode, String createName, String modifyName, String passwd, String socialSecurityCard,
                      String familyAddress, String familyAddProvice, String familyAddCity, String familyAddCountry,
                      String familyAddTown, String familyAddCode, Clob xmlContent, String createDatetime, String modifyDatetime) {
        this.id = id;
        this.lognm = lognm;
        this.active = active;
        this.name = name;
        this.sex = sex;
        this.delFlg = delFlg;
        this.birthDate = birthDate;
        this.idCardNumber = idCardNumber;
        this.phone = phone;
        this.emailAddress = emailAddress;
        this.introduction = introduction;
        this.familyPhone = familyPhone;
        this.nationCode = nationCode;
        this.maritalStatusCode = maritalStatusCode;
        this.birthPlace = birthPlace;
        this.nationalityCode = nationalityCode;
        this.jobClassCode = jobClassCode;
        this.jobName = jobName;
        this.highestEducation = highestEducation;
        this.graduationSchool = graduationSchool;
        this.academicDegree = academicDegree;
        this.politicalStatus = politicalStatus;
        this.comments = comments;
        this.spellCode = spellCode;
        this.wubiCode = wubiCode;
        this.createName = createName;
        this.modifyName = modifyName;
        this.passwd = passwd;
        this.socialSecurityCard = socialSecurityCard;
        this.familyAddress = familyAddress;
        this.familyAddProvice = familyAddProvice;
        this.familyAddCity = familyAddCity;
        this.familyAddCountry = familyAddCountry;
        this.familyAddTown = familyAddTown;
        this.familyAddCode = familyAddCode;
        this.xmlContent = xmlContent;
        this.createDatetime = createDatetime;
        this.modifyDatetime = modifyDatetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLognm() {
        return lognm;
    }

    public void setLognm(String lognm) {
        this.lognm = lognm;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFamilyPhone() {
        return familyPhone;
    }

    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getJobClassCode() {
        return jobClassCode;
    }

    public void setJobClassCode(String jobClassCode) {
        this.jobClassCode = jobClassCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getGraduationSchool() {
        return graduationSchool;
    }

    public void setGraduationSchool(String graduationSchool) {
        this.graduationSchool = graduationSchool;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getWubiCode() {
        return wubiCode;
    }

    public void setWubiCode(String wubiCode) {
        this.wubiCode = wubiCode;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSocialSecurityCard() {
        return socialSecurityCard;
    }

    public void setSocialSecurityCard(String socialSecurityCard) {
        this.socialSecurityCard = socialSecurityCard;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getFamilyAddProvice() {
        return familyAddProvice;
    }

    public void setFamilyAddProvice(String familyAddProvice) {
        this.familyAddProvice = familyAddProvice;
    }

    public String getFamilyAddCity() {
        return familyAddCity;
    }

    public void setFamilyAddCity(String familyAddCity) {
        this.familyAddCity = familyAddCity;
    }

    public String getFamilyAddCountry() {
        return familyAddCountry;
    }

    public void setFamilyAddCountry(String familyAddCountry) {
        this.familyAddCountry = familyAddCountry;
    }

    public String getFamilyAddTown() {
        return familyAddTown;
    }

    public void setFamilyAddTown(String familyAddTown) {
        this.familyAddTown = familyAddTown;
    }

    public String getFamilyAddCode() {
        return familyAddCode;
    }

    public void setFamilyAddCode(String familyAddCode) {
        this.familyAddCode = familyAddCode;
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

    @Override
    public String toString() {
        return "PatientDto{" +
                "modifyDatetime='" + modifyDatetime + '\'' +
                ", id=" + id +
                ", lognm='" + lognm + '\'' +
                ", active='" + active + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", delFlg='" + delFlg + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", idCardNumber='" + idCardNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", introduction='" + introduction + '\'' +
                ", familyPhone='" + familyPhone + '\'' +
                ", nationCode='" + nationCode + '\'' +
                ", maritalStatusCode='" + maritalStatusCode + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", nationalityCode='" + nationalityCode + '\'' +
                ", jobClassCode='" + jobClassCode + '\'' +
                ", jobName='" + jobName + '\'' +
                ", highestEducation='" + highestEducation + '\'' +
                ", graduationSchool='" + graduationSchool + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                ", politicalStatus='" + politicalStatus + '\'' +
                ", comments='" + comments + '\'' +
                ", spellCode='" + spellCode + '\'' +
                ", wubiCode='" + wubiCode + '\'' +
                ", createName='" + createName + '\'' +
                ", modifyName='" + modifyName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", socialSecurityCard='" + socialSecurityCard + '\'' +
                ", familyAddress='" + familyAddress + '\'' +
                ", familyAddProvice='" + familyAddProvice + '\'' +
                ", familyAddCity='" + familyAddCity + '\'' +
                ", familyAddCountry='" + familyAddCountry + '\'' +
                ", familyAddTown='" + familyAddTown + '\'' +
                ", familyAddCode='" + familyAddCode + '\'' +
                ", xmlContent=" + xmlContent +
                ", createDatetime='" + createDatetime + '\'' +
                '}';
    }
}
