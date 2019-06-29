package pattern.memento.model;

import pattern.memento.enums.ContractType;
import pattern.memento.exception.ContractException;

import java.time.LocalDate;

public class Contract {

    private LocalDate date;
    private String clientName;
    private ContractType contractType;

    private Contract() {
    }

    public LocalDate getDate() {
        return date;
    }

    public String getClientName() {
        return clientName;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void forward() throws ContractException {
        System.out.print(String.format("Forwarding the type from [%s].. ", contractType.name()));

        if (contractType == ContractType.NEW) contractType = ContractType.IN_PROGRESS;
        else if (contractType == ContractType.IN_PROGRESS) contractType = ContractType.SUCCESSFUL;
        else if (contractType == ContractType.SUCCESSFUL) contractType = ContractType.COMPLETED;
        else throw new ContractException("Invalid operation.");

        System.out.println(String.format("to [%s].", contractType.name()));
    }

    public void restore(State state){
        System.out.print(String.format("Restoring the contract from [%s].. ", contractType.name()));

        this.date = state.getContract().date;
        this.clientName = state.getContract().clientName;
        this.contractType = state.getContract().contractType;

        System.out.println(String.format("to [%s]. ", contractType.name()));
    }

    public static class Builder {

        private Contract contract = new Contract();

        public Builder withDate(LocalDate date) {
            this.contract.date = date;
            return this;
        }

        public Builder withClientName(String clientName) {
            this.contract.clientName = clientName;
            return this;
        }

        public Builder withContractType(ContractType contractType) {
            this.contract.contractType = contractType;
            return this;
        }

        public Contract build() {
            return contract;
        }
    }
}
