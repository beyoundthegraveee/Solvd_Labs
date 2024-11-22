package Lab03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Student extends Person implements StudentHomework{

    private String studentID;

    private ArrayList<Grade> grades;

    private String contactInfo;

    private LocalDate enrollmentDate;

    private ArrayList<Assignment> assignments = new ArrayList<>();

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

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
        System.out.println("Assignment '" + assignment.getDescription() + "' has been added to the student.");
    }

    @Override
    public void completeAssignment(Assignment assignment) {
        if (assignments.contains(assignment)) {
            assignment.setStatus(AssignmentStatus.COMPLETED);
            System.out.println("Assignment '" + assignment.getDescription() + "' is now completed.");
        } else {
            System.out.println("Assignment not found: " + assignment.getDescription());
        }
    }

    @Override
    public void skipAssignment(Assignment assignment) {
        if (assignments.contains(assignment)) {
            assignment.setStatus(AssignmentStatus.UNCOMPLETED);
            System.out.println("Assignment '" + assignment.getDescription() + "' has been skipped.");
        } else {
            System.out.println("Assignment not found: " + assignment.getDescription());
        }
    }

    @Override
    public void doneAssignment(Assignment assignment) {
        if (assignments.contains(assignment)) {
            assignment.setStatus(AssignmentStatus.IN_PROGRESS);
            System.out.println("Assignment '" + assignment.getDescription() + "' is now in progress.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted.");
            }
            Random random = new Random();
            if (random.nextBoolean()) {
                completeAssignment(assignment);
            } else {
                skipAssignment(assignment);
            }

        } else {
            System.out.println("Assignment not found: " + assignment.getDescription());
        }
    }

}
