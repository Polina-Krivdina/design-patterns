package creational;

public class BuilderTest {
    public static void main(String[] args) {
        House house = new House.Builder()
                .foundation("Concrete")
                .structure("Wood")
                .roof("Tiles")
                .hasGarage(true)
                .hasSwimmingPool(false)
                .hasGarden(true)
                .build();

        System.out.println(house);
    }
}

