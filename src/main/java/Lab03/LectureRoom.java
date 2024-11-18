package Lab03;

public class LectureRoom extends Classroom{

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
}
