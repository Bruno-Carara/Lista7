package Lista7;

public class ExCordas extends ExInstrumentoMusical{
		
	private int quant_cordas;

	public int getQuant_cordas() {
		return quant_cordas;
	}

	public void setQuant_cordas(int quant_cordas) {
		this.quant_cordas = quant_cordas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExCordas [quant_cordas=");
		builder.append(quant_cordas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
