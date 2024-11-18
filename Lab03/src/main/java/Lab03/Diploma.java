package Lab03;

import java.time.LocalDate;

public class Diploma {

    private String diplomaName;

    private String documentation;

    private Student student;

    private LocalDate completionDate;

    private Practitioner practitioner;

    private String degreeType;

    public Diploma(String diplomaName, String documentation, Student student, LocalDate completionDate, Practitioner practitioner, String degreeType) {
        this.diplomaName = diplomaName;
        this.documentation = documentation;
        this.student = student;
        this.completionDate = completionDate;
        this.practitioner = practitioner;
        this.degreeType = degreeType;
    }

    public String getDiplomaName() {
        return diplomaName;
    }

    public void setDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public Practitioner getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(Practitioner practitioner) {
        this.practitioner = practitioner;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    @Override
    public String toString() {
        return "Diploma{" +
                "diplomaName='" + diplomaName + '\'' +
                ", documentation='" + documentation + '\'' +
                ", student=" + student.toString() +
                ", completionDate=" + completionDate +
                ", practitioner=" + practitioner.toString() +
                ", degreeType='" + degreeType + '\'' +
                '}';
    }
}
