import java.util.ArrayList;
import java.util.Scanner;

public class ShipType {
    private ArrayList<Ship> list;

    ShipType(){
        list = new ArrayList<>();
        String data = "Patrol Boat\n2\n"
                 + "Patrol Boat\n2\n"
                 + "SubMarine\n3\n"
                + "Destroyer Boat\n4\n"
                + "Battle Ship\n5\n"
                ;
        Scanner sc = new Scanner(data);
        while(true){
            if(sc.hasNextLine() == false) break;
            Ship ship = new Ship();
            ship.setName(sc.nextLine());
            ship.setLength(Integer.parseInt(sc.nextLine()));
            list.add(ship);
        }
    }
    public ArrayList<Ship> getList() {
        return list;
    }
}
