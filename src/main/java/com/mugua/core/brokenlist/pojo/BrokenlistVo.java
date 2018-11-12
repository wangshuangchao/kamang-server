package com.mugua.core.brokenlist.pojo;

public class BrokenlistVo {
	private Integer brokenId;//id
    private String company;//公司名称
    private String recordType;//失信类型
    private String origanizationCode;//组织机构代码
	public BrokenlistVo() {
		super();
	}
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
		this.company = company;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getOriganizationCode() {
		return origanizationCode;
	}
	public void setOriganizationCode(String origanizationCode) {
		this.origanizationCode = origanizationCode;
	}
	@Override
	public String toString() {
		return "BrokenlistVo [brokenId=" + brokenId + ", company=" + company + ", recordType=" + recordType
				+ ", origanizationCode=" + origanizationCode + "]";
	}
    
    
}
