import java.util.Scanner;

public class CoulombsLaw {
    private static Scanner sc;

    public static void main(String[] args) {
	sc = new Scanner(System.in);
	Particle particle1 = createParticle();
	Particle particle2 = createParticle();
	CalcCoulombsLaw calc = new CalcCoulombsLaw(particle1, particle2);
	double force = calc.calcForce();
	System.out.print("The force of the particles is:");
	System.out.printf("%.4f", force);
    }

    private static Particle createParticle() {
	System.out.println("--------");
	System.out.println("Enter Mass of particle:");
	float mass = sc.nextFloat();
	System.out.println("Enter the X-position of particle:");
	float xPos = sc.nextFloat();
	System.out.println("Enter the Y-position of particle:");
	float yPos = sc.nextFloat();
	return new Particle(mass, xPos, yPos);
    }

    private static class CalcCoulombsLaw {

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

    private static class Particle {
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
	    return "Particle [mass=" + mass + ", xPos=" + xPos + ", yPos="
		    + yPos + "]";
	}

    }

}
