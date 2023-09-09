// O item pode ser um servico ou um produto... usar logica booleana
public class Item {
    float valor;
    float valorFinal;
    boolean produtoCheck; // para checar se eh um produto ou um servico

    public Item(float valor, boolean prodCheck){
        this.valor = valor;
        this.produtoCheck = prodCheck;
    }

    public void setValorFinal(float iss, float icms, float ipi){
        this.valorFinal = this.valor + iss + icms + ipi;
    }
}
