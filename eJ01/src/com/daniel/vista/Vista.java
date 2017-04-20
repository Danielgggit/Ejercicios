package com.daniel.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vista {
	
	/**
	 * Visualizacion por pantalla del texto requerido.
	 * 
	 * @param texto
	 *            String a mostrar por consola.
	 */	

	public void mostrar_texto(String texto){
		System.out.println(texto);
		}
	
	/**
	 * Proceso de generacion de menu.
	 */	
/*	
	public void mostrar_menu(){
		mostrar_texto("Menu de de aplicion");
		mostrar_texto("1.Leer número Entero");
		mostrar_texto("2.leer número Real");
		mostrar_texto("3.leer Cadena de Caracteres");
		mostrar_texto("4.leer un Carácter");
		mostrar_texto("5.ver Menu operaciones");
		mostrar_texto("6.Salir");
	}*/
	
	public void mostrar_operaciones(){
		mostrar_texto("Menu de operaciones");
		mostrar_texto("1 Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,debe indicarlo.");
		mostrar_texto("2 Pedir el radio de un círculo y calcular su área. A=PI*r^2.");
		mostrar_texto("3 Pedir el radio de una circunferencia y calcular su longitud");
		mostrar_texto("4 Pedir dos números y decir si son iguales o no");
		mostrar_texto("5 Pedir un número e indicar si es positivo o negativo");
		mostrar_texto("6.Pedir dos números y decir si uno es múltiplo del otro.");
		mostrar_texto("7.Pedir dos números y decir cual es el mayor.");		
		mostrar_texto("8.Pedir dos números y decir cual es el mayor o si son iguales.");
		mostrar_texto("9.Pedir dos números y mostrarlos ordenados de mayor a menor.");
		mostrar_texto("10. Pedir tres números y mostrarlos ordenados de mayor a menor.");				
		mostrar_texto("11.Salir");
	}

	/**
	 * Proceso de captura de teclado.
	 * 
	 * @return String Conteniendo lo tecleado por el usuario.
	 */
	public String teclear_Texto(){
		//Declaracion del Flujo
		InputStreamReader flujo = new InputStreamReader(System.in);
		//Declaracion del envoltorio
		BufferedReader lector = new BufferedReader(flujo);
		//Declaracion de la variable de captura
		String texto=null;
		//Proceso de Captura del teclado
		try{ texto=lector.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return texto;	
	}
	
	
	public int conviertea_entero(String texto){
		int numero=0;
		try{
			numero=Integer.parseInt(texto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return numero;
	}
	
	public double conviertea_nreal(String texto){
		double numero=0;
		try{
			numero= Double.parseDouble(texto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return numero;
	}
	
// no es posible convertir directamente de String a un caracter ya que un 
// String podría devolver infinidad de posibles carácteres	 por ello 
// necesita un arreglo diciendole la pocision que vamos a coger 
	public char conviertea_char(String texto){
		char cadena=' ';
		try{
			cadena=texto.charAt(0);
		}catch(Exception e){e.printStackTrace();}
		return cadena;
	}
	
	
	
	
	
	
	
	
	
	
}
