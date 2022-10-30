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
    //4 lignes permettant de définir les quatre attributs suivants :
    public String Nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        //Constructeur
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}

public void lireEtiquette() {
    //. Cette méthode, lorsqu’elle est appelée, affiche
    //simplement à l’écran les informations contenues sur l’étiquette de la bouteille de bière. Au sein d’une
    //méthode, on a accès a la valeur de tous les attributs de la même classe   
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;

}
public boolean Décapsuler(){
    //LA methode qui nous dira si la bouteille est decapsuler ou 
    //pas en utilisant le methode boolean
        if (ouverte == false){
        ouverte = true;
        return ouverte;
        }else if (ouverte == true){
            System.out.println("biere deja ouverte") ;
            ouverte = false ;
            }
        return ouverte;
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés)Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
//La méthode toString() permet de faire cela, elle retourne la chaine de
//caractère que l’on veut afficher quand l’objet est cite
}
}
