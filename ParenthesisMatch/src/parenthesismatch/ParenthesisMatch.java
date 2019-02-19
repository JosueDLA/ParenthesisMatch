/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parenthesismatch;

/**
 *
 * @author joan
 */
public class ParenthesisMatch {

    /**
     * @param args the command line arguments
     */
    
    public static boolean Paren(String cadena){
        boolean contadorCorchete = false, contadorLlave = false, contadorParentesis=false, bandera;
        
        for(char c: cadena.toCharArray()){
            
            if(c=='}' && contadorLlave){
                contadorLlave=false;
            }else if(c=='{' && !contadorLlave){
                contadorLlave=true;
            }
            
            else if(c==']' && contadorCorchete && contadorLlave){
                contadorCorchete=false;
            }else if(c=='[' && !contadorCorchete && contadorLlave){
                contadorCorchete=true;
            }
            
            else if(c==')' && contadorParentesis && contadorCorchete){
                contadorParentesis=false;
            }else if(c=='(' && !contadorParentesis && contadorCorchete){
                contadorParentesis=true;
            }else{
                if(!contadorCorchete && !contadorLlave && !contadorParentesis){
                    return false;
                }
                    
            }
            
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(Paren("([)]"));
    }
    
}
