package design;

import java.util.Date;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
    //please read the following method and understand the business requirements of these following methods
    //and then implement these in a concrete class.

    //employeeId() will return employee id.
    int employeeId();

    //employeeName() will return employee name
    String employeeName();

    //dateOfBirth() will return employee's date of birth
    Date dateOfBirth();

    //assignDepartment() will assign employee to departments
    void assignDepartment();

    //position() will return employee position
    String employeePosition();

    //calculate employee salary
    int calculateSalary();

    //employee benefit
    void benefitLayout();

}
