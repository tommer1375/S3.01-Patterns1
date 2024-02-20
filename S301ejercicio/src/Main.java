import java.util.*;

public class Main {
    public static void main(String[] args) {

            Undo undoVariable1 = Undo.getInstance();
          
            undoVariable1.createUndo("Pedido 1");
            undoVariable1.createUndo("Pedido 2");
            undoVariable1.createUndo("Pedido 3");


            undoVariable1.printUndo();
            undoVariable1.deleteUndo(1);
            undoVariable1.printUndo();

    }

}