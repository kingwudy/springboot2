package springboot2.demo.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot2.demo.service.DemoService;

/**
 * @author kingwudy
 * @date 2018/4/10
 */
@RestController
@RequestMapping
public class DemoController {
    private final static Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    String home() {
        LOGGER.info("hello, {}", "home");
        return "Hello World!";
    }

    @RequestMapping("/demo/echo")
    public Object echo(@RequestParam Object p0, @RequestParam("p1") Object p1) {
        String p0Str = JSON.toJSONString(p0);
        String p1Str = JSON.toJSONString(p1);
        LOGGER.info("{},{}", p0Str, p1Str);
        return demoService.echo(p0, p1);
    }
}
