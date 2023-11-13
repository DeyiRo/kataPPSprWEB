package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarServiceImpl carService;


    @GetMapping(value ="/cars")
    public String getMyCarList(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("carList", carService.getCarList(count) );
        return "cars";
    }

}
