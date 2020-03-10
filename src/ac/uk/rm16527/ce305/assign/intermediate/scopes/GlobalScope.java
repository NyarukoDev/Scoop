package ac.uk.rm16527.ce305.assign.intermediate.scopes;

/**
 * Generates global variables and a main method call if needed
 */
public class GlobalScope extends Scope {
    @Override
    public String generatePython() {
        StringBuilder python = new StringBuilder();
        //Set up global variables
        variables.entrySet().forEach(v -> python.append(v.getKey()).append(" = ").append(v.getValue().initData).append("\n"));
        actions.forEach(a -> python.append(a.generatePython()));
        return python.toString();
    }
}
