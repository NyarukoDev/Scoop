package ac.uk.rm16527.ce305.assign.intermediate.scopes;

import ac.uk.rm16527.ce305.assign.intermediate.PythonGenerator;
import ac.uk.rm16527.ce305.assign.intermediate.actions.RunAction;

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract representation of a Scoop program. Used by the compiler for converting to Python
 */
public class Program implements PythonGenerator {
    /**
     * Map of functions
     */
    public Map<String, FunctionScope> scopes = new HashMap<>();
    /**
     * Whether a main function exists
     */
    public boolean hasEntryPoint = false;
    /**
     * Globally accessible var storage
     */
    public Scope globalScope = new GlobalScope();

    public String generatePython() {
        StringBuilder python = new StringBuilder();

        //Populate functions
        scopes.values().forEach(scope -> python.append(scope.generatePython()).append("\n\n"));

        //Append global statements
        if(globalScope.getActions().isEmpty() && hasEntryPoint)
            globalScope.addAction(new RunAction(scopes.get("entryPoint")));
        python.append(globalScope.generatePython());

        return python.toString();
    }
}
