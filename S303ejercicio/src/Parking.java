import java.util.*;
public class Parking {

    private List<Operator> operations = new ArrayList<>();

    public void receiveOperations (Operator operation){
        operations.add(operation);
    }
    public void doingOperations (){
        System.out.println( "Ejecutando acciones:");
        operations.forEach(x->x.execute());
        operations.clear();

    }
}
