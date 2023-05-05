/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author Vítor
 */
public abstract class Funcionario {
    
    private String nome, rg;
    private double salario_base;
    
    public Funcionario(String nome, String rg, double salario_base)
    {
        this.nome = nome;
        this.rg = rg;
        this.salario_base = salario_base;
    }
    
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }
    
    //getters

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario_base() {
        return salario_base;
    }
    
    
    public abstract double salario_liquido();
    
    public void hollerith()
    {
        System.out.println("Nome: " + nome + "\nRG: " + rg + "\nSalario Base: " + salario_base);
    }
    
    public abstract void novoMes();
}
