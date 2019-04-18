package com.devsubho.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			// Create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// Read JSON file and map/convert to POJO
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// Print the result
			System.out.println("The First Name:"+theStudent.getFirstName());
			System.out.println("The Last Name:"+theStudent.getLastName());
			System.out.println("The Last Name:"+theStudent.getAddress().getCity());
			for(String language: theStudent.getLanguages()) {
				System.out.println("The Last Name:"+language);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
