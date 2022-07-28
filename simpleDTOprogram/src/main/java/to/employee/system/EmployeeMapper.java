package to.employee.system;

import org.mapstruct.*;

@Mapper
public abstract class EmployeeMapper {

    @Mapping(qualifiedByName = "fullNameByFirstAndLastName", source = "emp", target="fullName")
    public abstract EmployeeDto toDto(Employee emp);
    @InheritInverseConfiguration(name = "toDto")
    public abstract Employee fromDto(EmployeeDto dto);

    @Named("fullNameByFirstAndLastName")
    String fullNameByFirstAndLastName(Employee emp){
        return emp.getFirstName() + ' ' + emp.getLastName();
    }

}
