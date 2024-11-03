package Lista7;

public class ExBanheiro extends ExAmbiente{

	private boolean banheira;

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExBanheiro [banheira=");
		builder.append(banheira);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
