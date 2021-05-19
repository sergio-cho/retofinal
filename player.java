package retofinal;

public class player {
    public int pplayer;

    public int getPplayer() {
        return pplayer;
    }

    public void setPplayer(int pplayer) {
        this.pplayer = pplayer;
    }

    public int reductor(int pplayer){
        pplayer-=1;
        System.out.println("Tu poder ha reducido y es "+pplayer);
        return pplayer;
    }

    public int aunmentar(int pplayer){
        pplayer+=1;
        System.out.println("Tu poder ha aunmentado y es "+pplayer);

        return pplayer;
    }
}
