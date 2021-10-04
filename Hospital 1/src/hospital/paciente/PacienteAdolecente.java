package hospital.paciente;

public class PacienteAdolecente extends Paciente {

	protected String codigoDescuento = "";

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	@Override
	public String toString() {
		return "PacienteAdolecente [codigoDescuento=" + codigoDescuento + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", codigoDeSeguro=" + codigoDeSeguro + "]";
	}

}
