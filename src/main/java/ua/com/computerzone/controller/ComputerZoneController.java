package ua.com.computerzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.computerzone.model.entity.details.CentralProcessingUnit;
import ua.com.computerzone.model.entity.details.GraphicsProcessingUnit;
import ua.com.computerzone.service.CentralProcessingUnitService;
import ua.com.computerzone.service.GraphicsProcessingUnitService;

/**
 * Created by vastl271nko on 16.09.16.
 */
@Controller
@RequestMapping("/index")
public class ComputerZoneController {

    @Autowired
    GraphicsProcessingUnitService graphicsProcessingUnitService;

    @Autowired
    CentralProcessingUnitService centralProcessingUnitService;
    /*
     * This method will serve as default GET handler.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        GraphicsProcessingUnit gpu = graphicsProcessingUnitService.findById(1);
        CentralProcessingUnit cpu = centralProcessingUnitService.findById(1);
        model.addAttribute("gpu", gpu);
        model.addAttribute("cpu", cpu);
        return "index";
    }
}
