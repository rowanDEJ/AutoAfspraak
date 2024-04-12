import java.util.Date;

public class Reservation {
    private User user;
    private Car car;
    private Date date;
    private String priority;

    public Reservation(User user, Car car, Date date, String priority) {
        this.user = user;
        this.car = car;
        this.date = date;
        this.priority = priority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}