public class Main {
    public static void main(String[] args) {
        //  clientes
        Cliente cliente1 = new Cliente("Alice", "senha123");
        Cliente cliente2 = new Cliente("Bob", "senha456");

        //  contas
        Conta conta1 = new ContaCorrente(cliente1); // Exemplo de uma Conta Corrente
        Conta conta2 = new ContaPoupanca(cliente2); // Exemplo de uma Conta Poupança

        // Adicionar clientes ao banco
        Banco banco = new Banco();
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        //  depósito
        conta1.despositar(1000.00);
        conta2.despositar(2000.00);

        //  saque
        conta1.sacar(300.00);
        conta2.sacar(500.00);

        //  transferência
        conta1.transferir(200.00, conta2);

        // Imprimir informações das contas
        System.out.println("Conta 1 (Corrente) após operações:");
        conta1.imprimirInfoCc();

        System.out.println("\nConta 2 (Poupança) após operações:");
        conta2.imprimirInfoCc();

        //  imprimir lista de clientes
        banco.imprimirListaDeClientes();

        //  histórico de transações
        System.out.println("\nHistórico de transações Conta 1:");
        conta1.imprimirHistorico();

        System.out.println("\nHistórico de transações Conta 2:");
        conta2.imprimirHistorico();

        //  autenticação do cliente
        System.out.println("\nAutenticação Cliente 1:");
        boolean autenticado = cliente1.autenticar("senha123");
        System.out.println(autenticado ? "Autenticação bem-sucedida!" : "Falha na autenticação.");

    }
}
