import java.util.Random;


public class RandomNumber {
    public static void main (String[] args) {
        fillBoxes();

    }

    public static void fillBoxes() {
        //Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int jarCount = rand.nextInt(300); // get random number (0...299)
        int fullBoxCount = jarCount / 7;
        int extraJars = jarCount % 7;
    
        System.out.println(jarCount + " \tjars to pack" );
        System.out.println(fullBoxCount + " boxes were filled");
        System.out.println(extraJars + "jars left over");

        System.out.println(rand.nextInt(6)+1 ) ;

        ;
        
    }


}
