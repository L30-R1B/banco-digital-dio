package contas;
import utils.Conta;


public class ContaCorrente extends Conta {
    int numeroConta;
    int agencia;

    public ContaCorrente(int numeroConta, int agencia, String usuario, String senha, double saldo){
        super(usuario, senha, saldo);
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public void setNumeroContaCorrente(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroContaCorrente(){
        return this.numeroConta;
    }

    public void setAgenciaContaCorrente(int agencia){
        this.agencia = agencia;
    }

    public int getAgenciaContaCorrente(){
        return this.agencia;
    }

    public void exibeInfoContaCorrente(){
        System.out.println("_________________________\n");
        System.out.println("\tNúmero da conta : " + this.numeroConta);
        System.out.println("\tNúmero da agencia : " + this.numeroConta);
        super.exibeInfoConta();
        System.out.println("_________________________\n");
    }

}
