package programacion.seccion26;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    AMERICA(34),
    OCEANIA(14),
    ASIA(44);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }


}
