package to.employee.system;

import lombok.Builder;
import lombok.Data;
import org.mapstruct.BeforeMapping;

@Data
@Builder
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
}
