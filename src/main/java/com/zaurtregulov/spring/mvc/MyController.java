package com.zaurtregulov.spring.mvc;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details";
    }


    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp, BindingResult bindingResult ) {
        validator.validate(emp, Employee.class);


//        var a = bindingResult.hasErrors();
        var a = bindingResult.getTarget();

        System.out.println(a);

        return "show-emp-details";
    }
}