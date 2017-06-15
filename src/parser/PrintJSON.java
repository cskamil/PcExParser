package parser;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintJSON {
	
	public static void printJSON(Object object) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			String writeValueAsString2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
			System.out.println(writeValueAsString2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
