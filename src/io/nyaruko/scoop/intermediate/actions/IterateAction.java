package io.nyaruko.scoop.intermediate.actions;

/**
 * An ITERATE action. Increases scoping.
 */
public class IterateAction extends Action {
    String booleanStatement;

    public IterateAction(String booleanStatement) {
        super(ActionType.ITERATE, 1);
        this.booleanStatement = booleanStatement;
    }

    @Override
    public String generatePython() {
        return "while " + booleanStatement +":";
    }
}
