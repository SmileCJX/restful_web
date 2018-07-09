package pers.caijx.restful.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by caijx on 2018/7/2/002.
 */
@Entity
@Table(name =  "T_OPERATION_LOG")
public class OperationLogDto {

    @Id
    @GeneratedValue
    private Integer fulId;

    private String fulUser;

    private String opTime;

    private String opIP;

    private String opDesc;

    private String opSql;

    private String opType;

    public OperationLogDto() {
    }

    public OperationLogDto(Integer fulId, String fulUser, String opTime, String opIP, String opDesc, String opSql, String opType) {
        this.fulId = fulId;
        this.fulUser = fulUser;
        this.opTime = opTime;
        this.opIP = opIP;
        this.opDesc = opDesc;
        this.opSql = opSql;
        this.opType = opType;
    }

    public Integer getFulId() {
        return fulId;
    }

    public void setFulId(Integer fulId) {
        this.fulId = fulId;
    }

    public String getFulUser() {
        return fulUser;
    }

    public void setFulUser(String fulUser) {
        this.fulUser = fulUser;
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public String getOpIP() {
        return opIP;
    }

    public void setOpIP(String opIP) {
        this.opIP = opIP;
    }

    public String getOpDesc() {
        return opDesc;
    }

    public void setOpDesc(String opDesc) {
        this.opDesc = opDesc;
    }

    public String getOpSql() {
        return opSql;
    }

    public void setOpSql(String opSql) {
        this.opSql = opSql;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    @Override
    public String toString() {
        return "OperationLogDto{" +
                "fulId=" + fulId +
                ", fulUser='" + fulUser + '\'' +
                ", opTime='" + opTime + '\'' +
                ", opIP='" + opIP + '\'' +
                ", opDesc='" + opDesc + '\'' +
                ", opSql='" + opSql + '\'' +
                ", opType='" + opType + '\'' +
                '}';
    }
}
