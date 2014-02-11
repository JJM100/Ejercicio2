package com.componentes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class FancyButton extends JComponent {

      public void paintComponent(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

}
