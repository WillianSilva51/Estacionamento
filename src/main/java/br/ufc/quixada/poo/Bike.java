package br.ufc.quixada.poo;

public class Bike extends Veiculo {

  public Bike(String id) {
    super(id);
    tipoVaga = TipoVaga.MOTO_E_BIKE;
  }

  public double calcularValor(Long duration) {
    return 3;
  }
}