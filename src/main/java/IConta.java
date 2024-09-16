public interface IConta {

    void sacar (double valor);
    void despositar (double valor);
    void transferir (double valor, Conta conta);
    void imprimirExtrato();
}
