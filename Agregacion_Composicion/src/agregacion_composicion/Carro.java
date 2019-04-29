
package agregacion_composicion;

public class Carro {
    private String placa;
    private String marca;
    private Llanta [][] llantas;
    private Eje [] ejes;
    Motor motor;
    
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public Llanta[][] getLlantas() {
        return llantas;
    }
    public Eje[] getEjes() {
        return ejes;
    }
    public Motor getMotor() {
        return motor;
    }
 
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setLlantas(Llanta[][] llantas) {
        this.llantas = llantas;
    }
    public void setEjes(Eje[] ejes) {
        this.ejes = ejes;
    }

    public Carro(String placa, String marca, Llanta[][] llantas, Eje[] ejes, double potencia, Eje eje_motor) {
        this.placa = placa;
        this.marca = marca;
        this.llantas = llantas;
        this.ejes = ejes;
        this.motor=new Motor (potencia,eje_motor);
    }

   public void mostrarCarro (){
       System.out.println("Placa de carro:"+this.placa);
       System.out.println("Marca de carro:"+this.marca);
       System.out.println("Potencia motor:"+this.motor.getPotencia());
       System.out.println("Marca Eje motor:"+this.motor.getEje_motor().getMarca());
       System.out.println("Marca de Llantas:"+this.llantas[0][0].getMarca());
       System.out.println("Diametro de Llantas:"+this.llantas[0][0].getDiametro());
       System.out.println("Eje de Llantas:"+this.ejes[0].getMarca());
       int contadorllantas=0;
       for(int i=0;i<2;i++){
           for(int k =0;k<2;k++){
               if(llantas [i][k]!=null){
                   contadorllantas++;
               }
           }
       }
       System.out.println("Numero de llantas:"+contadorllantas);
        int contadorejes=0;
       for(int i=0;i<2;i++){
               if(ejes[i]!=null){
                   contadorejes++;            
           }
       }
       System.out.println("Numero de ejes para llantas:"+contadorejes);
       System.out.println("Potencia de motor del eje asociado al motor:"+this.motor.getEje_motor().getmotor().getPotencia());
       int contador_llantas_eje=0;
       for(int i=0;i<2;i++){
               if(this.ejes[0].getllantas()[i]!=null){
                   contador_llantas_eje++;
               }
                               
           }
       System.out.println("Numero de llantas de cada eje:"+contador_llantas_eje);
       
   }
    
    
    
    
    
}
