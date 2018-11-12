package com.mugua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.github.tobato.fastdfs.FdfsClientConfig;
import com.mugua.common.mapper.KindoObjectMapper;
//解决jmx重复注册bean的问题
import com.mugua.common.util.IdWorker;


@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
@Import(FdfsClientConfig.class) // fastDFS
@SpringBootApplication(scanBasePackages = { "com.mugua" })
@EnableScheduling // 定时任务
public class CmCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmCoreApplication.class, args);
	}

	/**
	 * 自定义ObjectMapper
	 * 
	 * @return
	 */
	@Bean
	public MappingJackson2HttpMessageConverter mappingJacksonHttpMessageConverter() {
		final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		KindoObjectMapper mapper = new KindoObjectMapper();
		converter.setObjectMapper(mapper);
		return converter;
	}

	@Bean
	public IdWorker getIdWork() {
		IdWorker idWorker = new IdWorker(0, 0);
		return idWorker;
	}


}
