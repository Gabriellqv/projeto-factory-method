// FabricaCarros.java
package fabricas;

import veiculos.Carro;
import veiculos.Veiculo;

public class FabricaCarros implements FabricaVeiculos {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
