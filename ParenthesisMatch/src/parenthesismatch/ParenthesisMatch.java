/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parenthesismatch;

import java.util.*;

/**
 *
 * @author joan
 */
public class ParenthesisMatch {

    /**
     * @param args the command line arguments
     */
    
    public static boolean parensMatch(String cadena){
        Stack<String> pila = new Stack<String>();
        
        for (char c: cadena.toCharArray ()) { 
            //PARENTESIS
            if(c == '('){
                pila.push("(");
            }else if(c == '{'){
                pila.push("{");
            }else if(c == '['){
                pila.push("[");
            }
            
            if(c == ')'){
                if(pila.peek() == "("){
                    pila.pop();
                }
            }else if(c == '}'){
                if(pila.peek() == "{"){
                    pila.pop();
                }
            }else if(c == ']'){
                if(pila.peek() == "["){
                    pila.pop();
                }
            } 
        }
        
        if(pila.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("(a[0] + b[2c[6]]){24 + 53} passed: " + parensMatch("(a[0] + b[2c[6]]){24 + 53}"));
        System.out.println("f(e(d)) passed: " + parensMatch("f(e(d))"));
        System.out.println("((b) passed: " + !parensMatch("((b)"));
        System.out.println("(empty) passed: " + parensMatch("(empty)"));
        System.out.println("([)] passed: " + !parensMatch("([)]"));
        System.out.println(" passed: " + parensMatch("     "));
        System.out.println("passed: " + parensMatch(""));
    }
}
