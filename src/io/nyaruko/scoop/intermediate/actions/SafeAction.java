package io.nyaruko.scoop.intermediate.actions;

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
