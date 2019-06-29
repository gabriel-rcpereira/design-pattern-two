package pattern.memento.model;

public class State {

    private Contract contract;

    private State(Builder builder) {
        this.contract = builder.contract;
    }

    public Contract getContract() {
        return contract;
    }

    public static class Builder {

        private Contract contract;

        public Builder(Contract contract) {
            this.contract = new Contract.Builder()
                .withDate(contract.getDate())
                .withClientName(contract.getClientName())
                .withContractType(contract.getContractType())
                .build();
        }

        public State build() {
            return new State(this);
        }
    }
}
