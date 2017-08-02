package factory.simple;

/**
 * Created by woooowen on 2017/8/2.
 */
public class Factory {

    public static Car product(String carType){

        if(carType.equals("red")){
            return new RedCar();
        }

        if(carType.equals("blue")){
            return new BlueCar();
        }

        return null;
    }

}