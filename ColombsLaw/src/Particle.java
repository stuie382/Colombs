public class Particle {
    private final float mass;
    private final float xPos;
    private final float yPos;

    public Particle(float mass, float xPos, float yPos) {
	this.mass = mass;
	this.xPos = xPos;
	this.yPos = yPos;
    }

    public float getMass() {
	return mass;
    }

    public float getXPos() {
	return xPos;
    }

    public float getYPos() {
	return yPos;
    }

    @Override
    public String toString() {
	return "Particle [mass=" + mass + ", xPos=" + xPos + ", yPos=" + yPos
		+ "]";
    }

}
