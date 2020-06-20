package com.v.Domain;

import javax.persistence.*;

@Entity
@Table(name="KURS")
public class Kurs {
    @Id
    @SequenceGenerator(name = "kurs-numarator",  sequenceName = "KURS_SEQ", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kurs-numarator")
    @Column(name="ID")
    private Integer id;
    @Column(name="KURS_ADI")
    private String kursAdi;
    @Column(name="SAAT")
    private Integer saat;
    @Column(name="OGRETMEN_ID")
    private Integer ogretmenId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public Integer getSaat() {
        return saat;
    }

    public void setSaat(Integer saat) {
        this.saat = saat;
    }

    public Integer getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(Integer ogretmenId) {
        this.ogretmenId = ogretmenId;
    }
}
