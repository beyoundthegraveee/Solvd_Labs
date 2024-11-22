package Lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Laboratory extends Classroom implements EquipmentOrder{

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

    @Override
    public boolean orderEquipment(Equipment equipment) {
        if (equipment != null && !isEquipmentAvailable(equipment)) {
            List<Equipment> equipmentList = new ArrayList<>(Arrays.asList(this.equipment));
            equipmentList.add(equipment);
            this.equipment = equipmentList.toArray(new Equipment[0]);
            System.out.println(equipment + " has been ordered for the laboratory.");
            return true;
        }
        return false;
    }

    @Override
    public boolean isEquipmentAvailable(Equipment equipment) {
        return Arrays.asList(this.equipment).contains(equipment);
    }

    @Override
    public boolean removeEquipment(Equipment equipment) {
        if (equipment != null && isEquipmentAvailable(equipment)) {
            List<Equipment> equipmentList = new ArrayList<>(Arrays.asList(this.equipment));
            equipmentList.remove(equipment);
            this.equipment = equipmentList.toArray(new Equipment[0]);
            System.out.println(equipment + " has been removed from the laboratory.");
            return true;
        }
        return false;
    }

    @Override
    public Equipment[] listAvailableEquipment() {
        return this.equipment;
    }
}
