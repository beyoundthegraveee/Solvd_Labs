package Lab03;

import java.util.Map;

public class Grade {

    private double semesterAverageGrade;

    private double yearAverageGrade;

    private double examAverageGrade;

    private Map<Assignment, Double> assignmentGrades;

    public Grade(double semesterAverageGrade, double yearAverageGrade, double examAverageGrade, Map<Assignment, Double> assignmentGrades) {
        this.semesterAverageGrade = semesterAverageGrade;
        this.yearAverageGrade = yearAverageGrade;
        this.examAverageGrade = examAverageGrade;
        this.assignmentGrades = assignmentGrades;
    }

    public Grade() {
    }

    public double getSemesterAverageGrade() {
        return semesterAverageGrade;
    }

    public void setSemesterAverageGrade(double semesterAverageGrade) {
        this.semesterAverageGrade = semesterAverageGrade;
    }

    public double getYearAverageGrade() {
        return yearAverageGrade;
    }

    public void setYearAverageGrade(double yearAverageGrade) {
        this.yearAverageGrade = yearAverageGrade;
    }

    public double getExamAverageGrade() {
        return examAverageGrade;
    }

    public void setExamAverageGrade(double examAverageGrade) {
        this.examAverageGrade = examAverageGrade;
    }

    public Map<Assignment, Double> getAssignmentGrades() {
        return assignmentGrades;
    }

    public void setAssignmentGrades(Map<Assignment, Double> assignmentGrades) {
        this.assignmentGrades = assignmentGrades;
    }

    @Override
    public String toString() {
        StringBuilder assignmentsString = new StringBuilder();
        for (Map.Entry<Assignment, Double> entry : assignmentGrades.entrySet()) {
            assignmentsString.append(entry.getKey().getDescription())
                    .append(": ")
                    .append(entry.getValue())
                    .append(", ");
        }

        return "Grade{" +
                "semesterAverageGrade=" + semesterAverageGrade +
                ", yearAverageGrade=" + yearAverageGrade +
                ", examAverageGrade=" + examAverageGrade +
                ", assignmentGrades={" + assignmentsString.toString() + "}}";
    }
}
