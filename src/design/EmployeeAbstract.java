package design;

import java.util.Date;

public abstract class EmployeeAbstract implements Employee {
    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public String address() {
        return null;
    }

    @Override
    public String email() {
        return null;
    }

    @Override
    public Date dateOfBirth() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public String employeePosition() {
        return null;
    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }
}
