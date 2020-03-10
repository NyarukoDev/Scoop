package ac.uk.rm16527.ce305.assign.intermediate.data;

import ac.uk.rm16527.ce305.assign.intermediate.PythonGenerator;

/**
 * Variable data holder
 */
public class VariableData implements PythonGenerator {
    /**
     * The type of data stored
     */
    public final Type type;
    /**
     * The currently stored data
     */
    public String data;
    /**
     * Initially assigned data
     */
    public final String initData;

    /**
     * Creates a VariableData object
     * @param type The type of data
     * @param data Must be Python-compliant
     */
    public VariableData(Type type, String data) {
        this.type = type;
        this.data = initData = data;
    }

    @Override
    public String generatePython() {
        return data;
    }
}
