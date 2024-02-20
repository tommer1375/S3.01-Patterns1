import java.util.*;

public class Undo {

    private static Undo instance;
    private List<String> undoVariable;
    private Undo() {
            undoVariable = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
            System.out.println("Instancia vacía, se ha creado una nueva");
        }else{
            System.out.println("Instancia ya está creada");
        }
        return instance;
    }

    public void createUndo (String newVariable) {
        undoVariable.add(newVariable);
        System.out.println("Se ha añadido "+newVariable);
    }

    public void deleteUndo(int number) {
        String deleteorder = undoVariable.get(number);
        undoVariable.remove(number);
        System.out.println("Se ha elimiando el " +deleteorder);

    }
    public void printUndo() {
        int i;
        for (i=0; i<undoVariable.size(); i++) {
            System.out.println(undoVariable.get(i));
        }
    }
}
