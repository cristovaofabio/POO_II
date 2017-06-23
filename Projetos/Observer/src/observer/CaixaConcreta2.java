/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author cristovao
 */
public class CaixaConcreta2 implements Caixa{
    private final int numero=2;
    @Override
    public void mudarPainel(Painel p) {
        p.mudar(this);
    }
    @Override
    public int getNumero() {
        return numero;
    }    
    
}
