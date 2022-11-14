/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_dessors;

/**
 *
 * @author maxCD
 */
public class Epee extends Arme{
    int indice ;

    public Epee(String n, int i, int ind) {
        super(n, i);
        if (ind>99){
            ind = 99;
        }
        if (ind>0){
            indice = ind;
        }else{
            indice = 0;
        }
    }

    @Override
    public String toString() {
        return "Ep\u00e9e{" + "indice=" + indice + '}';
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
}
