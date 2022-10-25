/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_dessors;

/**
 *
 * @author maxCD
 */
public class BouteilleBiere {
    public String Nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;
    public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
 Nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

public void lireEtiquette() {
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;

}
public boolean Décapsuler(){
        if (ouverte == false){
        ouverte = true;
        return ouverte;
        }else if (ouverte == true){
            System.out.println("biere deja ouverte") ;
            ouverte = false ;
            }
        return ouverte;
}

}
