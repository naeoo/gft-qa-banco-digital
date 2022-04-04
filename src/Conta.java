public abstract class Conta implements inteConta{

    /* Atributos para as Contas tipo Corrente e Poupança */
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private static final int AGENCIAPADRAO = 1;
    private static int SEQUENCIAL = 1;

    /* Geters e Seters para manipulação dos dados. */
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getAGENCIAPADRAO() {
        return AGENCIAPADRAO;
    }

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }
    public static void setSEQUENCIAL(int SEQUENCIAL) {
        Conta.SEQUENCIAL = SEQUENCIAL;
    }

    public Cliente getCliente(Cliente cliente) {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(Cliente cliente){
        setAgencia(Conta.getAGENCIAPADRAO());
        setNumero(Conta.getSEQUENCIAL());
        setCliente(cliente);
        System.out.println("Conta de " + cliente.getNome() + " Nº " + getNumero() + " criada.");
        setSEQUENCIAL(getSEQUENCIAL() + 1);
    }

    /* Métodos para manutenção das conta. */
    @Override
    public void saca(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Retirada de R$ " + valor + " efetuada na conta de " + cliente.getNome());
            System.out.println("Novo saldo, R$ " + getSaldo() + "\n");
        } else
            System.out.println("Saldo insuficiente para a transação na conta de " + cliente.getNome() + "\n");
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$ " + valor + " na conta de " + cliente.getNome());
        System.out.println("Novo saldo, R$ " + getSaldo() + "\n");
    }

    @Override
    public void transfere(double valor, Conta contaDestino) {
        saca(valor);
        contaDestino.deposita(valor);
    }

    @Override
    public void infComuns() {
        System.out.printf("Titular: %s", cliente.getNome());
        System.out.printf("\nCPF: %s", cliente.getCpf());
        System.out.printf("\nAgência: %s", getAgencia());
        System.out.printf("\nNumero: %s", getNumero());
        System.out.printf("\nSaldo: %.2f", getSaldo());
    }
}
