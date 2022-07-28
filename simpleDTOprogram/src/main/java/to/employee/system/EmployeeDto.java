package to.employee.system;

import lombok.Data;
import org.mapstruct.AfterMapping;

@Data
public class EmployeeDto {
    private int id;
    private String fullName;
}
