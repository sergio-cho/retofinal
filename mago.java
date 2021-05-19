package retofinal;

public class mago  extends monstruo{

    //atributo
    private int mago;
    private int pmago;
    //metodos

    public mago() {
        mago=(int) (Math.random() * (1 - 0 + 1) + 0);
    }

    public int getMago() {
        return mago;
    }


    public int getPmago() {
        return pmago;
    }

    public void setPmago(int pmago) {
        this.pmago = pmago;
    }

    public void fallo(){
        System.out.println("Raios te salvaste");
    }
    public int capturo(int pmago){
        pmago+=1;
        System.out.println("El poder del mago es "+pmago);
        return pmago;
    }
    public int perdio(int pmago){
        pmago-=1;
        System.out.println("El poder del mago es "+pmago);
        return pmago;
    }
}
