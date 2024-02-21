import java.util.*;
public class FactoryMaker {

    public static AbstracFactory getFactory(String Country){
        if(Country.equalsIgnoreCase("spain")){
            return new SpainFactory();
        }else if (Country.equalsIgnoreCase("usa")) {
            return new USAFactory();
        }else if (Country.equalsIgnoreCase("uk")){
            return new UKFactory();
        }else{
            System.out.println("Error con el país");
            return null;
        }

    }
}
