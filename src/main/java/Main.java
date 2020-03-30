/*
Utiliza Clases, arreglos , para cambiar de lugar un switch

Imagina hay 4 microorganismos que están un cuerpo humano, donde estos humanos tienen los órganos básicos: cerebro, corazón, pulmones , hígado, estomago, boca, intestinos, estos órganos son los lugares donde los microorganismos van a moverse.
Los 4 microorganismos empezaran en la boca y cada iteración de el ciclo del programa , eligirán un lugar aleatorio a donde moverse individualmente.
Los microorganismos tendrán 256 vidas, cada vez que se muevan por el hígado, su vida se reduce a la mitad ( no uses operaciones aritméticas).

El programa se acaba cuando todos 4 microorganismos tengan su vida en cero.

 */

public class Main {

    public static void main(String[] args) {

        int opc=0; //opc que generara numero aleatorio
        int micro=0;

        //arrays de objetos
        Microbios arrayMicros[]=new Microbios[4];
        Humano arrayOrganos[]=new Humano[7];


        arrayMicros[0]=new Microbios("Micro1",256);
        arrayMicros[1]=new Microbios("Micro2",256);
        arrayMicros[2]=new Microbios("Micro3",256);
        arrayMicros[3]=new Microbios("Micro4",256);

        arrayOrganos[0]=new Humano("Cerebro");
        arrayOrganos[1]=new Humano("Corazon");
        arrayOrganos[2]=new Humano("Pulmones");
        arrayOrganos[3]=new Humano("Intestinos");
        arrayOrganos[4]=new Humano("Estomago");
        arrayOrganos[5]=new Humano("Boca");
        arrayOrganos[6]=new Humano("Higado");


        opc=(int)(Math.random()*6+1); //genera numero aleatorio para pasar de organo a organo
        System.out.println("Numero Generado "+opc);

        do {
            if(micro==0 && arrayMicros[0].getVidas()>=256 || arrayMicros[1].getVidas()>=256 || arrayMicros[2].getVidas()>=256 || arrayMicros[3].getVidas()>=256){
                System.out.println(arrayMicros[0].toString()+" Se encuentra en el "+arrayOrganos[5].toString());
                System.out.println(arrayMicros[1].toString()+" Se encuentra en el "+arrayOrganos[5].toString());
                System.out.println(arrayMicros[2].toString()+" Se encuentra en el "+arrayOrganos[5].toString());
                System.out.println(arrayMicros[3].toString()+" Se encuentra en el "+arrayOrganos[5].toString());
                System.out.println(micro);
            }

            switch (opc) {
                case 0:
                    System.out.println(arrayMicros[micro].toString()+" Se encuentra en el "+arrayOrganos[0].toString());
                    System.out.print("\n");break;

                case 1:
                    System.out.println(arrayMicros[micro].toString()+" Se encuentra en el "+arrayOrganos[1].toString());
                    System.out.print("\n");break;

                case 2:
                    System.out.println(arrayMicros[micro].toString()+" Se encuentra en el "+arrayOrganos[2].toString());
                    System.out.print("\n");break;

                case 3:
                    System.out.println(arrayMicros[micro].toString()+" Se encuentra en el "+arrayOrganos[3].toString());
                    System.out.print("\n");break;

                case 4:
                    System.out.println(arrayMicros[micro].toString()+" Se encuentra en el "+arrayOrganos[4].toString());
                    System.out.print("\n");break;

                case 6:

                    arrayMicros[micro].DVidas();

                    if(arrayMicros[micro].getVidas() == 1)
                        arrayMicros[micro].FindeVida();

                    System.out.println(arrayMicros[micro].toString()+" Se encuentra en el "+arrayOrganos[6].toString());
                    System.out.print("\n");
                    break;

            }

            opc=(int)(Math.random() * 6)+1; //genera el numero aleatorio para desplazarse a otro organo
            micro++;

            if(micro==4){
                micro=0; //cada vez que micro (contador) llegue a 4 lo igualamos a cero hasta que se decrementen vidas
            }

        }while(arrayMicros[0].getVidas()!=0 || arrayMicros[1].getVidas()!=0 || arrayMicros[2].getVidas()!=0 || arrayMicros[3].getVidas()!=0); //Bucle hasta que todos los micros vidas llegue a cero
    }
}
