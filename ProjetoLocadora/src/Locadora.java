import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> frota;

    public Locadora() {
        this.frota = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(Veiculo
        )
    }

    public void aluguelVeiculo(int dias, int idVeiculos) {
        // implementar logica para alugar um carro/moto

        veiculo v = frota.get(idVeiculos - 1)
                double total = v.calculadora() * dias;

        System.out.println(" ===== Resumo do aluguel veiculo ====");
        System.out.println(" Veiculo: " + v.exibirDados());
        System.out.println("qtd dias: " + dias);
        System.out.println("Valor diaria");
    }
}
