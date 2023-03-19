import java.io.*;
import java.util.*;

public class Main {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<House> houses = new ArrayList<>();

    System.out.print("Введите адрес вашего дома (многоквартирного): ");
    String flatAddress = br.readLine();

    System.out.print("Введите количество подъездов: ");
    int entrancesNumber = Integer.parseInt(br.readLine());

    String house1Address = "Улица Есенина, дом 1";
    String house2Address = "Улица Ленина, дом 3";

    Flats userFlat = new Flats(flatAddress, entrancesNumber);
    PrivateHouse house1 = new PrivateHouse(house1Address);
    PrivateHouse house2 = new PrivateHouse(house2Address);

    houses.add(userFlat);
    houses.add(house1);
    houses.add(house2);

    for (House house : houses){
      System.out.println(house);
    }
  }
}