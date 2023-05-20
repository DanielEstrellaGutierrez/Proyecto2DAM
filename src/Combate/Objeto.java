/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

/**
 *
 * @author Daniel
 */


public class Objeto
{
	
	/* CONSTRUCTOR OBJETO */

	private String tipo;
	private String nombre;
	private int ataque;
	private int defensa;
	private boolean equipable;
	private boolean equipado;
	private int recupera;
	private int cantidad;
	
	public Objeto(String tipo, String nombre, int ataque, int defensa, boolean equipable, boolean equipado, int recupera, int cantidad)
	{
		this.tipo = tipo;
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.equipable = equipable;
		this.equipado = equipado;
		this.recupera = recupera;
		this.cantidad = cantidad;
	}
	
	/* GETTER Y SETTER OBJETO */
	
	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getAtaque()
	{
		return ataque;
	}

	public void setAtaque(int ataque)
	{
		this.ataque = ataque;
	}

	public int getDefensa()
	{
		return defensa;
	}

	public void setDefensa(int defensa)
	{
		this.defensa = defensa;
	}

	public boolean getEquipable()
	{
		return equipable;
	}

	public void setEquipable(boolean equipable)
	{
		this.equipable = equipable;
	}
	
	public boolean getEquipado()
	{
		return equipado;
	}

	public void setEquipado(boolean equipado)
	{
		this.equipado = equipado;
	}

	public int getRecupera()
	{
		return recupera;
	}

	public void setRecupera(int recupera)
	{
		this.recupera = recupera;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public String toString()
	{
		
		String frase;
		System.out.println("5");
		frase = "Tipo de objeto: "+ this.getTipo();
		System.out.println("6");
		frase = frase+" | Nombre del objeto: "+ this.getNombre();
		System.out.println("7");
		frase = frase+" | "+" | Ataque: "+this.getAtaque()+" | "+" | Defensa: "+this.getDefensa()+" | Equiable: "+this.getEquipable()+" | Equipado: "+this.getEquipado()+" | Recupera: "+this.getRecupera()+" | Cantidad: "+this.getCantidad();
		//frase = "Tipo de objeto: "+ this.getTipo()+" | Nombre del objeto: "+ this.getNombre()+" | "+" | Ataque: "+this.getAtaque()+" | "+" | Defensa: "+this.getDefensa()+" | Equiable: "+this.getEquipable()+" | Equipado: "+this.getEquipado()+" | Recupera: "+this.getRecupera()+" | Cantidad: "+this.getCantidad();
		//frase = "Tipo de objeto: "+ this.getTipo()+" | Nombre del objeto: "+ this.getNombre()+" | "+" | Ataque: "+this.getAtaque()+" | "+" | Defensa: "+this.getDefensa()+" | Equiable: "+this.getEquipable()+" | Equipado: "+this.getEquipado()+" | Recupera: "+this.getRecupera()+" | Cantidad: "+this.getCantidad();
		System.out.println("8");
		return frase;
		
	}

}
