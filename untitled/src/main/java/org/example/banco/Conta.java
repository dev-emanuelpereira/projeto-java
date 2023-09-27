package org.example.banco;

public class Conta extends Banco {

    public void abrirConta(Banco banco) {
        if (banco.getTipo() == "Conta Poupança") {
            banco.setSaldo(150.00F);
        }else{
            banco.setSaldo(50.00F);
        }
    }
    public void fecharConta(Banco banco, float saldo){
        if (banco.getSaldo() > 0) {
            System.out.println("Você deve sacar todo o saldo da sua conta para poder fechá-la.");
        } else if (banco.getSaldo() < 0) {
            System.out.println("Você deve pagar todos os débitos para fechar a conta.");
        }
    }

    public void depositar (Banco banco, float saldo) {
        if (banco.getStatus()){
            banco.setSaldo(saldo);
        }else{
            System.out.println("Você não pode depositar se sua conta está fechada");
        }
    }
    public void sacar(Banco banco, float saldo) {
        if (banco.getStatus()) {
            if (banco.getSaldo() <= 0 || saldo < banco.getSaldo()){
                System.out.println("Saldo insuficiente");
            }
        }
    }
    public void pagarMensal () {

    }
}
