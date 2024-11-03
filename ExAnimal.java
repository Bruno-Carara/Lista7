package Lista7;

public class ExAnimal {
	
	private String alimentacao;

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExAnimal [alimentacao=");
		builder.append(alimentacao);
		builder.append("]");
		return builder.toString();
	}
}
