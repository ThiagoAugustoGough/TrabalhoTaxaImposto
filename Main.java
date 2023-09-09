// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Criando um produto(prodCheck eh verdadeiro)
        Item prod1 = new Item(100.55F, true);
        Iss issProd1 = new Iss(prod1);
        Icms icmsProd1 = new Icms(prod1);
        Ipi ipiProd1 = new Ipi(prod1);
        prod1.setValorFinal(issProd1.getIssFinal(), icmsProd1.getIcmsFinal(), ipiProd1.getIpiFinal());

        //Criando um servico(prodCheck eh falso)
        Item serv1 = new Item(332.99F, false);
        Iss issServ1 = new Iss(serv1);
        Icms icmsServ1 = new Icms(serv1);
        Ipi ipiServ1 = new Ipi(serv1);
        serv1.setValorFinal(issServ1.getIssFinal(), icmsServ1.getIcmsFinal(), ipiServ1.getIpiFinal());

        System.out.println("Produto 1 :");
        System.out.println("Valor do produto sem taxa: " + prod1.valor);
        System.out.println("ISS: " + issProd1.getIssFinal());
        System.out.println("ICMS: " + icmsProd1.getIcmsFinal());
        System.out.println("IPI: " + ipiProd1.getIpiFinal());
        System.out.println("Valor incluindo taxas: " + prod1.valorFinal + "\n");

        System.out.println("Servico 1 :");
        System.out.println("Valor do produto sem taxa: " + serv1.valor);
        System.out.println("ISS: " + issServ1.getIssFinal());
        System.out.println("ICMS: " + icmsServ1.getIcmsFinal());
        System.out.println("IPI: " + ipiServ1.getIpiFinal());
        System.out.println("Valor incluindo taxas: " + serv1.valorFinal);

    }
}