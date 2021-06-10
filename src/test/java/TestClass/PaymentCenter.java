package TestClass;

import org.testng.annotations.Test;
import utils.Utility;

public class PaymentCenter extends Utility {

    @Test
    public void bayarVirtualAccountBCA(){
        try {

            Thread.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
