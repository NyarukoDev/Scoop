package ac.uk.rm16527.ce305.assign.intermediate.actions;

/**
 * A RESULT return action
 */
public class ResultAction extends Action {
    /**
     * Must be Python-compliant
     */
    String pythonReturnable;

    public ResultAction(String pythonReturnable) {
        super(ActionType.RESULT, 0);
        this.pythonReturnable = pythonReturnable;
    }

    @Override
    public String generatePython() {
        return "return" + (!pythonReturnable.isEmpty() ? " " + pythonReturnable : "");//Can just be plain return for voids
    }
}
