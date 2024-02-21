public class SpainFactory implements AbstracFactory{


    public AgentContact getContact() {
        System.out.println("Creado contacto España");
        return new SpainContact();
    }
}
