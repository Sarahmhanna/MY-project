package ma.ges.school.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "School")
public class StudentEntity {


       @EmbeddedId
        private StudentId studentId;

        @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
        private List<CourseEntity> courses;

        //@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
        //@JoinColumn(name = "level_id")
        //private NiveauEntity niveau;



        public void setCourses(List<CourseEntity> courses) {
            this.courses = courses;
        }

        @Column(name = "name_student")
        private String name;

        @Embedded
        @AttributeOverrides({
                @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
                @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
        })
        private AddressEntity address;


    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity addresse) {
        this.address = addresse;
    }

    public StudentId getStudentId() {
            return studentId;
        }

        public void setStudentId(StudentId studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public List<CourseEntity> getCourses() {
        return courses;
    }



    @Override
        public String toString() {
            return "StudentEntity{" +
                    "studentId=" + studentId +
                    ", courses=" + courses +
                    ", niveau=" +
                    ", name='" + name + '\'' +
                    ", adresse=" + address +
                    '}';
        }
    }

