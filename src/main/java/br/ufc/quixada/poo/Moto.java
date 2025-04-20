package br.ufc.quixada.poo;

public class Moto extends Veiculo {

  public Moto(String id) {
    super(id);
    tipoVaga = TipoVaga.MOTO_E_BIKE;
  }

  public double calcularValor(Long duration) {
    return Math.max(duration * 0.05, 3);
  }
}
