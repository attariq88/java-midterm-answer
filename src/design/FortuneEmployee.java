package design;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use MySql Database to store data and retrieve data.
     **/
    public static void main(String[] args) {
        EmployeeInfo employee1 = new EmployeeInfo();
        EmployeeInfo employee2 = new EmployeeInfo(1);
        EmployeeInfo employee3 = new EmployeeInfo("Asif",2);

        System.out.println(employee1.getEmployeeId());
        System.out.println(employee2.getEmployeeId());
        System.out.println(employee3.getEmployeeId());
    }

}
