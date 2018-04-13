package springboot2.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author kingwudy
 * @date 2018/4/12
 */
@Configuration
@PropertySource(value = "classpath:config.properties")
public class Config {
}
