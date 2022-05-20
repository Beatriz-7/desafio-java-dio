import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente Beatriz = new Cliente();
        Beatriz.setNome("Beatriz");

        Cliente Lorena = new Cliente();
        Lorena.setNome("Lorena");

        Cliente Lucas = new Cliente();
        Lucas.setNome("Lucas");

        Cliente Rafael = new Cliente();
        Rafael.setNome("Rafael");

        Conta cc = new ContaCorrente(Beatriz);
        Conta poupanca = new ContaPoupanca(Beatriz);

        ContaCorrente c1 = new ContaCorrente(Lorena);
        ContaPoupanca poupanca1  = new ContaPoupanca(Lorena);

        Conta c2 = new ContaCorrente(Lucas);
        ContaPoupanca poupanca2 = new ContaPoupanca(Lucas);

        Conta c3 = new ContaCorrente(Rafael);
        ContaPoupanca poupanca3 = new ContaPoupanca(Rafael);

        cc.depositar(700);
        cc.transferir(347, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        c1.depositar(100);
        c1.transferir(50,poupanca1);

        c1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        c2.depositar(300);
        c2.transferir(177, poupanca3);

        c2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        c3.depositar(77);
        c3.transferir(17,poupanca3);

        c3.imprimirExtrato();
        poupanca3.imprimirExtrato();

        poupanca.simulacaoDeRendimento(poupanca.getSaldo());
        poupanca1.simulacaoDeRendimento(poupanca.getSaldo());
        poupanca2.simulacaoDeRendimento(poupanca.getSaldo());
        poupanca3.simulacaoDeRendimento(poupanca.getSaldo());

    }
}
