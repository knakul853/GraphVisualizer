package com.brunomnsilva.smartgraph.graphview;

import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

/**
 * A shape of an arrow to be attached to a {@link SmartGraphEdge}.
 * 
 * @author knakul853
 */
public class SmartArrow extends Path implements SmartStylableNode {
    
    public SmartArrow() {
        
        /* Create this arrow shape */
        getElements().add(new MoveTo(0, 0));  
        getElements().add(new LineTo(-5, 5));
        getElements().add(new MoveTo(0, 0));        
        getElements().add(new LineTo(-5, -5));    
        
        /* Add the corresponding css class */
        getStyleClass().add("arrow");        
    }
    
}
