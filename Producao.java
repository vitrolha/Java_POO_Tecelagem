/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author Vítor
 */
public class Producao extends Funcionario{
    
    private int horasD, horasN;
    
    public Producao(String nome, String rg, double salario_base)
    {
        super(nome, rg, salario_base);
        horasD = 0;
        horasN = 0;
    }
    
    //getters
    public int getHorasD() {
        return horasD;
    }

    public int getHorasN() {
        return horasN;
    }
    
    //setters
    public void setHorasD(int horasD) {
        this.horasD = horasD;
    }

    public void setHorasN(int horasN) {
        this.horasN = horasN;
    }
    
    public void registrarHorasDiurnas(int horas)
    {
        horasD += horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        horasN += horas;
    }
    
    @Override
    public void novoMes()
    {
        horasD = 0;
        horasN = 0;
    }
    public double valorDia()
    {
        return super.getSalario_base()*horasD;
    }
    
    public double valorNoite()
    {
        return super.getSalario_base()*horasN;
    }
    
    @Override
    public double salario_liquido()
    {
       return valorNoite()+valorDia();
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Horas dia: " + horasD + "\nHoras noite: " + horasN + 
                "\nValor noite: " + valorNoite() + "\nValor dia: " + valorDia() + 
                "\nSalario liquido: " + salario_liquido());
    }
}
