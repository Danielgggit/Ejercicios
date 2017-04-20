package com.daniel.controlador;

import com.daniel.modelo.Modelo;
import com.daniel.vista.Vista;

public class Controlador {
	private Modelo modelo;
	private Vista vista;
		
	public Controlador(){
	
		modelo= new Modelo();
		vista= new Vista();
		menu_opciones();
	}
	
	public void menu_opciones(){
		int opcion =0;
		
		do{
			vista.mostrar_operaciones();
			opcion= vista.conviertea_entero(vista.teclear_Texto());
			switch (opcion) {
			case 1:
				System.out.println("Ejercicio1.");
				ejercicio1();
				break;
			case 2:
				System.out.println("Ejercicio2");
				ejercicio2();
				break;
			case 3:
				System.out.println("Ejercicio3");
				ejercicio3();
				break;
			case 4:
				System.out.println("Ejercicio4");
				ejercicio4();
				break;
			case 5:
				System.out.println("Ejercicio4");
				ejercicio5();
				break;
			case 6:
				System.out.println("opcion6");
				break;
			case 7:
				System.out.println("opcion7");
				break;
			case 8:
				System.out.println("opcion8");
				break;
			case 9:
				System.out.println("opcion9");
				break;
			case 10:
				System.out.println("opcion10");
				break;
			case 11:
				System.out.println("Programa Finalizado");
				break;
			default:
				break;
			}
		}while(opcion != 11);
		
	}
	

	
	public void proceso_Captura_Entero(String texto){
		//Pedimos un entero
		vista.mostrar_texto("Tecle"+ texto);
		//tecleamos el texto, lo convertimos a ENTERO y lo guardamos en el modelo 
		modelo.setNumero(vista.conviertea_entero(vista.teclear_Texto()));
	}
	
	public void proceso_Captura_NReal(){
		//Pedimos un número Real
		vista.mostrar_texto("Teclee un número Real");
		//Tecleamos el texto, lo convertimos en número Real y lo guardamos en el modelo en la propiedad correspondiente
		modelo.setNreal(vista.conviertea_nreal(vista.teclear_Texto()));
	}

	
	public void ejercicio1(){
		double a,b,c; //coeficientes ax^2+bx+c=0
		double x1,x2,d; //soluciones y determinante
		
		//capturamos un entero y lo guardamos en el modelo
		proceso_Captura_Entero("el primer coeficiente (a):");
		//guardamos el numero en la variable de operacion a
		a=modelo.getNumero();
		//Capturamos un entero y lo guardamos en el modelo
		proceso_Captura_Entero("el segundo coeficiente (b):");
		b= modelo.getNumero();
		//Capturamos un entero y lo guardamos en el modelo
		proceso_Captura_Entero("el tercer coeficiente (c):");
		c= modelo.getNumero();
		
		//Calculamos el determinante
		d=((b*b)-4*a*c);
		
		if (d<0){
			System.out.println("No existen soluciones reales");
		}
		else{
			
			x1=(-b+Math.sqrt(d))/(2+a);
			x2=(-b-Math.sqrt(d))/(2+a);
			
			vista.mostrar_texto("Solucion: "+x1);
			vista.mostrar_texto("Solucion: "+x2);
			}	
		}
	
	public void ejercicio2(){
		double a,r; //área y radio
		
		//capturamos un entero y lo guardamos en el modelo
		proceso_Captura_Entero(" el radio de un circulo:");
		r=modelo.getNumero();
		//Aplicamos la formula matematica para calcular el area del circulo
		a=(Math.PI*(r*r));//otra forma de elevar el cuadrado es Math.pow(r,2)
		
		vista.mostrar_texto("El área de una Circunferencia de radio "+r+" es: "+a );
	}	
		
	public void ejercicio3(){
		double l,r; //área y radio
		
		//capturamos un entero y lo guardamos en el modelo
		proceso_Captura_Entero(" el radio de un circulo:");
		r=modelo.getNumero();
		//Aplicamos la formula matematica para calcular la longitud de una circunferencia
		l=2*Math.PI*r;
		
		vista.mostrar_texto("la longitud de una Circunferencia de radio "+r+" es: "+l );
	}			
		

		public void ejercicio4(){
			double n1,n2; 
			
			//Capturamos un numero y lo guardamos en el modelo
			proceso_Captura_Entero(" un número");
			n1=modelo.getNumero();
			//Capturamos un numero y lo guardamos en el modelo
			proceso_Captura_Entero(" otro número");
			n2=modelo.getNumero();
			
			if (n1==n2){
				vista.mostrar_texto("el numero "+n1+" y el número "+n2+" son iguales" );
			}
			else{
				vista.mostrar_texto("el numero "+n1+" y el número "+n2+" no son iguales" );
			}
		}
			
		public void ejercicio5(){
				double n1;
				
				//Capturamos un numero y lo guardamos en el modelo, seguidamente lo guardamos en una variable
				proceso_Captura_Entero(" un número");
				n1=modelo.getNumero();
				
				if(n1>0){
					vista.mostrar_texto(n1+" es un número positivo");
				}
				else{
					vista.mostrar_texto(n1+" es un número negativo");
					
				}
				
			}
	

}

