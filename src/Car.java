import java.util.Objects;

public class Car {
    private int maxSpeed;
    private String brandName;
    private String Color;
    private long vinNumb;


    public Car(int maxSpeed, String brandName, String color, long vinNumb) {
        this.maxSpeed = maxSpeed;
        this.brandName = brandName;
        Color = color;
        this.vinNumb = vinNumb;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public long getVinNumb() {
        return vinNumb;
    }

    public void setVinNumb(long vinNumb) {
        this.vinNumb = vinNumb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vinNumb == car.vinNumb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNumb);
    }
}

