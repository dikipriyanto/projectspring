package OOP2.B.dikipriyanto.ProjectSpring.repo;

import OOP2.B.dikipriyanto.ProjectSpring.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepo extends JpaRepository<Mahasiswa, String> {
}
