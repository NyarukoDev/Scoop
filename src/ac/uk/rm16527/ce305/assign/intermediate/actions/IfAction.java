package ac.uk.rm16527.ce305.assign.intermediate.actions;

/**
 * An IFSTATEMENT/ELSEIF block action. Increases scoping. Supports both if and else if
 */
public class IfAction extends Action {
    private String condition;
    boolean isElse;

    public IfAction(String condition, boolean isElse) {
        super(ActionType.IFSTATEMENT, 1);
        this.condition = condition;
        this.isElse = isElse;
    }

    @Override
    public String generatePython() {
        return (isElse?"el":"") + "if " + condition + ":";
    }
}
