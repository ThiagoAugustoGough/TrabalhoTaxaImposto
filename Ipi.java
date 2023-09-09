public class Ipi {
    private float ipiFinal;

    public Ipi(Item item) {
        if(item.produtoCheck == false)
            return;

        this.ipiFinal = item.valor * 0.25F;
    }

    public float getIpiFinal(){
        return this.ipiFinal;
    }


    }
