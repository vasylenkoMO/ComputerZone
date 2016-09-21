package ua.com.computerzone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ua.com.computerzone.configuraion.ComputerZoneConfig;
import ua.com.computerzone.dao.CategoryDao;
import ua.com.computerzone.model.entity.Category;
import ua.com.computerzone.model.entity.details.CentralProcessingUnit;
import ua.com.computerzone.model.entity.details.GraphicsProcessingUnit;
import ua.com.computerzone.service.CategoryService;
import ua.com.computerzone.service.CentralProcessingUnitService;
import ua.com.computerzone.service.GraphicsProcessingUnitService;
import ua.com.computerzone.service.impl.CategoryServiceImpl;

/**
 * Created by vastl271nko on 15.09.16.
 */
public class AppMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ComputerZoneConfig.class);


        CentralProcessingUnit centralProcessingUnit = new CentralProcessingUnit();

        GraphicsProcessingUnitService graphicsProcessingUnitService =
                (GraphicsProcessingUnitService) context.getBean("graphicsProcessingUnitService");

        GraphicsProcessingUnit gpu = graphicsProcessingUnitService.findById(1);

        System.out.println(gpu);


    }
}
