package pattern.memento;

import pattern.memento.enums.ContractType;
import pattern.memento.exception.ContractException;
import pattern.memento.model.Contract;
import pattern.memento.model.Historical;
import pattern.memento.model.State;

import java.time.LocalDate;

public class MementoMain {

    public static void main(String[] args) throws ContractException {
        Historical historical = new Historical();

        Contract contract = new Contract.Builder()
                .withContractType(ContractType.NEW)
                .withClientName("Customer 1")
                .withDate(LocalDate.now())
                .build();

        historical.add(new State.Builder(contract).build());
        contract.forward();

        historical.add(new State.Builder(contract).build());
        contract.forward();

        historical.add(new State.Builder(contract).build());
        contract.forward();

        contract.restore(historical.getState(1));
    }
}
