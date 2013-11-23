public class CalcColombsLaw {

    private final Particle particle1;
    private final Particle particle2;

    public CalcColombsLaw(Particle particle1, Particle particle2) {
	this.particle1 = particle1;
	this.particle2 = particle2;
    }

    public double calcForce() {
	float deltaX = calcDelta(particle1.getXPos(), particle2.getXPos());
	float deltaY = calcDelta(particle1.getYPos(), particle2.getYPos());
	double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	double force = ((particle1.getMass() * particle2.getMass()) / (distance * distance));
	return force;
    }

    private float calcDelta(float x, float y) {
	return x - y;
    }
}
