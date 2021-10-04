package hospital.paciente;

public class Paciente3eraEdad extends Paciente {

	protected String codigoBeneficion = "";

	public String getCodigoBeneficion() {
		return codigoBeneficion;
	}

	public void setCodigoBeneficion(String codigoBeneficion) {
		this.codigoBeneficion = codigoBeneficion;
	}

	@Override
	public String toString() {
		return "Paciente3eraEdad [codigoBeneficion=" + codigoBeneficion + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", codigoDeSeguro=" + codigoDeSeguro + "]";
	}

}
