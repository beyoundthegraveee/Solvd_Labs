package Lab03;

import java.util.List;

public interface BookReservable {

    List<String> getAvailableBooks();

    boolean reserveBook(String bookName, String studentId);

    boolean cancelReservation(String bookName, String studentId);

    boolean isBookAvailable(String bookName);

}
