public class Main {
public static void main(String[] args) {
Coque coque = new Coque();
Cabine cabine = new Cabine();
Pont pont = new Pont();
Voile voile = new Voile();
Mat mat = new Mat()
Bateau bateau = new Bateau(coque,cabine,pont,mat,id,age,volume);
System.out.println(bateau.toString(bateau));
}

}