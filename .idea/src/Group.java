import java.util.List;

public class Group {
    private String name;
    private List<User> users;
    private List<Car> cars;

    public Group(String name, List<User> users, List<Car> cars) {
        this.name = name;
        this.users = users;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}