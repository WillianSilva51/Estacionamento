package br.ufc.quixada.poo;

import java.time.Duration;

public class Carro extends Veiculo {

  public Carro(String id) {
    super(id);
  }

  public double calcularValor(Duration duration) {
    return Math.max(duration.toMinutes() * 0.1, 5);
  }
}