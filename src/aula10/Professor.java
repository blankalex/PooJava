package aula10;

/**
 * Created by Pablo on 09/05/2017.
 */
public class Professor extends Pessoa10 {
    //Atributos
    private String especialidade;
    private float salario;

    //Metodos públicos
    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
