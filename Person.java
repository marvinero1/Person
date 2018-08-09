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
public class Person {
    public String nombre;
    public String cic;
    
    public Person( String nom, String ci)
    {
        nombre = nom;
        cic = ci;
    }
    
    public Person()
    {
        nombre = " ";
        cic = " ";
    }
    
    public void addName(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getName()
    { 
        return nombre;
    }
    
    public void addci(String ci)
    {
        this.cic = ci;
    }
    
    public String getci()
    {
        return cic;
    }
    
    private int Convertir_ci()
    {
        return Integer.parseInt(cic);
    }
    
    public boolean esPar(int digito)
    {
        boolean res = false;
        if(digito % 2 == 0)
        {
            res = true;
        }
        return res;
    }
    
    @SuppressWarnings("empty-statement")
    public int sumDigitos()
    {
        int ciEntero = Convertir_ci();
        int sumaPares = 0; 
        do{
            int digito = ciEntero % 10;
            if(esPar(digito))
            {
                sumaPares = sumaPares + digito;
            }
            ciEntero = ciEntero / 10;
        }
            while(ciEntero % 10 != 0);
            {
                return sumaPares;
            }        
    }
    
    public void getSumaPares()
    {
        this.sumDigitos();   
    }
    
    public int viewSuma()
    {
        return sumDigitos();
    }
}
