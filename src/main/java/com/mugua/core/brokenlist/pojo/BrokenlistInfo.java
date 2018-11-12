package com.mugua.core.brokenlist.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;
/**
 * 失信名单类
 * @author 木瓜
 *
 */
@Document(indexName="kamang",indexStoreType="fs",type = "brokenlistInfo", shards = 1, replicas = 0, refreshInterval = "-1")
public class BrokenlistInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer brokenId;//id
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String company;//公司名称
    private String recordType;//失信类型
    private String origanizationCode;//组织机构代码
    private String ext;//拓展
    private String opername;//法人名称
    private String creditcode;//社会统一信用代码
    private Date lineHour;//立案时间
    private String lineNumber;//执行标号
    private String tableNumber;//案号
    private String lineCourt;//执行法院
    private String extOne;//拓展字段

    public Integer getBrokenId() {
        return brokenId;
    }

    public void setBrokenId(Integer brokenId) {
        this.brokenId = brokenId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getOriganizationCode() {
        return origanizationCode;
    }

    public void setOriganizationCode(String origanizationCode) {
        this.origanizationCode = origanizationCode == null ? null : origanizationCode.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername == null ? null : opername.trim();
    }

    public String getCreditcode() {
        return creditcode;
    }

    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode == null ? null : creditcode.trim();
    }

    public Date getLineHour() {
        return lineHour;
    }

    public void setLineHour(Date lineHour) {
        this.lineHour = lineHour;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber == null ? null : lineNumber.trim();
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber == null ? null : tableNumber.trim();
    }

    public String getLineCourt() {
        return lineCourt;
    }

    public void setLineCourt(String lineCourt) {
        this.lineCourt = lineCourt == null ? null : lineCourt.trim();
    }

    public String getExtOne() {
        return extOne;
    }

    public void setExtOne(String extOne) {
        this.extOne = extOne == null ? null : extOne.trim();
    }
}