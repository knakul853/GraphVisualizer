
package com.knakul853.smartgraph.graphview;

import com.knakul853.smartgraph.graph.Edge;
import com.knakul853.smartgraph.graph.Vertex;

/**
 * A graph edge visually connects two {@link Vertex} of type <code>V</code>.
 * <br>
 * Concrete edge implementations used by {@link SmartGraphPanel} should
 * implement this interface as this type is the only one exposed to the user.
 * 
 * @param <E> Type stored in the underlying edge
 * @param <V> Type of connecting vertex
 *
 * @see Vertex
 * @see SmartGraphPanel
 * 
 * @author knakul853
 */
public interface SmartGraphEdge<E, V> extends SmartStylableNode {
    
     /**
     * Returns the underlying (stored reference) graph edge.
     * 
     * @return edge reference 
     * 
     * @see SmartGraphPanel
     */
    public Edge<E, V> getUnderlyingEdge();
}
