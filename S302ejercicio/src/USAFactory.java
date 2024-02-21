public class USAFactory implements AbstracFactory{


    @java.lang.Override
    public Agentcontact getContact() {
        System.out.println("Creado contacto USA");
        return new USAcontact();
    }
}
