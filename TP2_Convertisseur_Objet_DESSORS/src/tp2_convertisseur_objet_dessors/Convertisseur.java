/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseur_objet_dessors;

import java.util.Scanner;

/**
 *
 * @//author maxCD//
 */
public class Convertisseur {
    int nbConversion;
    
    public Convertisseur(){
        nbConversion = 0;
    }
    @Override
    public String toString(){
        return "nombre de conversion : "+ nbConversion;
    }
        public double CelciusVersKelvin(double celcius){
        double Kelvin = celcius + 273.15;
        return Kelvin;
        
    }
       
    public double KelvinVersCelcius(double kelvin){
        double celcius = kelvin - 273.15;
        return celcius;
        
    }
       
    public double FarenheitVersCelcius(double farenheit){
        double celcius = (farenheit - 32) / 1.8;
        return celcius;

    }

    public double CelciusVersFarenheit(double celcius){
        double farenheit = (celcius * 1.8) + 32;
        return farenheit;
        
    }
    
    public double KelvinVersFarenheit(double kelvin){
        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));
        return farenheit;
        
    }
   
    public double FarenheitVersKelvin(double farenheit){
        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        return kelvin;
        
    }
    public byte selectmode(){
        
        byte mode = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Selectionnez la conversion de temperature souhaitee : \n"
                + "0 -> STOP\n"
                + "1 -> Celcius Vers Kelvin\n"
                + "2 -> Kelvin Vers Celcius\n"
                + "3 -> Farenheit Vers Celcius\n"
                + "4 -> Celcius Vers Farenheit\n"
                + "5 -> Kelvin Vers Farenheit\n"
                + "6 -> Farenheit Vers Kelvin\n");
        
        while(mode<1 | mode>6){
            mode = sc.nextByte();            
        }
        return mode;
        
    }
    public double convert(){
        
        byte mode = selectmode();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur : ");
        double t = sc.nextDouble();
        System.out.println("Vous avez choisi : " + t + "\n");
        
        String enter = "";
        String output = "";
        double res = 0;
        
        switch(mode){
            
            case 0:
                return -300;
            
            case 1:
                enter = "Celsius";
                output = "Kelvin";
                res = CelciusVersKelvin(t);
                break;
            case 2:
                enter = "Kelvin";
                output = "Celsius";
                res = KelvinVersCelcius(t);
                break;
            case 3:
                enter = "Farenheit";
                output = "Celsius";
                res = FarenheitVersCelcius(t);
                break;
            case 4:
                enter = "Celsius";
                output = "Farenheit";
                res = CelciusVersFarenheit(t);
                break;
            case 5:
                enter = "Kelvin";
                output = "Farenheit";
                res = KelvinVersFarenheit(t);
                break;
            case 6:
                enter = "Farenheit";
                output = "Kelvin";
                res = FarenheitVersKelvin(t);
                break;
            
        }
        nbConversion ++;
        return res;        
    }
}
