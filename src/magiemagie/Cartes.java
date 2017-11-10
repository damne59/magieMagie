/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

/**
 *
 * @author Formation
 */
public class Cartes {
    public enum TypeCarte{
        Bave_de_crapaud,
        Aile_de_chauve_souris,
        Lapis_lazuli,
        Mandragore,
        Corne_de_licorne
               
    }
    private TypeCarte type;

    @Override
    public boolean equals(Object obj) {
       
        
        Cartes carteparam = (Cartes) obj;
       return (getType() == carteparam.getType() );
          
    }

    
    
    
    
    @Override
    public String toString() {
        return type.toString(); 
        
    }

    public TypeCarte getType() {
        return type;
    }

    public void setType(TypeCarte type) {
        this.type = type;
    }
    

    
   
    
}




