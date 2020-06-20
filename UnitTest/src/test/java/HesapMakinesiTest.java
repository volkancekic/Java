import junit.framework.TestCase;
import org.junit.Assert;

public class HesapMakinesiTest extends TestCase {
    public void testTopla(){
        //on hazirlik
        HesapMakinesi hm=new HesapMakinesi();
        int a=4;
        int b=3;
        //metodu calistir
        int sonuc=hm.Topla(a,b);
        //kontrol
        Assert.assertEquals(7,sonuc);

    }
}