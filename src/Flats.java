public class Flats extends House {

  private final int entrancesNumber;

  public Flats(String address, int entrancesNumber) {
    super(address);
    this.entrancesNumber = entrancesNumber;
  }

  @Override
  public String toString(){
    return "Адрес: " + getHome() + "Количество подъездов: " + entrancesNumber;
  }
}