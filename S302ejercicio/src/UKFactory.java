public class UKFactory implements AbstracFactory{

    public AgentContact getContact() {
        System.out.println("Creado contacto UK");
        return new UKContact();
    }
}
