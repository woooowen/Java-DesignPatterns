package factory.simple;

/**
 * Created by woooowen on 2017/8/2.
 */
public class RedCar extends Car {

    RedCar() {
        setColor("red");
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

}
