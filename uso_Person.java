/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Marvinero
 */
public class uso_Person {
    public static void main(String[] args){
    
       Person Rodrigo = new Person();
       Rodrigo.nombre = "Rodrigo";
       Rodrigo.cic = "654321";
       System.out.println("Mi name is: " + Rodrigo.nombre);
       System.out.println("And my number de ci is :" + Rodrigo.cic);
       Rodrigo.sumDigitos();
       System.out.println("la suma de digitos es: " + Rodrigo.viewSuma());
    }  
}
