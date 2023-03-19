import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите название вашего дома (многоквартирного): ");
    String flatAdress = br.readLine();
    System.out.print("Введите количество подъездов: ");
    int entrancesNumber = Integer.parseInt(br.readLine());

    Flats userFlat= new Flats(flatAdress, entrancesNumber);
  }
}