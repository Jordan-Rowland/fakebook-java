package jordanrowland.fakebook.controller;

import jordanrowland.fakebook.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    int healthCheck() { return 200; }
}
