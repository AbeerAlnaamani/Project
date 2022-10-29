import java.util.ArrayList;

/**
 * Created by DELL on 06/10/2022.
 */
public class test {
    public static void main(String[] args) {

      lavorssprice store=new lavorssprice();
        System.out.println(store.menu());

        store.setBlueberryprice(5000);
        System.out.println("the price new is Blueberry  "+store.getBlueberryprice());
          store.setBlueberry("honey");
        System.out.println("the insted of Blueberry   "+store.getBlueberry());



    }
}
