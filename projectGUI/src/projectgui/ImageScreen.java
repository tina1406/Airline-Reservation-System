/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Micha
 */
public class ImageScreen extends JPanel{
        
        BufferedImage image;
    public void paint (Graphics g){
        super.paintComponents(g);
        try{
            image = ImageIO.read(new File("C:\\Users\\Micha\\Desktop"));
        }catch(IOException e){
            e.printStackTrace();
            
        }
        
        g.drawImage(image, 50, 50, null);
        
    }
    
    
}
