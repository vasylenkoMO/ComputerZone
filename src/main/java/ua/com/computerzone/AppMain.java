package ua.com.computerzone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ua.com.computerzone.configuraion.ComputerZoneConfig;
import ua.com.computerzone.dao.CategoryDao;
import ua.com.computerzone.model.entity.Category;
import ua.com.computerzone.model.entity.details.CentralProcessingUnit;
import ua.com.computerzone.service.CategoryService;
import ua.com.computerzone.service.CentralProcessingUnitService;
import ua.com.computerzone.service.impl.CategoryServiceImpl;

/**
 * Created by vastl271nko on 15.09.16.
 */
public class AppMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ComputerZoneConfig.class);

        CategoryService categoryService = (CategoryService)context.getBean("categoryService");
        Category category = categoryService.findById(1);

        CentralProcessingUnitService centralProcessingUnitService =
                (CentralProcessingUnitService)context.getBean("centralProcessingUnitService");

        CentralProcessingUnit centralProcessingUnit = new CentralProcessingUnit();

        centralProcessingUnit.setUrl("blablabla");
        centralProcessingUnit.setModel("I5-4200M");
        centralProcessingUnit.setAmount(5);
        centralProcessingUnit.setFrequency(4);
        centralProcessingUnit.setManufacture("Intel");
        centralProcessingUnit.setPrice(50.25);
        centralProcessingUnit.setCoreAmount(2);
        centralProcessingUnit.setCategory(category);

        centralProcessingUnitService.save(centralProcessingUnit);

    }
}
