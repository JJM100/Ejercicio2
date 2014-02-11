
package com.componentes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class FancyButton2 extends JComponent{
    
    public void paintComponent(Graphics graphics) {
       graphics.setColor(Color.gray);
        graphics.fillRoundRect(2, 2, this.getWidth() -4, this.getHeight()-4, 30, 30);
    }

}
