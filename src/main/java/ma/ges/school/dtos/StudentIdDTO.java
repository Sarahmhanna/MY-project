package ma.ges.school.dtos;

public class StudentIdDTO {


    private Long id;
    private String code;


    public StudentIdDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "StudentIdDto{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }

}
