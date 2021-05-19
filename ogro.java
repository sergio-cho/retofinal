package retofinal;

public class ogro extends monstruo {
    //atributo
    private int ogro;

    //metodos

    public ogro() {
        ogro=(int) (Math.random() * (7 - 0 + 1) + 0);
    }

    public int getOgro() {
        return ogro;
    }
}
