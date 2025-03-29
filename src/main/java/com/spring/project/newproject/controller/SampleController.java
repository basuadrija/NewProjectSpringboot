import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    @GetMapping("/")
    public String sendResponse() {
        return "Hello World";
    }
}
