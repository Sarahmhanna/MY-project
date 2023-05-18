package ma.ges.school.services;

import ma.ges.school.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    Long save(StudentDto s);

    Long update(StudentDto s);

    Boolean delete(Long id);

    List<StudentDto> selectAll();
}
