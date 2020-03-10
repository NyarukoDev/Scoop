package ac.uk.rm16527.ce305.assign.intermediate.data;

/**
 * A parameter for a function signature
 */
public class Parameter {
    public String label;
    public Type type;

    public Parameter(String label, Type type) {
        this.label = label;
        this.type = type;
    }
}
