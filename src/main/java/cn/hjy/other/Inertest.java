package cn.hjy.other;
import cn.hjy.other.Enclosingone.InsideOne;
/**
 * Created by hjy on 18-5-6.
 */

class Enclosingone{
    public class InsideOne{};
}

public class Inertest {
    public static void main(String[] args) {
        Enclosingone eo = new Enclosingone();
        InsideOne ei = eo.new InsideOne();
        Enclosingone.InsideOne ei1 = eo.new InsideOne();
    }
}
