package contas;

import utils.Conta;

public class ContaPoupanca extends Conta {
    int numeroConta;
    int agencia;

    public ContaPoupanca(int numeroConta, int agencia, String usuario, String senha, double saldo){
        super(usuario, senha, saldo);
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public void setNumeroContaPoupanca(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroContaPoupanca(){
        return this.numeroConta;
    }

    public void setAgenciaContaPoupanca(int agencia){
        this.agencia = agencia;
    }

    public int getAgenciaContaPoupanca(){
        return this.agencia;
    }

    public void exibeInfoContaPoupanca(){
        System.out.println("_________________________\n");
        System.out.println("\tNúmero da conta : " + this.numeroConta);
        System.out.println("\tNúmero da agencia : " + this.numeroConta);
        super.exibeInfoConta();
        System.out.println("_________________________\n");
    }
}
