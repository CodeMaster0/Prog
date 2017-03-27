/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a120075
 */
public class Estacionamento {
    
    int quant;
    List<Carro> vagas;
    
    public Estacionamento(int vagas){
       this.quant = vagas;
       this.vagas = new ArrayList<Carro>(vagas);
    }
    
    public boolean cheia(int vagas){
        return this.vagas.size() == vagas;
    }
    
    public void adicionarCarro(Carro aux){
        if(cheia(this.quant)){
            System.out.println("O Estacionamento está cheio");
        }else{
        vagas.add(aux);
        }
    }
    
    public void removerCarro(Carro aux){
        aux.dataSaida = LocalDate.now();
        aux.horaSaida = LocalTime.now();
         long horas = ChronoUnit.HOURS.between(aux.horaSaida, aux.horaEntrada);
         long dias = ChronoUnit.DAYS.between(aux.dataSaida, aux.dataEntrada);
         float preco = 0;
         if(dias!=0){
             dias = dias * 24;
         }
         horas =+ dias;
         
         if(horas == 1 && dias == 0){
             preco = 4;
         }
         else if(horas >= 1 && dias == 0){
             preco = 4 + horas*2;
            }
         if(horas > 1 && dias > 0){
             preco = 4 + dias*2 + horas*2;
         }
         
        System.out.println("Placa: " + aux.placa);     
        System.out.println("Horas: " + horas);
        System.out.println("Hora da Entrada: "+ aux.horaEntrada);
        System.out.println("Hora da Saída: " + aux.horaSaida);
        System.out.println("Data da Entrada: " + aux.dataEntrada);
        System.out.println("Data da Saída: " + aux.dataSaida);
        System.out.println("Preço total: " + preco + " U$ ");
        vagas.remove(aux);
    }
    public void ListarVagas(){
        for(int i=0;i<this.vagas.size();i++){
               System.out.println("Placa: " + this.vagas.get(i).placa);
               System.out.println("Data de Entrada: " + this.vagas.get(i).dataEntrada);
               System.out.println("Hora de Entrada: " + this.vagas.get(i).horaEntrada);
        }
    }
}
