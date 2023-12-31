package tn.esprit.azure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Acte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActe;
    private String codeActe;
    @ManyToOne
    FamilleActe familleActe;
    @ManyToMany(mappedBy = "actes")
    List<Pathologie>pathologies=new ArrayList<>();
}
