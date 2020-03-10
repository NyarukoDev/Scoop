package ac.uk.rm16527.ce305.assign.intermediate.actions;

/**
 * An OTHERWISE block action. Increases scoping.
 */
public class OtherwiseAction extends Action {

    public OtherwiseAction() {
        super(ActionType.ELSESTATEMENT, 1);
    }

    @Override
    public String generatePython() {
        return "else:";
    }
}
