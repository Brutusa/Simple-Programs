import to.employee.system.Employee;
import to.employee.system.EmployeeDto;
import to.employee.system.EmployeeMapper;
import to.employee.system.EmployeeMapperImpl;

public class Main {

    private static EmployeeMapper mapper = new EmployeeMapperImpl();

    //Simple program to display a DTO object
    public static void main(String[] args) {
        Employee emp = Employee.builder().id(1)
                .firstName("Andujar")
                .lastName("Brutus")
                .build();

        EmployeeDto employeeDto = mapper.toDto(emp);
        System.out.println(employeeDto);
    }
}
