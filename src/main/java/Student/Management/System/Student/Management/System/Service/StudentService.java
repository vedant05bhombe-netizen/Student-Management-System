package Student.Management.System.Student.Management.System.Service;

import Student.Management.System.Student.Management.System.Dto.StudentDto;
import Student.Management.System.Student.Management.System.Entity.StudentEntity;
import Student.Management.System.Student.Management.System.Repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService implements StudentServ1 {

    private final StudentRepo studentRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudent() {
        List<StudentEntity> students = studentRepo.findAll();
        return students.stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .toList();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        StudentEntity student = studentRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);
        StudentEntity savedStudent = studentRepo.save(studentEntity);
        return modelMapper.map(savedStudent, StudentDto.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public StudentDto updateStudentById(Long id, StudentDto studentDto) {
        StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);
        StudentEntity updatedStudent = studentRepo.saveAndFlush(studentEntity);
        return modelMapper.map(updatedStudent, StudentDto.class);
    }
}
