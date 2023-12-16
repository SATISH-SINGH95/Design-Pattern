public class Client {

    public static void main(String[] args) {
        
        Employee emp1 = EmployeeFactory.getEmployeeSalary("Android Developer");
        Double salary1 = emp1.salary();
        System.out.println("Android Developer salary is : "+ salary1 );

        System.out.println("==============================================");

        Employee emp2 = EmployeeFactory.getEmployeeSalary("Web Developer");
        Double salary2 = emp2.salary();
        System.out.println("Web Developer Salary is : "+ salary2 );

    }
    
}
