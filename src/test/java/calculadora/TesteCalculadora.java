/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import com.mycompany.calculadora1.Calculadora;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;







/**
 *
 * @author alunopb
 */
public class TesteCalculadora {
    
    public TesteCalculadora() {
    }
    
    @Test
    public void testGetAdicao(){
        Calculadora calculadora = new Calculadora(4.0,2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDivisao();
        assertEquals(retornoEsperado, retornoFeito, 0);
        
        System.out.println(retornoFeito);
        
        
        
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
