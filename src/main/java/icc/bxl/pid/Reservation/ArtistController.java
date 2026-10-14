
package icc.bxl.pid.Reservation;

import java.util.List;

import icc.bxl.pid.Reservation.Artist;
import icc.bxl.pid.Reservation.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import icc.bxl.pid.Reservation.Artist;
import icc.bxl.pid.Reservation.ArtistService;

@Controller
public class ArtistController {
    @Autowired
    ArtistService service;

    @GetMapping("/artists")
    public String index(Model model) {
        List<Artist> artists = service.getAllArtists();

        model.addAttribute("artists", artists);
        model.addAttribute("title", "Liste des artistes");

        return "artist/index";
    }
    @GetMapping("/artists/{id}")
    public String show(Model model, @PathVariable("id") long id) {
        Artist artist = service.getArtist(id);

        model.addAttribute("artist", artist);
        model.addAttribute("title", "Fiche d'un artiste");

        return "artist/show";

}
}
