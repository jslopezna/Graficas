/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JFrame;


public class Board extends JPanel implements ActionListener{
    private int xref;
    private int yref;
    private Timer timer; 
    
    public Board(){
      this.xref = 10;
      this.yref = 0;
      this.timer = new Timer(25, this);
      this.timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        Image fondo = loadImage("blue_background.png");
        for(int i=0;  i<1024;i++){
        g.drawImage(fondo, i, -300,this);
        }
        Image gato= loadImage("cats.gif");
        g.drawImage(gato,30,350, 162,430,0,0,132,80, this); 
        //g.drawImage(gato,162,180,264,80,132,80,264,80,this);
        
        
        g.drawRect(this.xref,50 ,20, 20);
        Rectangle carro = new Rectangle(this.xref,50 ,20, 20);
         
        
        g.fillOval(40, this.yref, 15, 15);
        Rectangle oval = new Rectangle(40, this.yref, 15, 15);
        
        //if(carro.intersects(oval)){
         // this.timer.stop();
        //}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.xref++;
        this.yref++;
        repaint();
    }

   public Image loadImage(String imageName){
       ImageIcon ii=new ImageIcon (imageName); 
       Image image= ii.getImage(); 
       return image; 
   }

    
}