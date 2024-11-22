package Lab03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class LectureRoom extends Classroom implements ExamConducting{

    private boolean hasAirConditioning;

    private LightingType [] lightingTypes;

    private boolean hasWifi;

    private int numberOfWindows;

    public LectureRoom(int numberOfSeats, int numberOfRoom, String buildingName, int floorNumber, Equipment[] equipment, boolean isAvailable, boolean hasAirConditioning, LightingType[] lightingTypes, boolean hasWifi, int numberOfWindows) {
        super(numberOfSeats, numberOfRoom, buildingName, floorNumber, equipment, isAvailable);
        this.hasAirConditioning = hasAirConditioning;
        this.lightingTypes = lightingTypes;
        this.hasWifi = hasWifi;
        this.numberOfWindows = numberOfWindows;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public LightingType[] getLightingTypes() {
        return lightingTypes;
    }

    public void setLightingTypes(LightingType[] lightingTypes) {
        this.lightingTypes = lightingTypes;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString() {
        return "LectureRoom{" +
                "hasAirConditioning=" + hasAirConditioning +
                ", lightingTypes=" + Arrays.toString(lightingTypes) +
                ", hasWifi=" + hasWifi +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }

    @Override
    public void startExam(Exam exam) {
        if (isClassAvailableForExam(exam)) {
            System.out.println("Starting exam on " + exam.getSubject() + " at " + exam.getDateOfExam() + " " + exam.getTimeOfExam());
        } else {
            System.out.println("Lecture room is not available for the exam.");
        }
    }

    @Override
    public void endExam(Exam exam) {
        LocalTime endTime = exam.getTimeOfExam().plusMinutes(90);
        System.out.println("Ending exam on " + exam.getSubject() + " at " + exam.getDateOfExam() + " " + endTime);
    }

    @Override
    public boolean isClassAvailableForExam(Exam exam) {
        return isAvailable() && exam.getDateOfExam().isAfter(LocalDate.of(2024, 7,5));
    }
}
