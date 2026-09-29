public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        nome = nome;
        salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        salario = salario + percentual;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}