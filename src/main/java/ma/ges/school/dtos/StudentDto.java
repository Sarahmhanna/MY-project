package ma.ges.school.dtos;

import java.util.List;

public class StudentDto {


    private StudentIdDTO studentId;
    private String name;
    private AddressDto adresse;
    private List<CourseDto> courses;
    private NiveauDto niveau;

    public NiveauDto getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauDto niveau) {
        this.niveau = niveau;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
    }

    public AddressDto getAdresse() {
        return adresse;
    }

    public void setAdresse(AddressDto adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentIdDTO getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDTO studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                ", courses=" + courses +
                ", niveau=" + niveau +
                '}';
    }

}
