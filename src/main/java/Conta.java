import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> historicoTransacoes; // Lista para armazenar o histórico de transações

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historicoTransacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            registrarTransacao(String.format("Saque de R$%.2f", valor));
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public void despositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            registrarTransacao(String.format("Depósito de R$%.2f", valor));
        } else {
            System.out.println("Valor inválido.");
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            conta.despositar(valor);
            registrarTransacao(String.format("Transferência de R$%.2f para Conta %d", valor, conta.numero));
            conta.registrarTransacao(String.format("Recebimento de transferência de R$%.2f da Conta %d", valor, this.numero));
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    protected void imprimirInfoCc() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }

    // Método para registrar transações
    protected void registrarTransacao(String descricao) {
        historicoTransacoes.add(descricao);
    }

    // Método para imprimir o histórico de transações
    public void imprimirHistorico() {
        if (historicoTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (String transacao : historicoTransacoes) {
                System.out.println(transacao);
            }
        }
    }
}
