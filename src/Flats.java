public class Flats extends House {

  private final int entrancesNumber;

  public Flats(String address, int entrancesNumber) {
    super(address);
    this.entrancesNumber = entrancesNumber;
  }

  public int getEntrancesNumber() {
    return entrancesNumber;
  }

  @Override
  public String toString() {
    return "Адрес: " + getHome() + " Количество подъездов: " + entrancesNumber;
  }

  @Override
  public void destroyFlat(Flats flats) {
    System.out.println("Вы снесли многоквартирный дом. " + flats.getEntrancesNumber() + " подъездов!");
    flats = null;
  }

  @Override
  public void destroyPHouse(PrivateHouse pHouse) {

  }
}