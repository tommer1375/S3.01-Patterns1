public class UKFactory implements AbstracFactory{

    public Agentcontact getContact() {
        System.out.println("Creado contacto UK");
        return new UKcontact();
    }
}
