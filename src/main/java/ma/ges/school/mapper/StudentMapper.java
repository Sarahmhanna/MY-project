package ma.ges.school.mapper;

import ma.ges.school.dtos.StudentDto;
import ma.ges.school.entities.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {

        StudentEntity studentDtoToEntity(StudentDto dto);
        StudentDto studentEntityToDto(StudentEntity studentEntity);
        List<StudentDto> studentEntiesToDtos(List<StudentEntity> studentEntities);
    }

