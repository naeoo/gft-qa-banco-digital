public class ContaCorrente extends Conta{

    private double limite = 500;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println(" = = = = Conta Corrente = = = =");
        infComuns();
        System.out.printf("\nLimite de crédito: %.2f", getLimite());
        System.out.printf("\nSaldo com Limite: %.2f\n\n", getSaldo() + getLimite());
    }
}
