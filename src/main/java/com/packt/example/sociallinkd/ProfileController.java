package com.packt.example.sociallinkd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProfileController {

    @Autowired
    private LinkedIn linkedIn;

    @Autowired
    private ConnectionRepository connectionRepository;

    @GetMapping
    public String profile(Model model) {
        if (connectionRepository.findPrimaryConnection(LinkedIn.class) == null) {
            return "redirect:/connect/linkedin/";
        }
        String firstName = linkedIn.profileOperations().getUserProfile().getFirstName();
        model.addAttribute("name", firstName);
        return "profile";
    }


}
