package oo;

import java.math.BigDecimal;

public class Conta {
    BigDecimal saldo;

    void zerarSaldo(){
        saldo = new BigDecimal("0.00");
    }

    void exibirSaldo(){
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = new BigDecimal("1500.59");

        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }

}
