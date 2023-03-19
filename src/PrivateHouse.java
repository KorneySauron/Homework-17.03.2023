public class PrivateHouse extends House {
  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return "Адрес: " + getHome();
  }

  @Override
  public void destroyPHouse(PrivateHouse pHouse) {
    System.out.println("Вы снесли частный дом!");
    pHouse = null;
  }

  @Override
  public void destroyFlat(Flats flats) {

  }
}