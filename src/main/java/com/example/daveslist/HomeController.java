package com.example.daveslist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    RoomRepository roomRepository;

    @RequestMapping("/")
    public String index(){
        return "list";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/list")
    public String listRooms(Model model) {
        model.addAttribute("rooms", roomRepository.findAll());
        return "list";
    }

    @GetMapping("/room")
    public String addRoom(Model model){

        model.addAttribute("room", new AptRoom ());

        return "form";

    }

    @PostMapping("/process")
    public String processForm(@Valid AptRoom aptRoom, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }

        roomRepository.save(aptRoom);
        return "redirect:/room";
    }

    @RequestMapping("/detail/{id}")
    public String showPet(@PathVariable("id") long id, Model model) {
        model.addAttribute("room", roomRepository.findOne(id));
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updatePet(@PathVariable("id") long id, Model model) {
        model.addAttribute("room", roomRepository.findOne(id));
        return "form";
    }
}
