import java.util.*;

public class Main {
    public static void main(String[] args) {

        AbstracFactory SpainFactory = FactoryMaker.getFactory("Spain");
        AbstracFactory USAFactory = FactoryMaker.getFactory("USA");
        AbstracFactory UKFactory = FactoryMaker.getFactory("UK");

        AgentContact contact1 = SpainFactory.getContact();
        AgentContact contact2 = USAFactory.getContact();
        AgentContact contact3 = UKFactory.getContact();


        contact1.createAddress("\nCalle Marina 337 7-2 08025 Barcelona");
        contact1.createPhone("+34 48598765");
        contact2.createAddress("\n30, 150 East 58th St, Planta 30, New York, NY 10155");
        contact2.createPhone("+1 212-355-4080");
        contact3.createAddress("\nSt Paul’s Churchyard, ECM4M 8BX");
        contact3.createPhone("+44 20 7606 3030");


        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);





    }
}