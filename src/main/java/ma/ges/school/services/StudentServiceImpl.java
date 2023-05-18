package ma.ges.school.services;

import ma.ges.school.dtos.StudentDto;
import ma.ges.school.mapper.StudentMapper;
import ma.ges.school.repository.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentServiceImpl implements StudentService {
        //private final static Logger LOGGER= LoggerFactory.getLogger(StudentServiceImpl.class);

        private StudentRepository studentRepository;
        private StudentMapper studentMapper= Mappers.getMapper(StudentMapper.class);

        public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository) {
            this.studentRepository = studentRepository;
        }

        @Override
        public Long save(StudentDto dto) {
           // LOGGER.debug("start method save dto : {} ",dto);
            //LOGGER.debug("mapper to Entity {} ",studentMapper.studentDtoToEntity(dto));
            StudentDto re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
            return re.getStudentId().getId();
        }

        @Override
        public Long update(StudentDto dto) {
            //LOGGER.debug("start method save dto : {} ",dto);
            StudentDto re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
            return re.getStudentId().getId();
        }

        @Override
        public Boolean delete(Long id) {
            //LOGGER.debug("start method delete id : {} ",id);
            studentRepository.deleteById(id);
            return true;

        }

        @Override
        public List<StudentDto> selectAll() {
            //LOGGER.debug("start method select All");
            return studentMapper.studentEntiesToDtos(studentRepository.findAll());
        }





}
