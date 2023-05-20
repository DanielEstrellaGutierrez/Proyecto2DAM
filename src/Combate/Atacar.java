/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

/**
 *
 * @author Daniel
 */
public class Atacar {
    //En la clase jugador cogeré los datos de la base de datos y de enemigo lo mismo
    public static void atacar(Jugador heroe, Enemigo enemigo, int vidaResEn, int vidaRes) {
	int dmgJuEn = heroe.getAtq() - enemigo.getDef();
	int dmgEnJu = enemigo.getAtq() - heroe.getDef();
	vidaResEn = vidaResEn - dmgJuEn;
	vidaRes = vidaRes - dmgEnJu;
	heroe.setVidaTemp(vidaRes);
	enemigo.setVidaTemp(vidaResEn);
	System.out.println("");
	System.out.println("-----------------------------------------------------------------");
	System.out.println("");
	System.out.println(heroe.getNombre()+" ataca a "+enemigo.getNombre()+" y causa "+dmgJuEn+" puntos de danio.");
	System.out.println("");
	System.out.println(enemigo.getNombre()+" ataca a "+heroe.getNombre()+" y este recibe "+dmgEnJu+" puntos de danio.");
	System.out.println("");
	System.out.println("-----------------------------------------------------------------");
	System.out.println("");
	System.out.println(heroe.getNombre()+": "+heroe.getVidaTemp()+" / "+heroe.getVida());
	//System.out.println(enemigo.getNombre()+": "+enemigo.getVidaTemp()+" / "+enemigo.getVida());
	System.out.println("");
	System.out.println("?Que accion tomara "+heroe.getNombre()+" ahora?");
	System.out.println("");
	System.out.println("-----------------------------------------------------------------");
	System.out.println("");
	System.out.println("");
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println("");
	System.out.println("Pulsa 1 para ATACAR.");
	System.out.println("Pulsa 2 para DEFENDERTE.");
	System.out.println("Pulsa 3 para usar un OBJETO CURATIVO.");
	System.out.println("Pulsa 4 para HUIR del combate.");
	System.out.println("");
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println("");
	}
}
