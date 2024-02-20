import java.util.*;

public class Main {
    public static void main(String[] args) {

            Undo undoVariable1 = Undo.getInstance();
          
            undoVariable1.createUndo("Pedido 1");
            undoVariable1.createUndo("Pedido 2");
            undoVariable1.createUndo("Pedido 3");
            undoVariable1.createUndo("Pedido 4");
            undoVariable1.createUndo("Pedido 5");

            undoVariable1.printUndo();
            int number=(int)Math.floor(Math.random()*5);
            undoVariable1.deleteUndo(number);
            undoVariable1.printUndo();
    }

}
