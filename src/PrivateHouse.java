public class PrivateHouse extends House {
  public PrivateHouse (String address){
    super(address);
  }
  @Override
  public String toString(){
    return "Адрес: " + getHome();
  }
}