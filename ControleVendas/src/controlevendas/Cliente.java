/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlevendas;

/**
 *
 * @author paulo
 */
public class Cliente extends Pessoa {
    private int[] compras = new int[10];
    private int[] quantidades = new int[10]; 
    private String formaPagamento = null;
    private int valorPago = 0;

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getValorPago() {
        return valorPago;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int[] getCompras() {
    return compras;
    }
    
    public int[] getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(int[] quantidades) {
        this.quantidades = quantidades;
    }

    public void setCompras(int[] compras) {
        this.compras = compras;
    }
    
    public void comprar(int tag, int n, int quant)
    {
        compras[n-1] = tag;
        quantidades[n-1] = quant;
        
    }
    
    public String formaPagmento(int x)
    {
        String xxx;
        if (x==0)
        {
            xxx = "Cartão ";
        }
        else if (x==1)
            {
               xxx = "Dinheiro";
            }
            else
        {
            System.out.println("OPÇÃO INVALIDA, sera usado o meio tradicional!");
            xxx = "Dinheiro";
        }
        return xxx;
    }
}
