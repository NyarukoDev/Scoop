package ac.uk.rm16527.ce305.assign.intermediate.actions;

/**
 * A SAFE block action. Increases scoping.
 */
public class SafeAction extends Action {
    public SafeAction() {
        super(ActionType.SAFE, 1);
    }

    @Override
    public String generatePython() {
        return "try:";
    }
}
