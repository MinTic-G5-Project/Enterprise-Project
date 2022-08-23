public class movimientoDinero {
    private double movimientoMonto,
    montoPositivo,
    montonNegativo,
    Movimiento;

    public movimientoDinero(double movimientoMonto, double montoPositivo, double montonNegativo, double movimiento) {
        this.movimientoMonto = movimientoMonto;
        this.montoPositivo = montoPositivo;
        this.montonNegativo = montonNegativo;
        Movimiento = movimiento;
    }


    public movimientoDinero() {
    }

    public double getMovimientoMonto() {
        return movimientoMonto;
    }

    public void setMovimientoMonto(double movimientoMonto) {
        this.movimientoMonto = movimientoMonto;
    }

    public double getMontoPositivo() {
        return montoPositivo;
    }

    public void setMontoPositivo(double montoPositivo) {
        this.montoPositivo = montoPositivo;
    }

    public double getMontonNegativo() {
        return montonNegativo;
    }

    public void setMontonNegativo(double montonNegativo) {
        this.montonNegativo = montonNegativo;
    }

    public double getMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(double movimiento) {
        Movimiento = movimiento;
    }
}
