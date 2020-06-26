package cotn.okta;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author kaustavbasu
 * @Date 6/19/20
 * @Time 3:22 AM
 */
@RestController
public class UserCheckController {

    @GetMapping("/status")
    public String statusCheck()
    {
        return "Status is OK";
    }
}
