package Lista7;

public class ExAmbiente {

	private float area;

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExAmbiente [area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}
}
