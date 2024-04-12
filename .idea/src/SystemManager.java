package your.package.name;

import java.util.Date;
import java.util.List;

public class SystemManager {
    private List<User> users;
    private List<Car> cars;
    private List<Reservation> reservations;

    public SystemManager(List<User> users, List<Car> cars, List<Reservation> reservations) {
        this.users = users;
        this.cars = cars;
        this.reservations = reservations;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void makeReservation(User user, Car car, Date date, String priority) {
        Reservation reservation = new Reservation(user, car, date, priority);
        reservations.add(reservation);
    }

    public void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}