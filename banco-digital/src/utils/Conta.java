package utils;

public class Conta {
    private String usuario;
    private String senha;
    private double saldo;

    public Conta(String usuario, String senha, double saldo){
        this.usuario = usuario;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getUsuario(){
        return this.usuario;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void exibeInfoConta(){
        System.out.println("\tUsuario : " + this.usuario);
        System.out.println("\tSenha : " + this.senha);
        System.out.println("\tSaldo : " + this.saldo);
    }

}
