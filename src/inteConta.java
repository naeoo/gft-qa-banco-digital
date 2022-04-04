public interface inteConta {

    void saca(double valor);

    void deposita(double valor);

    void transfere(double valor, Conta contaDestino);

    void imprimeExtrato();

    void infComuns();
}
