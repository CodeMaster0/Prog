/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author a120075
 */
public class Carro {
        String placa;
        LocalTime horaEntrada;
        LocalTime horaSaida;
        LocalDate dataEntrada;
        LocalDate dataSaida;
    
 public Carro(String placa){
       this.placa = placa;
       this.horaEntrada = LocalTime.now();
       this.horaSaida = null;
       this.dataEntrada = LocalDate.now();
       this.dataSaida = null;
         
    }
 
 
}
