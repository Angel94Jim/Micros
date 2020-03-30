public class Humano {
    public String organo;

    public Humano(String organo){

        this.organo=organo;
    }

    public String getOrgano() {

        return organo;
    }

    public void setOrgano(String organo) {

        this.organo = organo;
    }

    @Override
    public String toString() {
        return "Humano: " +
                "Organo atacado: '" + organo + '\'' +
                '}';
    }
}
