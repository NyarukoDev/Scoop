package ac.uk.rm16527.ce305.assign.intermediate.actions;

import ac.uk.rm16527.ce305.assign.intermediate.PythonGenerator;

/**
 * Action abstract class
 */
public abstract class Action implements PythonGenerator {
    /**
     * How is the scope depth affected by this action
     */
    public int controlChange;
    /**
     * The Action rule type
     */
    ActionType type;

    protected Action(ActionType type, int controlChange) {
        this.type = type;
        this.controlChange = controlChange;
    }
}
