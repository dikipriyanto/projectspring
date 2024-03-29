package OOP2.B.dikipriyanto.ProjectSpring.controller;

import OOP2.B.dikipriyanto.ProjectSpring.repo.MahasiswaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AppController {
    @Autowired
    private MahasiswaRepo mhsRepo;
    @RequestMapping("/home")
    public void index(){}
    @RequestMapping("/daftar-mahasiswa")
    public void getDaftarMahasiswa(Model model)
    {
        model.addAttribute("daftarMahasiswa", mhsRepo.findAll());
    }
}
