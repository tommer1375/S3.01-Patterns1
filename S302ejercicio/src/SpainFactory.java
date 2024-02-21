public class SpainFactory implements AbstracFactory{


    public Agentcontact getContact() {
        System.out.println("Creado contacto España");
        return new Spaincontact();
    }
}
