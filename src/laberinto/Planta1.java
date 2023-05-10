/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laberinto;

/**
 *
 * @author Daniel
 */
//La clase tablero  constará de un array bidimensional del objeto casilla, con algun método para editar el tipo de la casilla segun 
//su posicion, luego en la clase main se crean los objetos de tablero planta1, planta2....

public class Planta1
{
	public String suelo = "suelo";
	public String pared = "pared";
	public String escalera = "escalera";
	public String cofre = "cofre";
	
	
	public Planta1() {
	}
	
	public void tablero1() {
	Casilla[][] casillas = new Casilla[5][5];

	for (int x = 0; x < 5; x++) {
	    for (int y = 0; y < 5; y++) {
	        casillas[x][y] = new Casilla(suelo,x, y);
	        if(x == 0 || x == 4)
                {
                    casillas[x][y] = new Casilla(pared,x, y);
                }
	    }
		}

	}
}
