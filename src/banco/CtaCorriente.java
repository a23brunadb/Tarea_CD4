package banco;

/**
@author Bruna
*/
public class CtaCorriente {
    private String nombre;
    private String cuenta;
    private double saldocuenta;
    private double interes;

    /**
     * obtiene nombre asociado a la cuenta
     * 
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * establece el nombre asociado a la cuenta
     * 
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtiene la cuenta
     * 
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * establece la cuenta
     * 
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * obtiene el saldo de la cuenta
     * 
     * @return the saldocuenta
     */
    public double getSaldocuenta() {
        return saldocuenta;
    }

    /**
     * establece el saldo de la cuenta
     * 
     * @param saldocuenta the saldocuenta to set
     */
    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**
     * obtiene el interés de la cuenta
     * 
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * establece el interés de la cuenta
     * 
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }

    /**
     * @param nombre nombre asociado a la cuenta
     * @param cuenta la cuenta
     * @param saldocuenta el saldo de la cuenta
     * @param interes el interés asociado a la cuenta
     */
    public CtaCorriente()
    {
    }
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
    
    /**
     * ingresar dinero en cuenta
     * 
     * @throws Exception si la cantidad es menor que 0
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldocuenta(getSaldocuenta() + cantidad);
    }

    /**
     * retirar dinero de la cuenta
     * 
     * @throws Exception si la cantidad es menor o igual que 0 o si no hay suficiente saldo en la cuenta
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldocuenta()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldocuenta(getSaldocuenta() - cantidad);
    }
}