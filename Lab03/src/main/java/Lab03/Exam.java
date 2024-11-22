package Lab03;

import java.time.LocalDate;
import java.time.LocalTime;


public class Exam {

    private Subject subject;

    private LocalDate dateOfExam;

    private LocalTime timeOfExam;

    private double duration;

    private String location;

    public Exam(Subject subject, LocalDate dateOfExam, LocalTime timeOfExam, double duration, String location) {
        this.subject = subject;
        this.dateOfExam = dateOfExam;
        this.timeOfExam = timeOfExam;
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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalTime getTimeOfExam() {
        return timeOfExam;
    }

    public void setTimeOfExam(LocalTime timeOfExam) {
        this.timeOfExam = timeOfExam;
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
