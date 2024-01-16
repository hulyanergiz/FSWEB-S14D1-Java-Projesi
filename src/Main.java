import com.workintech.company.HRManager;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.geometricObjects.Circle;
import com.workintech.geometricObjects.Cuboid;
import com.workintech.geometricObjects.Cylinder;
import com.workintech.geometricObjects.Rectangle;


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());


        System.out.println("------------------------");

        System.out.println("addEmployee Test Outputs");
        JuniorDeveloper jDev=new JuniorDeveloper(1,"Junior Dev",30000);
        JuniorDeveloper jDev2=new JuniorDeveloper(2,"Junior Dev 2",30000);
        MidDeveloper mDev=new MidDeveloper(3,"Mid Dev",45000);
        MidDeveloper mDev2=new MidDeveloper(4,"Mid Dev 2",45000);
        SeniorDeveloper sDev=new SeniorDeveloper(5,"Senior Dev",65000);
        HRManager hrManager=new HRManager(6,"HR Manager",80000);
        hrManager.addEmployee(jDev,-1);
        hrManager.addEmployee(jDev,5);
        hrManager.addEmployee(jDev,1);
        hrManager.addEmployee(jDev,2);
        hrManager.addEmployee(jDev2,2);
        hrManager.addEmployee(mDev,1);
        hrManager.addEmployee(mDev,2);
        hrManager.addEmployee(mDev2,1);
        hrManager.addEmployee(sDev,1);


        System.out.println();








    }
}