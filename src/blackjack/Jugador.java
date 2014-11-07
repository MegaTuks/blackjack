/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author juan__000
 */
public class Jugador {
    private Mano mano;
    private Carta[] carta;
    private int puntaje;
    public int getPuntaje(){return puntaje;}
    public void getCarta(){return carta;}
    public void hit(){return getCarta();}
    public bool stand(){return true;}
}
