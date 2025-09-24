package Student.Management.System.Student.Management.System.Dto;

import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;
@Data
public class StudentDto {


    private Long id;
    private String  username;
    private String  password;
    private String  FirstName;
    private String  LastName;
    private String  Course;
    private LocalDate DateJoined;
    private String Status;
    private String email;
    private String phoneNumber;
    private String gender;
    private LocalDate dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private double gpa;  // GPA or grade
    private String semester;  // e.g., "Semester 3"
    private boolean isActive; // true if student is currently active


}


