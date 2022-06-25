package com.kenit.customermanagement.controller;

import com.kenit.customermanagement.model.Customer;
import com.kenit.customermanagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping()
    public String homeCustomer(Model model) {
        List<Customer> customerList = customerService.findALl();
        model.addAttribute("customerList", customerList);
        return "list";
    }

    @GetMapping("/{id}")
    public String customerInformation(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "info";
    }

    @GetMapping("/{id}/delete")
    public String deleteCustomer(@PathVariable int id) {
        customerService.remove(id);
        return "redirect:/customer";
    }

    @GetMapping("/{id}/edit")
    public String viewEditCustomer(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editCustomer(Customer customer) {
        customerService.update(customer.getId(), customer);
        return "redirect:/customer";
    }
}
