package Lab03;

public abstract class Classroom {

    protected int numberOfSeats;

    protected int numberOfRoom;

    protected String buildingName;

    protected int floorNumber;

    protected Equipment [] equipment;

    protected boolean isAvailable;

    public Classroom(int numberOfSeats, int numberOfRoom, String buildingName, int floorNumber, Equipment[] equipment, boolean isAvailable) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfRoom = numberOfRoom;
        this.buildingName = buildingName;
        this.floorNumber = floorNumber;
        this.equipment = equipment;
        this.isAvailable = isAvailable;
    }

    public Classroom(int floorNumber, String buildingName, int numberOfRoom, int numberOfSeats) {
        this.floorNumber = floorNumber;
        this.buildingName = buildingName;
        this.numberOfRoom = numberOfRoom;
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Equipment[] getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment[] equipment) {
        this.equipment = equipment;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
