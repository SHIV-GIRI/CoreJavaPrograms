package polymorphism.programs.shirtmaterial;

public class Shirt {

	float collarSize;
	float length;
	Enum material;

	public Shirt() {
		collarSize = 0;
		length = 0;
		material = ShirtMaterial.COTTON;

	} // Shirt two parameter Constructor   closing

	public Shirt(float collarSize, float length, Enum material) {

		this.collarSize = collarSize;
		this.length = length;
		this.material = material;
	} // Shirt three parameter Constructor  closing

	public String displayDetails() {
		return "Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]";
	} // displayDetails closing
} // Shirt class closing 
