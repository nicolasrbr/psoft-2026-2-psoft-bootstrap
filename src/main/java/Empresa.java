import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
    private String nome;
    private PO po;
    private List<Produto> produtos = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PO getPO() {
        return po;
    }

    public void setPO(PO po) {
        this.po = po;
    }

    public void adicionarProduto(Produto produto) {
        if (produto != null && !produtos.contains(produto)) {
            produtos.add(produto);
        }
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    @Override
    public String toString() {
        return nome + " | PO: " + po + " | Produtos: " + produtos.size();
    }
}
