package dev.study.devspringprj;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(@RequestParam(name = "name" , required = false, defaultValue = "World"  )String name
                      , @RequestParam(name = "value", required = false, defaultValue = "Spring" )String value
                      , Model model){
        model.addAttribute("name" , name );
        model.addAttribute("value", value);
    
        System.out.println("111");
        return "index";
    }
}