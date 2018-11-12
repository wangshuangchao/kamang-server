package com.mugua.common.mapper;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

public class KindoObjectMapper extends ObjectMapper {

	  /**
	    * 
	    */
	    private static final long serialVersionUID = 1L;

	    public KindoObjectMapper() {
	        super();
	        // 数字也加引号
	        // this.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
	        // this.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS,
	        // true);
	        // 空值处理为空串
	        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
	            @Override
	            public void serialize(Object value, JsonGenerator jg, SerializerProvider sp)
	                    throws IOException, JsonProcessingException {
	                jg.writeString("");
	            }
	        });

	    }
}
