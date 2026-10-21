package icc.bxl.pid.Reservation.repository;

import icc.bxl.pid.Reservation.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

    List<Artist> findByLastname(String lastname);

    Artist findById(long id);

}
