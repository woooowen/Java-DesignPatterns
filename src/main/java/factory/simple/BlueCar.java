package factory.simple;

/**
 * Created by woooowen on 2017/8/2.
 */
public class BlueCar extends Car {

    BlueCar() {
        setColor("blue");
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
