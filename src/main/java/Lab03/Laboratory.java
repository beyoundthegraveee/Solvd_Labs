package Lab03;

import java.util.Arrays;

public class Laboratory extends Classroom{

    private String labName;

    private Employee Supervisor;

    private String experimentType;

    public Laboratory(int numberOfSeats, int numberOfRoom, String buildingName, int floorNumber, Equipment[] equipment, boolean isAvailable, String labName, Employee supervisor, String experimentType) {
        super(numberOfSeats, numberOfRoom, buildingName, floorNumber, equipment, isAvailable);
        this.labName = labName;
        Supervisor = supervisor;
        this.experimentType = experimentType;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public Employee getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        Supervisor = supervisor;
    }

    public String getExperimentType() {
        return experimentType;
    }

    public void setExperimentType(String experimentType) {
        this.experimentType = experimentType;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "isAvailable=" + isAvailable +
                ", equipment=" + Arrays.toString(equipment) +
                ", floorNumber=" + floorNumber +
                ", buildingName='" + buildingName + '\'' +
                ", numberOfRoom=" + numberOfRoom +
                ", numberOfSeats=" + numberOfSeats +
                ", experimentType='" + experimentType + '\'' +
                ", Supervisor=" + Supervisor +
                ", labName='" + labName + '\'' +
                '}';
    }
}
