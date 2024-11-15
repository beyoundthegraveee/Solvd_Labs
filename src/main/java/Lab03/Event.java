package Lab03;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Event {

    private String eventName;

    private LocalDate date;

    private String location;

    public Event(String eventName, LocalDate date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public Event(String eventName, LocalDate date) {
        this.eventName = eventName;
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
