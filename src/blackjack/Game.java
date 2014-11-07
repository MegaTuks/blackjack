/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package blackjack;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException; 
import java.lang.Math;
import java.util.LinkedList;

/**
 *
 * @author Tuks
 */
public class Game extends JFrame implements Runnable, KeyListener {
  
   int puntaje;
   int numCartas;
   char palo;
   int valorCarta;
   int acum;
   boolean playJug;
   boolean playDeal;
   Carta[] mano;
   
   public void init()
   {
         puntaje=0;
         numCartas=52;
         acum=0;
         playJug =false;
         playDeal =false;
         
   }
   
   
      
    public Game() {
        init();
        start();
        
    }
    
     public void start () {
               // Declaras un hilo
               Thread th = new Thread (this);
               // Empieza el hilo
               th.start ();
       }
        public void run () {
            //Guarda el tiempo actual del sistema
            
            while (true) {
                //actualiza();
                
                repaint();    // Se actualiza el <code>Applet</code> repintando el contenido.
                try	{
                        // El thread se duerme.
                        Thread.sleep (20);
                }
                catch (InterruptedException ex)	{
                        System.out.println("Error en " + ex.toString());
                }
            }
        }
        
        public void Deal()
        {
            playJug = true;
            for (int i=0;i<2;i++)
            {
                
            }
        }
        
	public void keyPressed(KeyEvent e) 
        {
            /*
             * DEAL
             * Se inicia el juego.
             */
            if (e.getKeyCode() == KeyEvent.VK_Z) 
            {    
                if (!playDeal && !playJug)
                {
                    Deal();
                }
            }
            /*
             * HIT
             * Se recibe una carta nueva.
             */
            else if (e.getKeyCode() == KeyEvent.VK_X) 
            {    
		if (!playDeal && playJug)
                {
                    Hit();
                }
            } 
            /*
             * STAND
             * Termina turno de jugador, empieza el del dealer.
             */
            else if (e.getKeyCode() == KeyEvent.VK_C) 
            {    
		if (!playDeal && playJug)
                {
                    Stand();
                }
            }
        }
    
    public void keyTyped(KeyEvent e){
    }
    
    public void keyReleased(KeyEvent e){
    	
    }
 
        
 
    
}
