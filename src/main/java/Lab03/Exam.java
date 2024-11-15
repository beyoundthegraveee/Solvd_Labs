package Lab03;

import java.time.LocalDate;


public class Exam {

    private Subject subject;

    private LocalDate dateOfExam;

    private int duration;

    private String location;

    public Exam(Subject subject, LocalDate dateOfExam, int duration, String location) {
        this.subject = subject;
        this.dateOfExam = dateOfExam;
        this.duration = duration;
        this.location = location;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public LocalDate getDateOfExam() {
        return dateOfExam;
    }

    public void setDateOfExam(LocalDate dateOfExam) {
        this.dateOfExam = dateOfExam;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Exam Info: " +
                "subject is" + subject +
                ", dateOfExam:" + dateOfExam +
                ", duration:" + duration +
                ", location:'" + location + '\'';
    }
}
