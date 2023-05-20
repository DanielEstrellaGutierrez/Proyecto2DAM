/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

/**
 *
 * @author Daniel
 */
import java.util.*;

public class Jugador extends Estadisticas
{
	
	/* CONSTRUCTOR DE JUGADOR */
	
	public Jugador(String nombre,int vidaTemp, int vida, int atq, int def, int pExp, int oro, int fallar, int critico, int nivel)
	{
		super(nombre, vida, atq, def, pExp, oro, fallar, critico, nivel);
	}

	public Jugador agregar()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("");
		System.out.println("Introduce tu nombre:");
		System.out.println("");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		String nombre = sc.next();
		int vida = 25;
		int vidaTemp = vida;
		int atq = 7;
		int def = 6;
		int pExp = 20;
		int oro = 10;
		int fallar = 20;
		int critico = 10;
		int nivel = 1;
		Jugador prota = new Jugador(nombre, vidaTemp, vida, atq, def, pExp, oro, fallar, critico, nivel);
		return prota;
	}
}
