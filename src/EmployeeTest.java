;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("someOne1");
        Employee empTwo = new Employee("someOne2");

        empOne.emAge(22);
        empOne.empDesignation("学java的小前端");
        empOne.empSalary(15000);
        empOne.printEmployee();

        empTwo.emAge(26);
        empTwo.empDesignation("学前端的小java");
        empTwo.empSalary(12000);
        empTwo.printEmployee();
    }
}
