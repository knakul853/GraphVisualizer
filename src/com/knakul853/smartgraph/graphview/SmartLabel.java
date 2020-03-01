package com.knakul853.smartgraph.graphview;

import javafx.scene.text.Text;

/**
 * A label contains text and can be attached to any {@link SmartLabelledNode}.
 * <br>
 * This class extends from {@link Text} and is allowed any corresponding
 * css formatting.
 * 
 * @author Nakul Bharti
 */
public class SmartLabel extends Text implements SmartStylableNode {

    public SmartLabel() {
    }

    public SmartLabel(String text) {
        super(text);
    }

    public SmartLabel(double x, double y, String text) {
        super(x, y, text);
    }
    
}
