package io.nyaruko.scoop.intermediate.actions;

/**
 * An ONFAIL block action. Increases scoping.
 */
public class OnFailAction extends Action {

    public OnFailAction() {
        super(ActionType.ONFAIL, 1);
    }

    @Override
    public String generatePython() {
        return "except:";
    }
}
