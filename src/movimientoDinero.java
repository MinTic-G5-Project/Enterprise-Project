public class movimientoDinero {
    private double movimientoMonto, montoPositivo, montonNegativo;
    private String conceptoMovimiento;

    public movimientoDinero(double movimientoMonto, double montoPositivo, double montonNegativo, String conceptoMovimiento) {
        this.movimientoMonto = movimientoMonto;
        this.montoPositivo = montoPositivo;
        this.montonNegativo = montonNegativo;
        this.conceptoMovimiento = conceptoMovimiento;
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

    public String getconceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setconceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }
}
