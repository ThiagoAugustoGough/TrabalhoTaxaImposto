public class Iss {

    //para encapsular o ISS, fiz a variavel ser privada e criei o getter
    private float issFinal;
    //Como ISS so eh aplicado sob servicos, existe esta checagem no construtor
    public Iss(Item item) {
        if(item.produtoCheck){
            return;
        }
        this.issFinal = (item.valor * 0.046F);
    }

    public float getIssFinal(){
        return this.issFinal;
    }
}
