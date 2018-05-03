package thread;

import com.sun.istack.internal.Nullable;
import org.omg.CORBA.LocalObject;

/**
 * Created by shuqi on 2018/4/25.
 */
public class Thread01  extends  Thread{
    int i;

    @Override
    public void run() {

    }
    protected  static int k =0;
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            new Thread("" + i) {
                @Override
                public void run() {
                    k = k + 3;
                    System.out.println("哈哈哈11" + (k));
                }
            }.start();
        }
    }

}
