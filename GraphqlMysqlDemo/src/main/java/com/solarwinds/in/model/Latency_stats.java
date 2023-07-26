package com.solarwinds.in.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "latency_stats")
public class Latency_stats implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int read_total_latency;

    private int write_total_latency;

    public Latency_stats(int id, int read_total_latency, int write_total_latency) {
        this.id = id;
        this.read_total_latency = read_total_latency;
        this.write_total_latency = write_total_latency;
    }

    public Latency_stats() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRead_total_latency() {
        return read_total_latency;
    }

    public void setRead_total_latency(int read_total_latency) {
        this.read_total_latency = read_total_latency;
    }

    public int getWrite_total_latency() {
        return write_total_latency;
    }

    public void setWrite_total_latency(int write_total_latency) {
        this.write_total_latency = write_total_latency;
    }

    @Override
    public String toString() {
        return "Latency_stats [id=" + id + ", read_total_latency=" + read_total_latency + ", write_total_latency="
                + write_total_latency + "]";
    }
}
