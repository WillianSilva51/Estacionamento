package br.ufc.quixada.poo;

import java.time.Duration;

public class Bike extends Veiculo {

  public Bike(String id) {
    super(id);
  }

  public double calcularValor(Duration duration) {
    return 3;
  }
}