package br.ufc.quixada.poo;

import java.time.LocalDateTime;
import java.time.Duration;

public class Ticket {
  private final Veiculo veiculo;
  private final LocalDateTime horaEntrada;
  private double valorPago;
  private boolean pago;

  public Ticket(Veiculo veiculo) {
    this.veiculo = veiculo;
    this.horaEntrada = LocalDateTime.now();
  }

  public double getValorPago() {
    return valorPago;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public boolean isPago() {
    return pago;
  }

  public LocalDateTime getHoraEntrada() {
    return horaEntrada;
  }

  private void calcularValor(Duration duracao) {
    valorPago = veiculo.calcularValor(duracao);
  }

  public boolean registrarSaida(LocalDateTime horaDeSaida) {
    calcularValor(Duration.between(horaEntrada, horaDeSaida));

    pago = true;

    return true;
  }
}
