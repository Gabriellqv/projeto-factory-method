// Main.java
import fabricas.FabricaVeiculos;
import fabricas.FabricaCarros;
import fabricas.FabricaMotos;
import veiculos.Veiculo;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculos fabricaCarros = new FabricaCarros();
        FabricaVeiculos fabricaMotos = new FabricaMotos();

        Veiculo carro = fabricaCarros.criarVeiculo();
        Veiculo moto = fabricaMotos.criarVeiculo();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
    }
}
