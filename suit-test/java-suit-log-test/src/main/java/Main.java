import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Copyright: Copyright (c) 2021</p>
 * <p>Description: Created by eface .FW on 2022/1/12</p>
 * <p></p>
 *
 * @author eface .FW
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        log.error("this is log test");
        log.warn("this is log test");
        log.info("this is log test");
        log.debug("this is log test");
    }
}
