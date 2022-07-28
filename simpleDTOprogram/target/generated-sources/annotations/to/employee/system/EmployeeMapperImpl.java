package to.employee.system;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-27T22:17:09-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
*/
public class EmployeeMapperImpl extends EmployeeMapper {

    @Override
    public EmployeeDto toDto(Employee emp) {
        if ( emp == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFullName( fullNameByFirstAndLastName( emp ) );
        employeeDto.setId( emp.getId() );

        return employeeDto;
    }

    @Override
    public Employee fromDto(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.id( dto.getId() );

        return employee.build();
    }
}
