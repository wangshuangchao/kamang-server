package com.mugua.qichacha.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mugua.qichacha.pojo.Company;


@Mapper
public interface CompanyMapper {

	@Select("select * from Company where id=#{id}")
    public Company selectById(String id);
	
	@Insert("INSERT INTO Company(ID,DIMENSION,KEYNO,NAME,OPERNAME,STATUS,STARTDATE,NO,CREDITCODE) "
			+ "VALUES(#{Id},#{Dimension},#{KeyNo},#{Name},#{OperName},"
			+ "#{Status},#{StartDate},#{No},#{CreditCode})")
	public void insertCompany(Company company);
	
	@Select("select * from Company where CREDITCODE=#{creditCode}")
    public Company selectByCreditCode(String creditCode);
	
	@Select("select * from Company where NAME LIKE CONCAT(CONCAT('%', #{name}), '%')")
	public List<Company> selectByName(String name);
	
	@Select("select * from Company")
	public List<Company> selectAll();
	
}
