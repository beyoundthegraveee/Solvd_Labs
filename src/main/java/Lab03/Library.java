package Lab03;

import java.util.ArrayList;

public class Library extends Classroom {

    private int amountOfBooks;

    private int amountOfComputers;

    private String openingTime;

    private String closingTime;

    private ArrayList<DayOfWeek> openedDays;

    public Library(int floorNumber, String buildingName, int numberOfRoom, int numberOfSeats, int amountOfBooks, int amountOfComputers, String openingTime, String closingTime, ArrayList<DayOfWeek> openedDays) {
        super(floorNumber, buildingName, numberOfRoom, numberOfSeats);
        this.amountOfBooks = amountOfBooks;
        this.amountOfComputers = amountOfComputers;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.openedDays = openedDays;
    }

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setAmountOfBooks(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }

    public int getAmountOfComputers() {
        return amountOfComputers;
    }

    public void setAmountOfComputers(int amountOfComputers) {
        this.amountOfComputers = amountOfComputers;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public ArrayList<DayOfWeek> getOpenedDays() {
        return openedDays;
    }

    public void setOpenedDays(ArrayList<DayOfWeek> openedDays) {
        this.openedDays = openedDays;
    }

    @Override
    public String toString() {
        return "Library{" +
                "openedDays=" + openedDays +
                ", closingTime='" + closingTime + '\'' +
                ", openingTime='" + openingTime + '\'' +
                ", amountOfComputers=" + amountOfComputers +
                ", amountOfBooks=" + amountOfBooks +
                '}';
    }
}
