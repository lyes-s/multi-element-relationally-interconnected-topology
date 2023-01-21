package com.cloud.nativ.networkui.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Lyes Sefiane
 * @mailto : lyes.sefiane@gmail.com
 * @created : 2023-01-19 5:12 p.m.
 */
public class NetworkElement {

    private String address;

    private String elementType;

    private int area;

    private Set<Neighbor> neighbors = new HashSet<>();

    public NetworkElement(){
        //
    }
    public NetworkElement(String address, String elementType, int area, Set<Neighbor> neighbors) {
        this.address = address;
        this.elementType = elementType;
        this.area = area;
        this.neighbors = neighbors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Set<Neighbor> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(Set<Neighbor> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return "NetworkElement{" +
                "address='" + address + '\'' +
                ", elementType='" + elementType + '\'' +
                ", area=" + area +
                ", neighbors=" + neighbors +
                '}';
    }
}