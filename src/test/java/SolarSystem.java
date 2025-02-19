public class SolarSystem {


    public static void main(String[] args) {

        BasicStructure BB = new BasicStructure();

        BB.Planets="2";
        BB.Moon="2";
        BB.Stars="10";
        BB.Sun="1";

        System.out.println("Solar System is ready");

        FeatureSun Xros = new FeatureSun();
        Xros.temp="123";
        Xros.color="black";
        Xros.Radius="3.14 miles";

        Planet1 ZORO = new Planet1();
        ZORO.color = "pink";
        ZORO.radius = "12312313miles";

    }
}
