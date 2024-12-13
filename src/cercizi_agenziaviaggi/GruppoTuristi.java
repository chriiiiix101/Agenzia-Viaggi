/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cercizi_agenziaviaggi;

/**
 *
 * @author Cercizi Christian
 */
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
        
        
public class GruppoTuristi implements Runnable {
    
    private String nazionalita;
    private int numeroTuristi;
    private Semaphore semaforoPorto;
    
    
    public GruppoTuristi(String nazionalita,int numeroTuristi, Semaphore semaforoPorto) {
       
       this.nazionalita = nazionalita;
       this.numeroTuristi = numeroTuristi;
       this.semaforoPorto = semaforoPorto;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("Partenza dei turisti:" + nazionalita );
            TimeUnit.SECONDS.sleep(2);
            
            System.out.println("I turisti" + nazionalita + "sono arrivati al porto!");
            TimeUnit.SECONDS.sleep(1);
            
            System.out.println("I turisti" + nazionalita + "hanno pagato il biglietto!");
            TimeUnit.SECONDS.sleep(1);       
        }
    }
    
    
}
