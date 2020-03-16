package io.nyaruko.scoop.intermediate.scopes;

/**
 * Control Flow level scope used mainly for the program stack's variable tracking sake.
 */
public class ControlScope extends Scope {
    @Override
    public String generatePython() {
        return "";
    }
}
