package Student.Management.System.Student.Management.System.Service;

import Student.Management.System.Student.Management.System.Dto.StudentDto;

import java.util.List;

public interface StudentServ1 {
    List<StudentDto> getAllStudent();

    StudentDto getStudentById(Long id);



    StudentDto createStudent(StudentDto studentDto);



    void deleteStudentById(Long id);

    StudentDto updateStudentById(Long id, StudentDto studentDto);
}
