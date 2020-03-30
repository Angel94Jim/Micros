/**
 *
 */
public class Microbios{
    public String micro;
    public int vidas;

    public Microbios(String micro,int vidas){
        this.micro=micro;
        this.vidas=vidas;
    }

    public String getMicro() {
        return micro;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setMicro(String micro) {
        this.micro = micro;
    }

    public int DVidas(){
        vidas=vidas>>1; //recorre nivel bit pone 0
        return vidas;
    }

    public int FindeVida() {
        vidas=0;
        return vidas;
    }

    @Override
    public String toString() {
        return "Microbio: " +
                "'" + micro + '\'' +
                ", vidas=" + vidas +
                '}';
    }
}
