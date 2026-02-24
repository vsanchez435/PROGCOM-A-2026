/******************************************************************************
temp=float(input("Temperatura registrada:"))
if temp>=27: print("Póngase algo fresco👚☀️")
elif temp>=20 and temp<27: print("Abrígate🧥🌥️")
elif temp>=20 and temp<27: print("Abrígate más 🧣🧥🌦️")
else: print("Está helando🥶🥶")
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Temperatura registrada");
		Scanner leer = new Scanner (System.in);
		//nextLine es para String
		//nextFloat es para leer decimales
		float temp = leer.nextFloat();
		
		if (temp>=27) {System.out.println("Póngase algo fresco👚☀️");}
		//&& and  || or
		else if (temp>=20 && temp<27) {System.out.println("Abrígate🧥🌥");}
		else if (temp>=16 && temp<20) {System.out.println ("Abrígate más 🧣🧥🌦");}
		else {System.out.println ("Está helando🥶🥶");}
		
		//ejercicio easy hand if 
		System.out.println("Cuál es tu edad?");
		int edad = leer.nextInt();
        System.out.println(edad>=18? "Eres mayor de edad" : "No eres mayor de edadd");
}}

