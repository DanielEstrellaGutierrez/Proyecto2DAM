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
        public String curacion = "curación";
	
	
	public Tablero() {
	}
	
        //Tablero de la planta 1
	public void tablero() {
	Casilla[][] planta1 = new Casilla[5][5];
        //La primera vez el jugador aparecerá en x=2 y=1
        
        
        //Se pone todo suelo y luego se sobreescribe el tipo de casilla
	for (int x = 0; x < 5; x++) {
	    for (int y = 0; y < 5; y++) {
	        planta1[x][y] = new Casilla(suelo,x, y);
                
                //Paredes de los cuatro lados
                    if (x == 0 && y == 0 || x ==4 && y == 4 || x ==4 && y ==0 || x ==0 && y==4)
                    {
                        planta1[x][y] = new Casilla(pared,x, y);
                    }
                //Pared que hace un pasillo (izquierda)
                    if (x == 1 && y == 2)
                    {
                        planta1[x][y] = new Casilla(pared,x, y);
                    }
                //Pared que hace un pasillo (derecha)
                    if (x == 3 && y == 2)
                    {
                        planta1[x][y] = new Casilla(pared,x, y);
                    }
                
                //Cuando el jugador baje por esta escalera aparecerá en x=2 y=3
                //Escalera de subida de planta
                    if (x == 2 && y == 4)
                    {
                        planta1[x][y] = new Casilla(escalera,x,y);
                    }
                //Cofre
                    if (x == 3 && y ==3)
                    {
                        planta1[x][y] = new Casilla(cofre,x,y);
                    }
                //Boss
                   if (x == 2 && y ==2)
                    {
                        planta1[x][y] = new Casilla(boss,x,y);
                    } 
                }
		}
        //Planta 2
        Casilla[][] planta2 = new Casilla[8][5];
        //Se pone todo suelo y luego se sobreescribe el tipo de casilla
	for (int x = 0; x < 8; x++) {
	    for (int y = 0; y < 5; y++) {
	        planta2[x][y] = new Casilla(suelo,x, y);
                
                //Paredes de los cuatro lados
                    if (x == 0 && y == 0 || x ==7 && y == 4 || x ==7 && y ==0 || x ==0 && y==4)
                    {
                        planta2[x][y] = new Casilla(pared,x, y);
                    }
                //Paredes que hacen esquinas
                    if (x == 3 && y == 3)
                    {
                        planta2[x][y] = new Casilla(pared,x, y);
                    }
                
                    if (x == 3 && y == 2)
                    {
                        planta2[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 2 && y == 2)
                    {
                        planta2[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 5 && y == 1)
                    {
                        planta2[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 5 && y == 2)
                    {
                        planta2[x][y] = new Casilla(pared,x, y);
                    }
                //Cuando el jugador suba por esta escalera aparecerá en x==2 y==3
                //Escalera de bajada a la planta 1
                    if (x == 2 && y == 4)
                    {
                        planta2[x][y] = new Casilla(escalera,x,y);
                    }
                //Cuando el jugador baje por esta escalera aparecerá en x==6 y==1
                //Escalera de subida de planta
                    if (x == 7 && y == 1)
                    {
                        planta2[x][y] = new Casilla(escalera,x,y);
                    }
                //Cofre
                    if (x == 1 && y ==3)
                    {
                        planta2[x][y] = new Casilla(cofre,x,y);
                    }
                    
                //Boss
                    if (x == 6 && y == 3)
                    {
                        planta2[x][y] = new Casilla(boss,x,y);
                    }
                    
                }
		}
                //Planta 3
        Casilla[][] planta3 = new Casilla[8][5];
        //Se pone todo suelo y luego se sobreescribe el tipo de casilla
	for (int x = 0; x < 8; x++) {
	    for (int y = 0; y < 5; y++) {
	        planta3[x][y] = new Casilla(suelo,x, y);
                
                //Paredes de los cuatro lados
                    if (x == 0 && y == 0 || x ==7 && y == 4 || x ==7 && y ==0 || x ==0 && y==4)
                    {
                        planta3[x][y] = new Casilla(pared,x, y);
                    }
                //Paredes que hacen esquinas
                    if (x == 2 && y == 3)
                    {
                        planta3[x][y] = new Casilla(pared,x, y);
                    }
                
                    if (x == 2 && y == 2)
                    {
                        planta3[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 4 && y == 1)
                    {
                        planta3[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 4 && y == 2)
                    {
                        planta3[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 6 && y == 2)
                    {
                        planta3[x][y] = new Casilla(pared,x, y);
                    }
                    if (x == 6 && y == 3)
                    {
                        planta3[x][y] = new Casilla(pared,x, y);
                    }
                //Cuando el jugador suba por esta escalera aparecerá en x==1 y==3
                //Escalera de bajada a la planta 2
                    if (x == 1 && y == 4)
                    {
                        planta3[x][y] = new Casilla(escalera,x,y);
                    }
                //Cuando el jugador baje por esta escalera aparecerá en x==5 y==1
                //Escalera de subida de planta
                    if (x == 6 && y == 1)
                    {
                        planta3[x][y] = new Casilla(escalera,x,y);
                    }
                //Boss
                if (x == 5 && y == 2)
                    {
                        planta3[x][y] = new Casilla(escalera,x,y);
                    }
                  
                }
		}
        
                //Planta 4
        Casilla[][] planta4 = new Casilla[8][5];
        //Se pone todo suelo y luego se sobreescribe el tipo de casilla
	for (int x = 0; x < 8; x++) {
	    for (int y = 0; y < 5; y++) {
	        planta4[x][y] = new Casilla(suelo,x, y);
                
                //Paredes de los cuatro lados
                    if (x == 0 && y == 0 || x ==7 && y == 4 || x ==7 && y ==0 || x ==0 && y==4)
                    {
                        planta4[x][y] = new Casilla(pared,x, y);
                    }
                //Paredes que hacen esquinas
                    if (x == 2 && y == 1)
                    {
                        planta4[x][y] = new Casilla(pared,x, y);
                    }
                
                    if (x == 2 && y == 2)
                    {
                        planta4[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 3 && y == 2)
                    {
                        planta4[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 4 && y == 2)
                    {
                        planta4[x][y] = new Casilla(pared,x, y);
                    }
                    
                    if (x == 5 && y == 2)
                    {
                        planta4[x][y] = new Casilla(pared,x, y);
                    }
                    
                //Cuando el jugador suba por esta escalera aparecerá en x==1 y==1
                //Escalera de bajada a la planta 3
                    if (x == 1 && y == 0)
                    {
                        planta4[x][y] = new Casilla(escalera,x,y);
                    }
                //Cuando el jugador baje por esta escalera aparecerá en x==3 y==1
                //Escalera de subida de planta
                    if (x == 3 && y == 1)
                    {
                        planta4[x][y] = new Casilla(escalera,x,y);
                    }
                //Casilla de curación
                  if (x == 6 && y == 1)
                    {
                        planta4[x][y] = new Casilla(curacion,x,y);
                    }
                //Casillas del jefe de la planta 4
                if (x == 4 && y == 1)
                    {
                        planta4[x][y] = new Casilla(boss,x,y);
                    }
                }
		}
        //Planta 5
                Casilla[][] planta5 = new Casilla[5][5];
        
        //Se pone todo suelo y luego se sobreescribe el tipo de casilla
	for (int x = 0; x < 5; x++) {
	    for (int y = 0; y < 5; y++) {
	        planta5[x][y] = new Casilla(suelo,x, y);
                
                //Paredes de los cuatro lados
                    if (x == 0 && y == 0 || x ==4 && y == 4 || x ==4 && y ==0 || x ==0 && y==4)
                    {
                        planta5[x][y] = new Casilla(pared,x, y);
                    }
                //Pared que hace un pasillo (izquierda)
                    if (x == 1 && y == 2)
                    {
                        planta5[x][y] = new Casilla(pared,x, y);
                    }
                //Pared que hace un pasillo (derecha)
                    if (x == 3 && y == 2)
                    {
                        planta5[x][y] = new Casilla(pared,x, y);
                    }
                
                //Cuando el jugador suba por esta escalera aparecerá en x=2 y=3
                //Escalera de bajada a la planta 4
                    if (x == 2 && y == 1)
                    {
                        planta5[x][y] = new Casilla(escalera,x,y);
                    }
                //Cofres
                    if (x == 3 && y ==3)
                    {
                        planta5[x][y] = new Casilla(cofre,x,y);
                    }
                    if (x == 3 && y ==1)
                    {
                        planta5[x][y] = new Casilla(cofre,x,y);
                    }
                    if (x == 1 && y ==3)
                    {
                        planta5[x][y] = new Casilla(cofre,x,y);
                    }
                    
                //Curación
                    if (x == 1 && y ==1)
                    {
                        planta5[x][y] = new Casilla(curacion,x,y);
                    }
                //Boss
                   if (x == 2 && y ==4)
                    {
                        planta5[x][y] = new Casilla(boss,x,y);
                    } 
                }
		}
        
	}
        
        
}
