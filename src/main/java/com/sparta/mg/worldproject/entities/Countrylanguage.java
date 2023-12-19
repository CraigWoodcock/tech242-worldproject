package com.sparta.mg.worldproject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "countrylanguage")
public class Countrylanguage {
    @EmbeddedId
    private CountrylanguageId id;

    @MapsId("countryCode")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @NotNull
    @Lob
    @Column(name = "IsOfficial", nullable = false)
    private String isOfficial;

    @NotNull
    @Column(name = "Percentage", nullable = false, precision = 4, scale = 1)
    private BigDecimal percentage;

    public CountrylanguageId getId() {
        return id;
    }

    public void setId(CountrylanguageId id) {
        this.id = id;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Countrylanguage{" +
                "id=" + id +
                ", countryCode=" + countryCode +
                ", isOfficial='" + isOfficial + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}