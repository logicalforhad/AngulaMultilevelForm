package demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by S.M.Farhad on 27/07/2015.
 */
@Controller
public class GreetingController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homeForm(Model model) {
        model.addAttribute("greeting", "hello world");
        return "index";
    }
}