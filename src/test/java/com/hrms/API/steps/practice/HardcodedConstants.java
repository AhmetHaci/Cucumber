package com.hrms.API.steps.practice;

public class HardcodedConstants {

    public static String updateCreateEmpBody() {
        
        String updateBody = "{\r\n" + 
                "  \"employee_id\": \""+HardCodedExamples.employeeID +"\",\r\n" + 
                "  \"emp_firstname\": \"ilyasUpdate\",\r\n" + 
                "  \"emp_lastname\": \"unakUpdate\",\r\n" + 
                "  \"emp_middle_name\": \"Update\",\r\n" + 
                "  \"emp_gender\": \"M\",\r\n" + 
                "  \"emp_birthday\": \"2000-05-11\",\r\n" + 
                "  \"emp_status\": \"Internee\",\r\n" + 
                "  \"emp_job_title\": \"CTO\"\r\n" + 
                "}";
        
        return updateBody;
    }

}
