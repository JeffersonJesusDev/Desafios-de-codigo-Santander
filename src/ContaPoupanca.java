class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.numero = numero;
        this.titular=titular;
        this.saldo=saldo;
        this.taxaJuros=taxaJuros;

    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " +taxaJuros+"% ");
    }
}
