package com.example.lab56.Controller;

import com.example.lab56.Service.OperatorsService;
import com.example.lab56.model.Operators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/operators")
public class OperatorsController {

    private final OperatorsService service;

    public OperatorsController(OperatorsService service) {
        this.service = service;
    }

    @GetMapping
    public String listOperators(Model model) {
        model.addAttribute("operators", service.getAllOperators());
        return "operators";
    }

    @GetMapping("/add")
    public String addOperatorForm(Model model) {
        model.addAttribute("operator", new Operators());
        return "add-operator";
    }

    @PostMapping("/add")
    public String addOperator(@ModelAttribute Operators operator) {
        service.addOperator(operator);
        return "redirect:/operators";
    }

    @PostMapping("/delete/{id}")
    public String deleteOperator(@PathVariable Long id) {
        service.deleteOperator(id);
        return "redirect:/operators";
    }
}