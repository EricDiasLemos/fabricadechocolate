public class CaldeiraChocolate {

    private boolean vazia = true;
    private boolean fervida = false;
    private static CaldeiraChocolate instancia = null;


    private CaldeiraChocolate() {
    }


    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }


    public void encher() {
        if (vazia) {
            vazia = false;
            fervida = false;
            System.out.println("Caldeira foi preenchida com leite e chocolate.");
        } else {
            System.out.println("A caldeira já está cheia.");
        }
    }

    public void ferver() {
        if (!vazia && !fervida) {
            fervida = true;
            System.out.println("A mistura foi fervida.");
        } else {
            System.out.println("A caldeira está vazia ou a mistura já foi fervida.");
        }
    }


    public void drenar() {
        if (!vazia && fervida) {
            vazia = true;
            System.out.println("A mistura foi drenada.");
        } else {
            System.out.println("Não é possível drenar. A mistura não foi fervida ou a caldeira já está vazia.");
        }
    }
}