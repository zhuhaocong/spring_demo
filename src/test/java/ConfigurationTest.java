import com.zhc.SpringConfiguration;
import com.zhc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class ConfigurationTest {
    @Test
    public void test1()throws Exception{
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
        DataSource dataSource =(DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
