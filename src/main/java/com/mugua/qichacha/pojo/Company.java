package com.mugua.qichacha.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName="kamang",indexStoreType="ik",type = "company", shards = 1, replicas = 0, refreshInterval = "-1")
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String Id;
	private String Dimension;//维度
	private String KeyNo;//内部KeyNo
	//@Field(type = FieldType.String, index = FieldIndex.not_analyzed)
	private String Name;//公司名称
	private String OperName;//法人名称
	private String Status;//企业状态
	private Date StartDate;//成立日期
	private String No;//注册号
	private String CreditCode;//社会统一信用代码
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Company() {
		super();
	}
	public String getDimension() {
		return Dimension;
	}
	public void setDimension(String dimension) {
		Dimension = dimension;
	}
	public String getKeyNo() {
		return KeyNo;
	}
	public void setKeyNo(String keyNo) {
		KeyNo = keyNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getOperName() {
		return OperName;
	}
	public void setOperName(String operName) {
		OperName = operName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	public String getCreditCode() {
		return CreditCode;
	}
	public void setCreditCode(String creditCode) {
		CreditCode = creditCode;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	@Override
	public String toString() {
		return "Company [Id=" + Id + ", Dimension=" + Dimension + ", KeyNo=" + KeyNo + ", Name=" + Name + ", OperName="
				+ OperName + ", Status=" + Status + ", StartDate=" + StartDate + ", No=" + No + ", CreditCode="
				+ CreditCode + "]";
	}
	
	

	
}
