

public class cla {
  public static void main(String[] args) {
    circle Cir = new circle(5);
    reactangle Rec = new reactangle(6, 70);
    double cirArea = Math.PI * Math.pow(Cir.radius , 2);
    double recArea = Rec.height * Rec.breath;
    System.out.printf("Area of circle :  %f , Area of reactangle %f " , cirArea , recArea);
  }
}
