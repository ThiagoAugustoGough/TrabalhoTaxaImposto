public class Icms {
    private float icmsFinal;

    public Icms(Item item){
        this.icmsFinal = item.valor * 0.17F;
    }

    public float getIcmsFinal(){
        return this.icmsFinal;
    }
}
