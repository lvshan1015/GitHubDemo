package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String index(){
//        ServiceInstance instance = client.getLocalInstance();
//        logger.info("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "hello,world！";
    }
}
