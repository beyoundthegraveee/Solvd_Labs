package Lab03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Semestr {

    private int numberOfSemestr;

    private String academicYear;

    private ArrayList<Event> events;

    private LocalDate startDate;

    private LocalDate endDate;

    public Semestr(int numberOfSemestr, String academicYear, ArrayList<Event> events, LocalDate startDate, LocalDate endDate) {
        this.numberOfSemestr = numberOfSemestr;
        this.academicYear = academicYear;
        this.events = events;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getNumberOfSemestr() {
        return numberOfSemestr;
    }

    public void setNumberOfSemestr(int numberOfSemestr) {
        this.numberOfSemestr = numberOfSemestr;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Semestr{" +
                "numberOfSemestr=" + numberOfSemestr +
                ", academicYear='" + academicYear + '\'' +
                ", events=" + events +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }



}
