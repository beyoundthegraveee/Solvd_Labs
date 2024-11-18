package Lab03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Schedule {

    private DayOfWeek[] daysOfWeek;

    private LocalDate startDate;

    private LocalDate endDate;

    private ArrayList<Classroom> classrooms;

    public Schedule(DayOfWeek[] daysOfWeek, LocalDate startDate, LocalDate endDate, ArrayList<Classroom> classrooms) {
        this.daysOfWeek = daysOfWeek;
        this.startDate = startDate;
        this.endDate = endDate;
        this.classrooms = classrooms;
    }

    public DayOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DayOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
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

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ArrayList<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Schedule: \n");
        sb.append("Days of Week: ");
        for (DayOfWeek day : daysOfWeek) {
            sb.append(day).append(" ");
        }
        sb.append("\nStart Date: ").append(startDate);
        sb.append("\nEnd Date: ").append(endDate);
        sb.append("\nClassrooms:\n");
        for (Classroom classroom : classrooms) {
            sb.append(classroom.toString()).append("\n");
        }
        return sb.toString();
    }


}
