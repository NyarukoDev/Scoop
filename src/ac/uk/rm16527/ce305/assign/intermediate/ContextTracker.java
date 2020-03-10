package ac.uk.rm16527.ce305.assign.intermediate;

import java.util.HashMap;
import java.util.Map;

/**
 * Tool class for keeping track of accessed rules in a ParseTree
 */
public class ContextTracker {
    private Map<String, Integer> found = new HashMap<>();

    /**
     * Increments a tracker for context types
     * @param className The context class that was found
     */
    public int incrementTracker(String className) {
        int get = found.getOrDefault(className, -1) + 1;
        found.put(className, get);
        return get;
    }
}
