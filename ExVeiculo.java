package Lista7;

public class ExVeiculo {

	private boolean motos;

	public boolean isMotos() {
		return motos;
	}

	public void setMotos(boolean motos) {
		this.motos = motos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExVeiculo [motos=");
		builder.append(motos);
		builder.append("]");
		return builder.toString();
	}
}
