package encapsulamento.banco;

import java.math.BigDecimal;

public class Conta {
    private String nome;
    private BigDecimal saldo;

    public Conta(String nome){
        this.nome = nome;
        this.saldo = BigDecimal.ZERO;
    }

    public Conta(String nome, BigDecimal saldo){
        if(saldo.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Valor inválido!");
        }

        this.nome = nome;
        this.saldo = saldo;

    }

    public void depositar(BigDecimal valor){
        if(this.saldo.compareTo(new BigDecimal("0.0")) < 0){
            throw new IllegalArgumentException("Valor inválido!");
        }
        this.saldo = this.saldo.add(valor);

        System.out.printf("Saldo atual de %s: R$ %.2f\n", this.nome, this.saldo);
    }

    public void sacar(BigDecimal valor){
        if(valor.compareTo(new BigDecimal("0.0")) > 0 &&  this.saldo.compareTo(valor) >= 0){
            this.saldo = this.saldo.subtract(valor);
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.printf("Saldo atual de %s: R$ %.2f\n", this.nome, this.saldo);
    }
    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: R$%.2f\n", this.nome, this.saldo);
    }
}
