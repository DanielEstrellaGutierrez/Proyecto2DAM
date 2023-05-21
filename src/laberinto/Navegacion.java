/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laberinto;

/**
 *
 * @author Daniel
 */
public class Navegacion {
    
    public String tipo;
    public int posX;
    public int posY;
    
    public Navegacion(String tipo, int posX, int posY)
	{
		this.tipo = tipo;
		this.posX = posX;
		this.posY = posY;
	}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public void moverJugador(int x, int y) {
        if (x >= 0 && x < tablero.length && y >= 0 && y < tablero[0].length) {
            jugadorX = x;
            jugadorY = y;
        } else {
            System.out.println("Movimiento inválido. Inténtalo de nuevo.");
        }
    }
}
