
package juizofinal;

import java.time.LocalDate;


public class Diretor extends Funcionario implements Contratacao{
    private double PREMIO = 0.2;

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n PREMIO: " + PREMIO ;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        this.admitir(funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        this.demitir(funcionario);
    }
    
    
    
}
