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

public class Tablero
{
	public String suelo = "suelo";
	public String pared = "pared";
	public String escalera = "escalera";
	public String cofre = "cofre";
        public String pAparicion = "pAparicion";
        public String boss = "boss";
	
	
	public Tablero() {
	}
	
        //Tablero de la planta 1
	public void tablero1() {
	Casilla[][] casillas = new Casilla[5][5];
        //La primera vez el jugador aparecerá en x=2 y=1
        
        
        //Se pone todo suelo y luego se sobreescribe el tipo de casilla
	for (int x = 0; x < 5; x++) {
	    for (int y = 0; y < 5; y++) {
	        casillas[x][y] = new Casilla(suelo,x, y);
                
                //Paredes de los cuatro lados
                    if (x == 0 && y == 0 || x ==4 && y == 4 || x ==4 && y ==0 || x ==0 && y==4)
                    {
                        casillas[x][y] = new Casilla(pared,x, y);
                    }
                //Pared que hace un pasillo (izquierda)
                    if (x == 1 && y == 2)
                    {
                        casillas[x][y] = new Casilla(pared,x, y);
                    }
                //Pared que hace un pasillo (derecha)
                    if (x == 3 && y == 2)
                    {
                        casillas[x][y] = new Casilla(pared,x, y);
                    }
                
                //Cuando el jugador baje por esta escalera aparecerá en x=2 y=3
                //Escalera de subida de planta
                    if (x == 2 && y == 4)
                    {
                        casillas[x][y] = new Casilla(escalera,x,y);
                    }
                //Cofre
                    if (x == 3 && y ==3)
                    {
                        casillas[x][y] = new Casilla(cofre,x,y);
                    }
                    
                }
		}

	}
}
