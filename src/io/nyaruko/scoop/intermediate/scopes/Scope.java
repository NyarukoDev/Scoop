package io.nyaruko.scoop.intermediate.scopes;

import io.nyaruko.scoop.intermediate.PythonGenerator;
import io.nyaruko.scoop.intermediate.data.VariableData;
import io.nyaruko.scoop.intermediate.actions.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Abstract root type of all types of scope that generate Python
 */
public abstract class Scope implements PythonGenerator {
    /**
     * All Actions (Python code line equivalents) performed under this scope
     */
    protected final List<Action> actions = new ArrayList<>();
    /**
     * All variables available in this scope
     */
    public Map<String, VariableData> variables = new HashMap<>();

    /**
     * Add an action to this scope
     * @param action The action to add
     */
    public void addAction(Action action) {
        actions.add(action);
    }

    /**
     * @return An unmodifiable copy of {@link #actions}
     */
    public List<Action> getActions() {
        return Collections.unmodifiableList(actions);
    }
}
