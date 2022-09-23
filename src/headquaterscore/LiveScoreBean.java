/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterscore;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author HP
 */
public class LiveScoreBean implements Serializable {
    
    public static final String PROP_Score_PROPERTY = "Score";
    
    private String Score;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScore() {
        return Score;
    }
    
    public void setScore(String value) {
        String oldValue = Score;
        Score = value;
        propertySupport.firePropertyChange(PROP_Score_PROPERTY, oldValue, Score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
