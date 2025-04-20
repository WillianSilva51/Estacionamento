package br.ufc.quixada.poo;

import java.time.Duration;

public class Moto extends Veiculo {

  public Moto(String id) {
    super(id);
  }

  public double calcularValor(Duration duration) {
    return Math.max(duration.toMinutes() * 0.05, 3);
  }
}
