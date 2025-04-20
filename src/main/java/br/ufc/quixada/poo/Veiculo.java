package br.ufc.quixada.poo;

public abstract class Veiculo {
  private final String idenficador;
  protected TipoVaga tipoVaga;

  public Veiculo(String id) {
    idenficador = id;
    tipoVaga = TipoVaga.CARRO;
  }

  public String getIdentificador() {
    return idenficador;
  }

  public abstract double calcularValor(Long duration);
}
