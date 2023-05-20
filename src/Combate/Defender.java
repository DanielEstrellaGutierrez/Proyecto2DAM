/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

/**
 *
 * @author Daniel
 */
public class Defender {
    public static void defender(Jugador heroe, Enemigo enemigo, int vidaRes)
	{
		
		int defMas = heroe.getDef() + 2;
		int dmgEnJuDef = enemigo.getAtq() - defMas;
		vidaRes = heroe.getVidaTemp() - dmgEnJuDef;
		heroe.setVidaTemp(vidaRes);
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		System.out.println(heroe.getNombre()+" se esta protegiendo del ataque de "+enemigo.getNombre()+".");
		System.out.println("");
		System.out.println(enemigo.getNombre()+" ataca a "+heroe.getNombre()+" y este recibe "+dmgEnJuDef+" puntos de danio.");
		System.out.println("");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		System.out.println(heroe.getNombre()+": "+heroe.getVidaTemp()+" / "+heroe.getVida());
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
