package Student.Management.System.Student.Management.System.Repo;

import Student.Management.System.Student.Management.System.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository < StudentEntity, Long > {

}



