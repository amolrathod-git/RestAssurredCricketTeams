package com.org.team.base_functions;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseTests {
	
	RequestSpecification requestSpecification;
	
	
	public String getMyTeam() throws FileNotFoundException {
		
		Properties prop =new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\org\\team\\ipl\\resources\\Teams.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String myTeam=  prop.getProperty("myteam");
		
		return myTeam;
		
	}
	
	@BeforeTest
	public Response buildRequestAndResponses() throws FileNotFoundException {
		HashMap<String, String> headers =new HashMap<String, String>();
		headers.put("requestheader", getMyTeam());
		headers.put("x-mock-match-request-headers", "requestheader");
		
		 requestSpecification =with().
				baseUri("http://cb5d4d43-93de-4436-8d52-d755454d067b.mock.pstmn.io").
		        headers(headers);
		        //log().all();
		 
			//Response response=given().spec(requestSpecification).get("/get").then().log().all().extract().response();
			Response response=given().spec(requestSpecification).get("/get"+getMyTeam()).then().extract().response();
			return response;
	}
	
	
	
	
	
	
}
