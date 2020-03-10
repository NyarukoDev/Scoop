package ac.uk.rm16527.ce305.assign.intermediate.actions;

import ac.uk.rm16527.ce305.assign.intermediate.data.VariableData;
import ac.uk.rm16527.ce305.assign.intermediate.scopes.FunctionScope;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A RUN action.
 */
public class RunAction extends Action {
    FunctionScope functionScope;
    VariableData[] parameters;

    public RunAction(FunctionScope func, VariableData... parameters) {
        super(ActionType.RUN, 0);
        this.functionScope = func;
        this.parameters = parameters;
    }

    @Override
    public String generatePython() {
        //Build list of parameters inputted
        List<String> list = parameters != null ? Arrays.stream(parameters).map(VariableData::generatePython).collect(Collectors.toList()) : Collections.emptyList();
        return functionScope.label + "(" + String.join(", ", list) + ")";
    }
}
