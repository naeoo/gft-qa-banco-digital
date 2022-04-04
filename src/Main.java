import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Natanael Queiroz");
        cliente1.setCpf("111.111.111-11");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Renan Queiroz");
        cliente2.setCpf("222.222.222-22");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("José Paulo");
        cliente3.setCpf("333.333.333-33");

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Diego Luiz");
        cliente4.setCpf("444.444.444-44");


        Conta cc1 = new ContaCorrente(cliente1);
        cc1.deposita(111);

        Conta cp2 = new ContaPoupanca(cliente2);
        cp2.deposita(222);

        Conta cp3 = new ContaPoupanca(cliente3);
        cp3.deposita(333);

        Conta cc4 = new ContaCorrente(cliente4);
        cc4.deposita(444);

        //Informações sobre as contas criadas.
        cc1.imprimeExtrato();
        cp2.imprimeExtrato();
        cp3.imprimeExtrato();
        cc4.imprimeExtrato();

        //Transferências saques e depositos.
        cc1.saca(10);
        cp2.saca(20);
        cp3.saca(30);
        cc4.saca(40);


    }

}

