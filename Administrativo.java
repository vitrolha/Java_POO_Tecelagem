/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author Vítor
 */
public class Administrativo extends Funcionario {
    
    private double faltas;
    
    public Administrativo(String nome, String rg, double salario_base)
    {
        super(nome, rg, salario_base);
        faltas = 0;
    }
    
    //getters
    public double getFaltas() {
        return faltas;
    }
    
    //setters
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    //outros metodos
    public void registrarFalta()
    {
        faltas ++;
    }
    
    @Override
    public  void novoMes()
    {
        faltas = 0;
    }
    
    
    @Override
    public double salario_liquido()
    {
        return  super.getSalario_base() - (super.getSalario_base() * (faltas/30));
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Descontos: " + ((faltas/30)*super.getSalario_base()) + "\nSalario liquido: " + salario_liquido() +
                "\nFaltas: " + faltas);
    }
            
}
