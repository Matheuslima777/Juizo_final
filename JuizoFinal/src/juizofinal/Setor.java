
package juizofinal;


public enum Setor {
      RECURSOS_HUMANOS("Recursos financeiros"),
      FINANCEIRO("Financeiro"),
      OPERACOES("Operacoes");
      
      protected String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public static Setor getRECURSOS_HUMANOS() {
        return RECURSOS_HUMANOS;
    }

    public static Setor getFINANCEIRO() {
        return FINANCEIRO;
    }

    public static Setor getOPERACOES() {
        return OPERACOES;
    }

    public String getTexto() {
        return texto;
    }
      
      
      
}
