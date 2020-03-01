
package com.knakul853.smartgraph.graphview;

/**
 * A stylable node can have its css properties changed at runtime.
 * <br>
 * All Java FX nodes used by {@link SmartGraphPanel} to represent graph entities
 * should implement this interface.
 * 
 * @see SmartGraphPanel
 * 
 * @author knakul853
 */
public interface SmartStylableNode {    
    
    /**
     * Applies the <code>css</code> styles to the node.
     * 
     * Note that JavaFX styles are cumulative.
     * 
     * @param css styles
     */
    public void setStyle(String css);
}
