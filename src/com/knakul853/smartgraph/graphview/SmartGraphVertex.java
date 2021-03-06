
package com.knakul853.smartgraph.graphview;

import com.knakul853.smartgraph.graph.Graph;
import com.knakul853.smartgraph.graph.Vertex;

/**
 * Abstracts the internal representation and behavior of a visualized graph vertex.
 * 
 * @param <V> Type stored in the underlying vertex
 * 
 * @see SmartGraphPanel
 * 
 * @author knakul853
 */
public interface SmartGraphVertex<V> extends SmartStylableNode {
    
    /**
     * Returns the underlying (stored reference) graph vertex.
     * 
     * @return vertex reference 
     * 
     * @see Graph
     */
    public Vertex<V> getUnderlyingVertex();
    
    /**
     * Sets the position of this vertex in panel coordinates. 
     * 
     * Apart from its usage in the {@link SmartGraphPanel}, this method
     * should only be called when implementing {@link SmartPlacementStrategy}.
     * 
     * @param x     x-coordinate for the vertex
     * @param y     y-coordinate for the vertex
     */
    public void setPosition(double x, double y);
    
    /**
     * Return the center x-coordinate of this vertex in panel coordinates.
     * 
     * @return     x-coordinate of the vertex 
     */
    public double getPositionCenterX();
    
    /**
     * Return the center y-coordinate of this vertex in panel coordinates.
     * 
     * @return     y-coordinate of the vertex 
     */
    public double getPositionCenterY();
    
    /**
     * Returns the circle radius used to represent this vertex.
     * 
     * @return      circle radius
     */
    public double getRadius();
}
