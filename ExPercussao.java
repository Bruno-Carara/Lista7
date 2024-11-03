package Lista7;

public class ExPercussao extends ExInstrumentoMusical{

	private int peso;

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExPercussao [peso=");
		builder.append(peso);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
}
