package OOP2.B.dikipriyanto.ProjectSpring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mahasiswa {
    @Id
    @Getter @Setter
    private String nim;
    @Getter @Setter
    private String nama;
    @Getter @Setter
    private String prodi;
}
