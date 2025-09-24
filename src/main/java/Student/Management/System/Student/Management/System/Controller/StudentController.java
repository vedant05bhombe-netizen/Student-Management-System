package Student.Management.System.Student.Management.System.Controller;

import Student.Management.System.Student.Management.System.Dto.StudentDto;
import Student.Management.System.Student.Management.System.Entity.StudentEntity;
import Student.Management.System.Student.Management.System.Repo.StudentRepo;
import Student.Management.System.Student.Management.System.Service.StudentService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students") // optional but recommended
public class StudentController {

    private final StudentService studentService;

    private final StudentRepo studentRepo;
     private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentDto> CreateStudent(@RequestBody StudentDto studentDto) {
        return ResponseEntity.ok(studentService.createStudent(studentDto));
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody StudentDto dto) {
        StudentEntity existing = studentRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setEmail(dto.getEmail());
        existing.setUsername(dto.getUsername());
        existing.setPassword(dto.getPassword());
        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setCourse(dto.getCourse());
        existing.setDateJoined(dto.getDateJoined());
        existing.setStatus(dto.getStatus());
        existing.setEmail(dto.getEmail());
        existing.setPhoneNumber(dto.getPhoneNumber());
        existing.setGender(dto.getGender());
        existing.setDateOfBirth(dto.getDateOfBirth());
        existing.setAddress(dto.getAddress());
        existing.setCity(dto.getCity());
        existing.setState(dto.getState());
        existing.setCountry(dto.getCountry());
        existing.setPostalCode(dto.getPostalCode());
        existing.setSemester(dto.getSemester());

        StudentEntity updated = studentRepo.save(existing);
        return ResponseEntity.ok(modelMapper.map(updated, StudentDto.class));
    }

}
