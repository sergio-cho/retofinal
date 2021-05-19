package retofinal;

import java.util.Scanner;

public class clientebueno {
    public static void main(String[] args) {
        mago mago1 = new mago();
        ogro ogro1 = new ogro();
        player p1 = new player();
        Scanner entrada = new Scanner(System.in);
        boolean x = false;
        int hadas = 0;
        int thadas = 0;
        int pplayer = 5;
        p1.setPplayer(pplayer);
        int pmago = 7;
        int hadasR = 10;
        char cont;
        int hadasC = 0;

        System.out.println("El poder del jugador es " + p1.getPplayer());
        System.out.println("Las hadas capturadas son " + hadasR);

        while (x == false) {
            System.out.println("Vamos recuerda que cada que salves 10 hadas tu póder disminuye");
            System.out.println("Ingresa n para dejar de jugar \n" + "Ingresa s para seguir en el juego \n" + "Ingresa a para ayudarte un poco ");
            cont = entrada.next().charAt(0);
            if (cont == 'S' || cont == 's') {
                if (ogro1.getOgro() != 0) {
                    System.out.println("Haz encontrado ogros , sal de ahi ");
                    if (ogro1.getOgro() < p1.getPplayer()) {
                        System.out.println("Cielos viejo te han quitado 1 de poder ");
                        pplayer=p1.reductor(pplayer);
                        p1.setPplayer(pplayer);
                    } else {
                        System.out.println("Cielos viejo que suerte que ese un ogro bastante debil has ganado 1 pp");
                        pplayer=p1.aunmentar(pplayer);
                        p1.setPplayer(pplayer);
                    }
                }
                //Parte del mago
                System.out.println("Tu poder es "+p1.getPplayer());
                System.out.println("Vamos a salvar a las hadas");
                mago1.setPmago(pmago);
                if (mago1.getMago() != 0) {
                    System.out.println("Raios te quito 1 de poder");
                    pplayer=p1.reductor(pplayer);
                    p1.setPplayer(pplayer);
                } else {
                    System.out.println("Que suerte no nos quito nada");
                    mago1.fallo();
                }
                hadas = (int) (Math.random() * (10 - 1 + 1) + 1);
                System.out.println("Haz rescatado " + hadas + " hadas");
                hadasR = hadasR - hadas;
                System.out.println("Siguen atrapadas " + hadasR);
            }
            if (cont=='N'  || cont=='n'){
                x=true;
            }
            if (cont=='A' || cont=='a'){
                System.out.println("Claro que si viejo te ayudaremos aunmentando un poco tu poder");
                if(p1.getPplayer()> mago1.getMago()){
                    System.out.println("Lo siente pero ya no puedo aunmentar tu poder mas seria muy facil");
                }else {
                    pplayer=p1.aunmentar(pplayer);
                    p1.setPplayer(pplayer);
                }
            }
            hadasC=(int)(Math.random()*(10-1+1)+1);
            System.out.println("El mago capturo " +hadasC);
            hadasR=hadasR+hadasC;
            if (hadasC==10){
                pmago=mago1.capturo(pmago);
                mago1.setPmago(pmago);
                hadasC=hadasC-10;
            }
            thadas=thadas+hadas;
            if (hadas==10){
                System.out.println("Que genial eres liberaste a las hadas y tu poder subio");
                pplayer=p1.aunmentar(pplayer);
                p1.setPplayer(pplayer);
                System.out.println("El mago perdio poder");
                pmago=mago1.perdio(pmago);
                mago1.setPmago(pmago);
                hadas=hadas-10;
            }
            System.out.println("Poder del mago "+mago1.getPmago());
            System.out.println("Tu poder "+p1.getPplayer());
            if (pmago<=0 || pplayer<= 0 || hadasR <=0){
                x=true;
            }
        }
        if (pmago<=0){
            System.out.println("Felicidades ganaste");
        }
        else {
            System.out.println("Lastima vuelve a jugar");
        }
        System.out.println("Tu puntuacion es la siguiente");
        System.out.println("Total de hadas por rescatar "+thadas);
    }
}
