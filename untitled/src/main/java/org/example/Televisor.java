package org.example;

public class Televisor {

    private int canal = 5;
    private int volumen = 1;

    public Televisor(int canal ){
        if (canal < 99 || canal > 0){
            this.canal=canal;
        }
    }
    public Televisor(){

    }
    public int subircanal(){
        return canal ++;
    }
    public int bajarcanal(){
        return canal --;
    }
     public void getCanal(){
        this.canal=canal;
     }

     public void setCanal(int canal){

         if (canal < 99 || canal > 0){
             this.canal=canal;
             System.out.println("Canal:" + canal);
         }

     }

     public void getVolumen(){
        this.volumen=volumen;
     }
     public  void setVolumen(int volumen){

        if (volumen < 100){
             this.volumen = volumen;
            System.out.println("Volumen: " + volumen);
        }

     }
}
