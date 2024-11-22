package Lab03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library extends Classroom implements BookReservable{

    private int amountOfBooks;

    private int amountOfComputers;

    private String openingTime;

    private String closingTime;

    private ArrayList<DayOfWeek> openedDays;

    private List<String> books = new ArrayList<>();

    private HashMap<String, String> reservations = new HashMap<>();



    public Library(int floorNumber, String buildingName, int numberOfRoom, int numberOfSeats, int amountOfBooks,
                   int amountOfComputers, String openingTime, String closingTime, ArrayList<DayOfWeek> openedDays, List<String> initialBooks) {
        super(floorNumber, buildingName, numberOfRoom, numberOfSeats);
        this.amountOfBooks = amountOfBooks;
        this.amountOfComputers = amountOfComputers;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.openedDays = openedDays;

        if (initialBooks != null) {
            this.books.addAll(initialBooks);
            this.amountOfBooks = books.size();
        } else {
            generateBookList();
        }
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

    private void generateBookList() {
        for (int i = 1; i <= amountOfBooks; i++) {
            books.add("Book #" + i);
        }
    }

    public void addBooks(List<String> newBooks) {
        books.addAll(newBooks);
        this.amountOfBooks = books.size();
        System.out.println("Added books: " + newBooks);
    }

    @Override
    public List<String> getAvailableBooks() {
        List<String> availableBooks = new ArrayList<>();
        for (String book : books) {
            if (!reservations.containsKey(book)) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    @Override
    public boolean reserveBook(String bookName, String studentId) {
        if (books.contains(bookName) && !reservations.containsKey(bookName)) {
            reservations.put(bookName, studentId);
            System.out.println("Book reserved: " + bookName + " by " + studentId);
            return true;
        }
        System.out.println("Reservation failed for: " + bookName);
        return false;
    }

    @Override
    public boolean cancelReservation(String bookName, String studentId) {
        if (reservations.containsKey(bookName) && reservations.get(bookName).equals(studentId)) {
            reservations.remove(bookName);
            System.out.println("Reservation cancelled: " + bookName + " by " + studentId);
            return true;
        }
        System.out.println("Cancellation failed for: " + bookName);
        return false;
    }

    @Override
    public boolean isBookAvailable(String bookName) {
        return books.contains(bookName) && !reservations.containsKey(bookName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library Details:\n");
        sb.append("Amount of Books: ").append(amountOfBooks).append("\n");
        sb.append("Amount of Computers: ").append(amountOfComputers).append("\n");
        sb.append("Opening Time: ").append(openingTime).append("\n");
        sb.append("Closing Time: ").append(closingTime).append("\n");
        sb.append("Opened Days: ").append(openedDays).append("\n");

        sb.append("Books in Library:\n");
        for (String book : books) {
            sb.append("- ").append(book).append("\n");
        }

        sb.append("Reservations:\n");
        if (reservations.isEmpty()) {
            sb.append("No reservations.\n");
        } else {
            for (var entry : reservations.entrySet()) {
                sb.append("- Book: ").append(entry.getKey())
                        .append(" reserved by ").append(entry.getValue())
                        .append("\n");
            }
        }

        return sb.toString();
    }
}
