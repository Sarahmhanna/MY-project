package ma.ges.school.controller;

import ma.ges.school.dtos.StudentDto;
import ma.ges.school.services.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    //private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;

    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Long save(@RequestBody StudentDto dto) {
        //LOGGER.debug("start method save dto : {} ",dto);
        return studentService.save(dto);
    }

    @PutMapping
    public Long update(@RequestBody StudentDto dto) {
        //LOGGER.debug("start method update dto : {} ",dto);
        return studentService.update(dto);
    }

    @GetMapping("/{ids}")
    public Boolean delete(@PathVariable("ids") Long id) {
        //LOGGER.debug("start method delete id : {} ",id);
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentDto> selectAll() {
        //LOGGER.debug("start method select All");
        return studentService.selectAll();
    }

}
