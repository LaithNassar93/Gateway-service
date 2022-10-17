package miu.edu.gateway.client;

import miu.edu.gateway.models.JwtRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "account-service")
public interface AccountClient {
    @RequestMapping(method = RequestMethod.POST, value = "/account/authenticate")
    public boolean authenticate(@RequestBody JwtRequest jwtRequest);
}
