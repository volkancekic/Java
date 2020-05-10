package com.v.SampleJSONProject;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
    	//JSON-->POJO
        ObjectMapper mapper=new ObjectMapper();
        Employee emp=mapper.readValue(new File("data/sample.json"),Employee.class);
        System.out.println("---"+emp);
        
        //POJO-->JSON	
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("data/target.json"),emp);
    }
}
