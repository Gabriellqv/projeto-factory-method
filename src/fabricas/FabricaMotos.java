// FabricaMotos.java
package fabricas;

import veiculos.Moto;
import veiculos.Veiculo;

public class FabricaMotos implements FabricaVeiculos {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}
