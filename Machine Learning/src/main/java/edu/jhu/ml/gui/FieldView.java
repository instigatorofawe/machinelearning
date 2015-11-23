package edu.jhu.ml.gui;

import edu.jhu.ml.model.FieldModel;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * View
 * Created by Ran on 11/23/2015.
 */
public class FieldView extends JPanel implements Observer {

    private FieldModel model;

    public FieldView(FieldModel model) {
        this.setDoubleBuffered(true);

        model.addObserver(this);
        this.model = model;
    }

    protected void paintComponent(Graphics g) {
        //this.setBackground(Color.BLACK);

        g.drawString("This is my custom Panel!",10,20);
    }

    /**
     * Draws the field view.
     * @param g
     */
    public void paint(Graphics g) {

        this.setBackground(Color.black);

    }

    /**
     * Updates when model is updated.
     * @param o Observable that this watches.
     * @param arg Arguments.
     */
    public void update(Observable o, Object arg) {
        // TODO
    }

    /**
     * Draws an object.
     * @param g
     */
    private void draw(GraphicalRepresentation g) {
        // TODO
    }

    /**
     * Gets preferred size for this view.
     * @return Preferred size.
     */
    public Dimension getPreferredSize() {
        return new Dimension(1067, 600);
    }
}
