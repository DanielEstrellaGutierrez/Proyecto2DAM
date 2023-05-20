/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

/* import java.util.*; */

public abstract class Estadisticas
{
	/* ELEMENTOS DE LA CLASE ABSTRACTA */
	
	private String nombre;
	private int vida;
	private int vidaTemp;
	private int atq;
	private int def;
	private int pExp;
	private int oro;
	private int fallar;
	private int critico;
	private int nivel;
	
	/* CONSTRUCTOR PARA AMBOS */
	
	/* PARA FALLAR Y CRITICO PODRIA DEVOLVER UN BOOLEAN (TRUE O FALSE) PARA LA CLASE JUEGO.
	 * EN LOS METODOS SET DE AMBOS, GENERAR NUMEROS RANDOM Y SI SON MENOS O MAS QUE UNA CATIDAD QUE SE CALCULA EN LOS PROPIOS METODOS,
	 * SE CUMPLIRA O NO LA CONDICION DE FALLAR O CRITICO (EL INT DE FALLAR - NIVEL Y EL INT DE CRITICO + NIVEL) PARA QUE FALLE MENOS
	 * Y HAGA MAS CRITICOS AL SUBIR DE NIVEL. */
	
	public Estadisticas(String nombre, int vida, int atq, int def, int pExp, int oro, int fallar, int critico, int nivel)
	{
		this.nombre = nombre;
		this.vida = vida;
		this.vidaTemp = vida;
		this.atq = atq;
		this.def = def;
		this.pExp = pExp;
		this.oro = oro;
		this.fallar = fallar;
		this.critico = critico;
		this.nivel = nivel;
	}
	
	/* GETTER Y SETTER PARA AMBOS */

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getVida()
	{
		return vida;
	}

	public void setVida(int vida)
	{
		this.vida = vida;
	}

	public int getVidaTemp()
	{
		return vidaTemp;
	}

	public void setVidaTemp(int vidaTemp)
	{
		this.vidaTemp = vidaTemp;
	}
	
	public int getAtq()
	{
		return atq;
	}

	public void setAtq(int atq)
	{
		this.atq = atq;
	}

	public int getDef()
	{
		return def;
	}

	public void setDef(int def)
	{
		this.def = def;
	}

	public int getpExp()
	{
		return pExp;
	}

	public void setpExp(int pExp)
	{
		this.pExp = pExp;
	}

	public int getOro()
	{
		return oro;
	}

	public void setOro(int oro)
	{
		this.oro = oro;
	}

	public int getFallar()
	{
		return fallar;
	}

	public void setFallar(int fallar)
	{
		/* private Random rndFal = new Random(); */
		/* int randomFal = rndFal.nextInt(fallar); */
		/* hay que definir la variable de fallar dependiendo de si el valor del random es menor o igual al valor pasado por parametro
		 * del int fallar, en ese caso se devolvera un true o un false, si es false falla, si es true, acierta */
		this.fallar = fallar;
	}

	public int getCritico()
	{
		return critico;
	}

	public void setCritico()
	{
		this.critico = critico;
	}

	public int getNivel()
	{
		return nivel;
	}

	public void setNivel(int nivel)
	{
		this.nivel = nivel;
	}
	
}
