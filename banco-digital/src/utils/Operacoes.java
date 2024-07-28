package utils;

import contas.ContaCorrente;
import contas.ContaPoupanca;
import java.util.ArrayList;

public class Operacoes {

    public boolean verificaExistenciaContaCorrente(ArrayList<ContaCorrente> contasCorrentes, int numeroConta){
        for(ContaCorrente contaAtual : contasCorrentes){
            if(contaAtual.getNumeroContaCorrente() == numeroConta){
                return true;
            }
        }
        return false;
    }

    public boolean verificaExistenciaContapoupanca(ArrayList<ContaPoupanca> contasPoupancas, int numeroConta){
        for(ContaPoupanca contaAtual : contasPoupancas){
            if(contaAtual.getNumeroContaPoupanca() == numeroConta){
                return true;
            }
        }
        return false;
    }

    public ContaCorrente pesquisaContaCorrente(ArrayList<ContaCorrente> contasCorrentes, int numeroConta){
        for(ContaCorrente contaAtual : contasCorrentes){
            if(contaAtual.getNumeroContaCorrente() == numeroConta){
                return contaAtual;
            }
        }
        return null;
    }

    public ContaPoupanca pesquisaContaPoupanca(ArrayList<ContaPoupanca> contasPoupancas, int numeroConta){
        for(ContaPoupanca contaAtual : contasPoupancas){
            if(contaAtual.getNumeroContaPoupanca() == numeroConta){
                return contaAtual;
            }
        }
        return null;
    }

    private boolean sacar(Conta conta, String senha, double valor){
        if(conta.getSenha().equals(senha) && conta.getSaldo() >= valor){
            double saldoAntigo = conta.getSaldo();
            conta.setSaldo(saldoAntigo - valor);
            
            return true;
        }
        return false;
    }

    private boolean depositar(Conta conta, double valor){

        double saldoAntigo = conta.getSaldo();

        conta.setSaldo(saldoAntigo + valor);
        
        return true;
    }

    public boolean sacarContaCorrente(ArrayList<ContaCorrente>  contasCorrentes, int numeroConta, int quantidadeContas, String senha, double valor){
        
        ContaCorrente conta = pesquisaContaCorrente(contasCorrentes, numeroConta);
        if(conta == null){
            return false;
        }

        return sacar(conta, senha, valor);
    }

    public boolean depositarContaCorrente(ArrayList<ContaCorrente> contasCorrentes, int numeroConta, int quantidadeContas, String senha, double valor){
        
        ContaCorrente conta = pesquisaContaCorrente(contasCorrentes, numeroConta);
        if(conta == null){
            return false;
        }

        return depositar(conta, valor);
    }

    public boolean sacarContaPoupanca(ArrayList<ContaPoupanca> contasPoupancas, int numeroConta, String senha, double valor){
        
        ContaPoupanca conta = pesquisaContaPoupanca(contasPoupancas, numeroConta);
        if(conta == null){
            return false;
        }

        return sacar(conta, senha, valor);
    }

    public boolean depositarContaPoupanca(ArrayList<ContaPoupanca> contasPoupancas, int numeroConta, String senha, double valor){
        
        ContaPoupanca conta = pesquisaContaPoupanca(contasPoupancas, numeroConta);
        if(conta == null){
            return false;
        }

        return depositar(conta, valor);
    }
}
