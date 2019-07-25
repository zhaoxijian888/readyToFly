package Test;

import com.testfly.fly.FlyApplication;
import org.springframework.boot.SpringApplication;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @Description: TODO
 * @Auther: ZhaoXJ
 * @Date: 2019/7/25 0025 18:30
 * @company：CTTIC
 */
public class FunctionTest {



    public static void main(String[] args) {

        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("k1","fuck off");
        jedis.set("k2","i said");
        jedis.set("k3","go fuck yourself");

        Transaction transaction = jedis.multi();
        transaction.set("k4","v4");
        transaction.set("k4","v4");
        transaction.set("k4","v4");
        transaction.exec();

    }

}
