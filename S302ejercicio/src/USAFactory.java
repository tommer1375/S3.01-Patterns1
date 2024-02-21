public class USAFactory implements AbstracFactory{


    @java.lang.Override
    public AgentContact getContact() {
        System.out.println("Creado contacto USA");
        return new USAContact();
    }
}
