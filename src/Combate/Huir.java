/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

import java.util.Random;

public class Huir
{

	public static void huir(Jugador heroe, Enemigo enemigo, int vidaRes, int vidaResEn)
	{
		Random huir = new Random();
		if(huir.nextBoolean() == true)
		{
			vidaResEn = -800;
			enemigo.setVidaTemp(vidaResEn);
			System.out.println("");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("");
		}
	
		else
		{
			int dmgEnJuHu = enemigo.getAtq() - heroe.getDef();
			vidaRes = vidaRes - dmgEnJuHu;
			heroe.setVidaTemp(vidaRes);
			
			
			System.out.println("");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("");
			System.out.println(heroe.getNombre()+" no consigue huir del combate contra "+enemigo.getNombre()+".");
			System.out.println("");
			System.out.println(enemigo.getNombre()+" ataca a "+heroe.getNombre()+" y este recibe "+dmgEnJuHu+" puntos de danio.");
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
		
		if(vidaResEn == -800)
		{
			
			System.out.println("");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("");
			System.out.println(heroe.getNombre()+" consigue huir del combate contra "+enemigo.getNombre()+".");
			System.out.println("");
			System.out.println(heroe.getNombre()+": "+heroe.getVidaTemp()+" / "+heroe.getVida());
			System.out.println("");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("");
			
		}
	}
	
}
