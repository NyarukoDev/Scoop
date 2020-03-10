package ac.uk.rm16527.ce305.assign.intermediate.actions;

/**
 * A DONE action. Decreases scoping.
 */
public class DoneAction extends Action {
    public DoneAction() {
        super(ActionType.DONE, -1);
    }

    @Override
    public String generatePython() {
        return "";
    }
}
