import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperPractice {
	public static void main(String[] args) throws JsonProcessingException {
		
		EmployeeModel e = new EmployeeModel();
		e.setEmpAge(15);
		e.setEmpAverageSalary(20000);
		e.setEmpDepartment("CBO");
		e.setEmpGender("M");
		e.setEmpId(123456);
		e.setEmpName("Abhinav Gupta");
		e.setEmpYearOfJoining(2022);
		
		EmployeeModel e1 = new EmployeeModel();
				
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(e1);
		System.out.println(json);
	}
}
