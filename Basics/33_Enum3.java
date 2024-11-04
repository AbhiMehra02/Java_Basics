// Enum can't extend in other class
// it can : define method, constructor,variables



enum Laptop
{
    Macbook(2000),Xps(2200),Surface,ThinkPad(1800);
        
    private int price;

    private Laptop() {
        price=500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name() );
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

class Enum3
{
  public static void main(String[] args) {

        //  Laptop lap=Laptop.Macbook;
        // System.out.println(lap + " : "+ lap.getPrice());
        // lap.setPrice(2100);   
        // System.out.println(lap + " : "+ lap.getPrice());

        
        for(Laptop lap:Laptop.values()){
            System.out.println(lap + " : "+ lap.getPrice());
        }


  }   
}



