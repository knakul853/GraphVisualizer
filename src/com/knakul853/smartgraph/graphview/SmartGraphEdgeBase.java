package com.knakul853.smartgraph.graphview;

/**
 * Used as a super-type for all different concrete edge implementations by
 * {@link SmartGraphPanel}, e.g., line and curves.
 * <br>
 * An edge can have an attached arrow.
 * 
 * @param <E> Type stored in the underlying edge
 * @param <V> Type of connecting vertex
 * 
 * @see SmartArrow
 * @see SmartGraphEdge
 * @see SmartLabelledNode
 * @see SmartGraphPanel
 * 
 * @author knakul853
 */
public interface SmartGraphEdgeBase<E, V> extends SmartGraphEdge<E, V>, SmartLabelledNode {
    
    /**
     * Attaches a {@link SmartArrow} to this edge, binding its position/rotation.
     * 
     * @param arrow     arrow to attach
     */
    public void attachArrow(SmartArrow arrow);
    
    /**
     * Returns the attached {@link SmartArrow}, if any.
     * 
     * @return      reference of the attached arrow; null if none.
     */
    public SmartArrow getAttachedArrow();
    
}
