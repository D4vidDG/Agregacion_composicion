
package agregacion_composicion;


public class Motor {
    private double potencia;
    private Eje eje_motor;

    public double getPotencia() {
        return potencia;
    }
    public Eje getEje_motor() {
        return eje_motor;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setEje_motor(Eje eje_motor) {
        this.eje_motor = eje_motor;
    }

    public Motor(double potencia, Eje eje_motor) {
        this.potencia = potencia;
        this.eje_motor = eje_motor;
    }

   
}
