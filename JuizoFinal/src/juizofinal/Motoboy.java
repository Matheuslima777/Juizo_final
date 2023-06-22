
package juizofinal;

import java.time.LocalDate;


public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CARTEIRA DE HABILITACAO: " + carteiraDeHabilitacao ;
    }
    
    
    
    
}
