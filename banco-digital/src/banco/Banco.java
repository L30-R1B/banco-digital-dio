package banco;

import contas.ContaCorrente;
import contas.ContaPoupanca;
import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaCorrente> contasCorrentes;
    private ArrayList<ContaPoupanca> contasPoupancas;

    public Banco() {
        this.contasCorrentes = new ArrayList<>();
        this.contasPoupancas = new ArrayList<>();
    }

    public void adicionarContaCorrente(ContaCorrente contaCorrente) {
        this.contasCorrentes.add(contaCorrente);
    }

    public void removerContaCorrente(int numeroConta) {
        this.contasCorrentes.removeIf(conta -> conta.getNumeroContaCorrente() == numeroConta);
    }

    public void adicionarContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contasPoupancas.add(contaPoupanca);
    }

    public void removerContaPoupanca(int numeroConta) {
        this.contasPoupancas.removeIf(conta -> conta.getNumeroContaPoupanca() == numeroConta);
    }

    public void exibirContas() {
        System.out.println("Contas correntes : ");
        for (ContaCorrente conta : this.contasCorrentes) {
            conta.exibeInfoContaCorrente();
        }
        System.out.println("Contas poupanças : ");
        for (ContaPoupanca conta : this.contasPoupancas) {
            conta.exibeInfoContaPoupanca();
        }
    }
}

