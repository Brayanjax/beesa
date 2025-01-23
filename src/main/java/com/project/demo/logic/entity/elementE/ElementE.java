package com.project.demo.logic.entity.elementE;

import jakarta.persistence.*;

@Entity
@Table(name = "elementE")
public class ElementE {

    private String name;
    @Column(name = "description", nullable = false)
    private String description;

    @Id
    @Column(name = "atomic_number", nullable = false)
    private Long atomicNumber;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "`group`", nullable = false)
    private Integer group;

    @Column(name = "period", nullable = false)
    private Integer period;

    @Column(name = "block", nullable = false)
    private String block;

    @Column(name = "series", nullable = false)
    private String series;

    @Column(name = "discover", nullable = false)
    private String discover;

    @Column(name = "discovered_by", nullable = false)
    private String discoveredBy;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "source", nullable = false)
    private String source;

    @Column(name = "proton", nullable = false)
    private String proton;

    @Column(name = "neutron", nullable = false)
    private String neutron;

    @Column(name = "electron", nullable = false)
    private String electron;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(Long atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscover() {
        return discover;
    }

    public void setDiscover(String discover) {
        this.discover = discover;
    }

    public String getDiscoveredBy() {
        return discoveredBy;
    }

    public void setDiscoveredBy(String discoveredBy) {
        this.discoveredBy = discoveredBy;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getProton() {
        return proton;
    }

    public void setProton(String proton) {
        this.proton = proton;
    }

    public String getNeutron() {
        return neutron;
    }

    public void setNeutron(String neutron) {
        this.neutron = neutron;
    }

    public String getElectron() {
        return electron;
    }

    public void setElectron(String electron) {
        this.electron = electron;
    }
}

