package Lista7;

public class ExMadeiras extends ExInstrumentoMusical{
	
	private int largura;

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExMadeiras [largura=");
		builder.append(largura);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
