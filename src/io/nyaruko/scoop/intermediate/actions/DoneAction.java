package io.nyaruko.scoop.intermediate.actions;

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
