/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laberinto;

/**
 *
 * @author Daniel
 */
public class Casilla
{
    public String tipo;
	public int posX;
	public int posY;
	
	
	public Casilla(String tipo, int posX, int posY)
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
}
