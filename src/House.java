public abstract class House {

  private String address;

  public House(String address) {
    this.address = address;
  }


  public void setHome(String address) {
    this.address = address;
  }

  public String getHome() {
    return address;
  }

  public abstract void destroyPHouse(PrivateHouse pHouse);

  public abstract void destroyFlat(Flats flat);

}