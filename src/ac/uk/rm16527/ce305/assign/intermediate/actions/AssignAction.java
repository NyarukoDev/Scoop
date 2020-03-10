package ac.uk.rm16527.ce305.assign.intermediate.actions;

/**
 * An ASSIGN/OPERATORASSIGN action.
 */
public class AssignAction extends Action {
    /**
     * The variable label being assigned to
     */
    String label;
    /**
     * Must be Python-compliant
     */
    String pythonReturnable;
    /**
     * Any operation char being performed if this is being used as an OPERATORASSIGN
     */
    String opChar;

    public AssignAction(String label, String pythonReturnable) {
        this(label, pythonReturnable,"");
    }

    public AssignAction(String label, String pythonReturnable, String opChar) {
        super(ActionType.ASSIGN, 0);
        this.label = label;
        this.pythonReturnable = pythonReturnable;
        this.opChar = opChar.equals("^") ? "**" : opChar;//Converts to Python power if power specified
    }

    @Override
    public String generatePython() {
        return label + " " + opChar + "= " + pythonReturnable;
    }
}
