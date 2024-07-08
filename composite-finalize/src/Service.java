public class Service {
    private Box box;

    public Service(){

    }
    public  void wrapUpOrder(
           Box... boxes
    ){
        this.box = new CompositeBox(boxes);
    }
    public double calculateTotal(){
        return box.calculate();
    }
}
