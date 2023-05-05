/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author Vítor
 */
public class Vendedor extends Funcionario{
    
    private double vendas;
    
    public Vendedor(String nome, String rg, double salario_base)
    {
        super(nome, rg, salario_base);
        vendas = 0;
    }
    
    //getters
    public double getVendas() {
        return vendas;
    }
    
    //setters
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    
    public void registrarVenda(double valor)
    {
        vendas =+ valor;
    }
    
    private double comissao()
    {
        return vendas * 0.03;
    }
    
    @Override
    public double salario_liquido()
    {
        return vendas + comissao();
    }
    
    @Override
    public void novoMes()
    {
        vendas = 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Vendas: " + vendas + "\nComissao: " + comissao() + "\nSalario liquido: " + salario_liquido());
    }
}
