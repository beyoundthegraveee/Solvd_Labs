package Lab03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Student extends Person {

    private String studentID;

    private ArrayList<Grade> grades;

    private String contactInfo;

    private LocalDate enrollmentDate;

    public Student(String name, String surname, int age, String studentID, ArrayList<Grade> grades, String contactInfo, LocalDate enrollmentDate) {
        super(name, surname, age);
        this.studentID = studentID;
        this.grades = grades;
        this.contactInfo = contactInfo;
        this.enrollmentDate = enrollmentDate;
    }

    public Student(String name, String surname, int age, String studentID, String contactInfo, LocalDate enrollmentDate) {
        super(name, surname, age);
        this.studentID = studentID;
        this.contactInfo = contactInfo;
        this.enrollmentDate = enrollmentDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                Objects.equals(studentID, student.studentID)
                && Objects.equals(name, student.name)
                && Objects.equals(surname, student.surname);
    }

    @Override public int hashCode() {
        return Objects.hash(studentID, name, surname, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", grades=" + grades +
                ", contactInfo='" + contactInfo + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
