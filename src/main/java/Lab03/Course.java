package Lab03;

import java.util.ArrayList;

public class Course {

    private String courseName;

    private String courseCode;

    private String courseDescription;

    private String courseLocation;

    private ArrayList<Professor> professors;

    private ArrayList<Practitioner> practitioners;

    private ArrayList<Assignment> assignments;

    private Diploma diploma;

    private ArrayList<Exam> exams;

    public Course(String courseName, String courseCode, String courseDescription, String courseLocation, ArrayList<Professor> professors, ArrayList<Practitioner> practitioners, ArrayList<Assignment> assignments, Diploma diploma, ArrayList<Exam> exams) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.courseLocation = courseLocation;
        this.professors = professors;
        this.practitioners = practitioners;
        this.assignments = assignments;
        this.diploma = diploma;
        this.exams = exams;
    }


    public Course(String courseName, String courseCode, String courseDescription, String courseLocation, ArrayList<Professor> professors, ArrayList<Practitioner> practitioners, ArrayList<Assignment> assignments) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.courseLocation = courseLocation;
        this.professors = professors;
        this.practitioners = practitioners;
        this.assignments = assignments;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Practitioner> getPractitioners() {
        return practitioners;
    }

    public void setPractitioners(ArrayList<Practitioner> practitioners) {
        this.practitioners = practitioners;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Diploma getDiploma() {
        return diploma;
    }

    public void setDiploma(Diploma diploma) {
        this.diploma = diploma;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }

    public String getCourseDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Course Name: ").append(courseName).append("\n")
                .append("Course Code: ").append(courseCode).append("\n")
                .append("Description: ").append(courseDescription).append("\n")
                .append("Location: ").append(courseLocation).append("\n")
                .append("Diploma: ").append(diploma != null ? diploma.getDiplomaName() : "No diploma").append("\n");

        details.append("\nProfessors:\n");
        for (Professor professor : professors) {
            details.append("  - ").append(professor.getName()).append(" ").append(professor.getSurname()).append("\n");
        }

        details.append("\nPractitioners:\n");
        for (Practitioner practitioner : practitioners) {
            details.append("  - ").append(practitioner.getName()).append(" ").append(practitioner.getSurname()).append("\n");
        }

        details.append("\nAssignments:\n");
        for (Assignment assignment : assignments) {
            details.append("  - ").append(assignment.getDescription()).append(" (Due: ").append(assignment.getTheEndDate()).append(")\n");
        }
        return details.toString();
    }
}
