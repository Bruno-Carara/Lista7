package Lista7;

public class ExMamifero extends ExAnimal{
	
	private boolean possui_pelos;

	public boolean isPossui_pelos() {
		return possui_pelos;
	}

	public void setPossui_pelos(boolean possui_pelos) {
		this.possui_pelos = possui_pelos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExMamifero [possui_pelos=");
		builder.append(possui_pelos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
