package ua.com.computerzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vastl271nko on 16.09.16.
 */
@Controller
@RequestMapping("/index")
public class ComputerZoneController {

    /*
     * This method will serve as default GET handler.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String newRegistration(ModelMap model) {

        return "index";
    }
}
