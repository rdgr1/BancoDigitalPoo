import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome = "Banco NOT";
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void removerCliente(String nome){
        List<Cliente> clientesParaRemover = new ArrayList<>();
        if(!clientes.isEmpty()){
            for(Cliente c : clientes){
                if(c.getNome().equalsIgnoreCase(nome));
            }
        }
        clientes.removeAll(clientesParaRemover);
    }

    public void imprimirListaDeClientes(){
        System.out.println(String.format("Lista de Cliente do %s",nome));
        for(Cliente c: clientes){
            System.out.println(c.getNome());
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco - " + nome +
                " Clientes: " + clientes;
    }
}
