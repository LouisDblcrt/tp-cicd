package cicd.learn.tp1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "CI/CD Rocks!" );
        System.out.println("hotfix");
        
        Car car = new Car("500 abarth","fiat",15000);
        System.out.println(car.getMarque() +" "+car.getModele()+ " : "+car.getPrix());
    }
}
