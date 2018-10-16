package com.example.helloHTML;

import com.example.helloHTML.model.Lotto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/lotto")

    public String generateLotto(ModelMap modelMap){
        Lotto lotto = new Lotto();
        modelMap.put("lotto", lotto.generateLotto());
        return "lotto";
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
