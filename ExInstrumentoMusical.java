package Lista7;

public class ExInstrumentoMusical {

	private float preço;

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExInstrumentoMusical [preço=");
		builder.append(preço);
		builder.append("]");
		return builder.toString();
	}
}
