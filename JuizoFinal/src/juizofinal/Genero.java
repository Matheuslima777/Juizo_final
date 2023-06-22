
package juizofinal;


public enum Genero {
    
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    protected String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
