public class Vehicle {
    private String colour;

    public void myColour(String colour) {
        this.colour = colour;
    }

      public  String getColour(){
        return colour;

        }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.myColour( " red");

        System.out.println(vehicle.getColour());
    }


}
