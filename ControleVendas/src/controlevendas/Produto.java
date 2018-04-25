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
public class Produto {
    protected String produto;
    
    protected int valor;
    protected int tag;

    public Produto()
    {
        
    }
    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
    public Produto(String p, int v, int t)
    {
        produto = p;
        
        valor = v;
        tag = t;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void imprimirProduto()
    {
        System.out.println("Produto: " + produto);
        System.out.println("Preço: " + valor);
        
    }
}
