import java.util.Scanner;

public class CalcColombsLawTest {

    private static Scanner sc;

    public static void main(String[] args) {
	sc = new Scanner(System.in);
	Particle particle1 = createParticle();
	Particle particle2 = createParticle();
	CalcColombsLaw calc = new CalcColombsLaw(particle1, particle2);
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
	Particle particle = new Particle(mass, xPos, yPos);
	return particle;
    }

}
