import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @className:Application.java
* @classDescription:
* @author:gengqiao
* @createTime:2016-10-19
*/
@RestController
@EnableAutoConfiguration
public class Application implements EmbeddedServletContainerCustomizer {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String hehe() {
        return "现在时间：" + (new Date()).toLocaleString();
    }
    @RequestMapping("/geng")
    String geng() {
        return "启动成功";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 设置内置tomcat端口号
     */
	@Override
	public void customize(ConfigurableEmbeddedServletContainer config) {
		// TODO Auto-generated method stub
		config.setPort(9999);
	}

}
