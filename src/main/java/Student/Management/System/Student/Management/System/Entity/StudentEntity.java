package Student.Management.System.Student.Management.System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@AllArgsConstructor
@Data
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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

    private String semester;  // e.g., "Semester 3"
    private boolean isActive; // true if student is currently active


    public StudentEntity() {

    }


}
