/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecelagem;

/**
 *
 * @author Vítor
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administrativo adm = new Administrativo("Kleber", "123.345.678-98", 15000);
        Producao p = new Producao("Joao", "098.7655.43-234", 500);
        Vendedor v = new Vendedor("Pedro", "654.765.234-76", 10000);
        
        adm.hollerith();
        p.hollerith();
        v.hollerith();
        
        System.out.println("");
        
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.hollerith();
        
        System.out.println("");
        
        p.registrarHorasDiurnas(12);
        p.registrarHorasNoturnas(32);
        p.hollerith();
        
        System.out.println("");
        
        v.registrarVenda(10000);
        v.hollerith();
        
        adm.novoMes();
        p.novoMes();
        v.novoMes();
        
        System.out.println("");
        
        adm.hollerith();
        p.hollerith();
        v.hollerith();
        
    }
    
}
