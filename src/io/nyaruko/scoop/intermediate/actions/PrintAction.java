package io.nyaruko.scoop.intermediate.actions;

/**
 * A Print action.
 */
public class PrintAction extends Action {
    /**
     * Must be Python-compliant
     */
    String pythonReturnable;

    public PrintAction(String pythonReturnable) {
        super(ActionType.PRINT, 0);
        this.pythonReturnable = pythonReturnable;
    }

    @Override
    public String generatePython()
    {
        return "print(" + pythonReturnable + ")";
    }
}
