package Lab03;

import java.time.LocalDate;

public class Assignment {

    private int numberOfAssignment;

    private String description;

    private AssignmentStatus status;

    private LocalDate theEndDate;

    public Assignment(int numberOfAssignment, String description, LocalDate theEndDate, AssignmentStatus status) {
        this.numberOfAssignment = numberOfAssignment;
        this.description = description;
        this.theEndDate = theEndDate;
        this.status = status;
    }

    public AssignmentStatus getStatus() {
        return status;
    }

    public void setStatus(AssignmentStatus status) {
        this.status = status;
    }

    public Assignment() {
    }

    public int getNumberOfAssignment() {
        return numberOfAssignment;
    }

    public void setNumberOfAssignment(int numberOfAssignment) {
        this.numberOfAssignment = numberOfAssignment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTheEndDate() {
        return theEndDate;
    }

    public void setTheEndDate(LocalDate theEndDate) {
        this.theEndDate = theEndDate;
    }


    @Override
    public String toString() {
        return "Assignment{" +
                "numberOfAssignment=" + numberOfAssignment +
                ", description='" + description + '\'' +
                ", theEndDate=" + theEndDate +
                '}';
    }
}
