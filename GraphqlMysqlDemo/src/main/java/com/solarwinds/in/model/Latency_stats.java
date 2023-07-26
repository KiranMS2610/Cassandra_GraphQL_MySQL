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

    private int read_latency_count;

    private float read_latency_one_minute_rate;

    private float read_latency_five_minute_rate;

    private float read_latency_fifteen_minute_rate;

    private int read_total_latency;

    private int write_latency_count;

    private float write_latency_one_minute_rate;

    private float write_latency_five_minute_rate;

    private float write_latency_fifteen_minute_rate;

    private int write_total_latency;

    private int total_disk_space_used;

    private String live_nodes;

    private String unresponsive_nodes;

    // Constructors

    public Latency_stats(int id, int read_latency_count, float read_latency_one_minute_rate,
                         float read_latency_five_minute_rate, float read_latency_fifteen_minute_rate,
                         int read_total_latency, int write_latency_count, float write_latency_one_minute_rate,
                         float write_latency_five_minute_rate, float write_latency_fifteen_minute_rate,
                         int write_total_latency, int total_disk_space_used, String live_nodes,
                         String unresponsive_nodes) {
        this.id = id;
        this.read_latency_count = read_latency_count;
        this.read_latency_one_minute_rate = read_latency_one_minute_rate;
        this.read_latency_five_minute_rate = read_latency_five_minute_rate;
        this.read_latency_fifteen_minute_rate = read_latency_fifteen_minute_rate;
        this.read_total_latency = read_total_latency;
        this.write_latency_count = write_latency_count;
        this.write_latency_one_minute_rate = write_latency_one_minute_rate;
        this.write_latency_five_minute_rate = write_latency_five_minute_rate;
        this.write_latency_fifteen_minute_rate = write_latency_fifteen_minute_rate;
        this.write_total_latency = write_total_latency;
        this.total_disk_space_used = total_disk_space_used;
        this.live_nodes = live_nodes;
        this.unresponsive_nodes = unresponsive_nodes;
    }

    public Latency_stats() {
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRead_latency_count() {
        return read_latency_count;
    }

    public void setRead_latency_count(int read_latency_count) {
        this.read_latency_count = read_latency_count;
    }

    public float getRead_latency_one_minute_rate() {
        return read_latency_one_minute_rate;
    }

    public void setRead_latency_one_minute_rate(float read_latency_one_minute_rate) {
        this.read_latency_one_minute_rate = read_latency_one_minute_rate;
    }

    public float getRead_latency_five_minute_rate() {
        return read_latency_five_minute_rate;
    }

    public void setRead_latency_five_minute_rate(float read_latency_five_minute_rate) {
        this.read_latency_five_minute_rate = read_latency_five_minute_rate;
    }

    public float getRead_latency_fifteen_minute_rate() {
        return read_latency_fifteen_minute_rate;
    }

    public void setRead_latency_fifteen_minute_rate(float read_latency_fifteen_minute_rate) {
        this.read_latency_fifteen_minute_rate = read_latency_fifteen_minute_rate;
    }

    public int getRead_total_latency() {
        return read_total_latency;
    }

    public void setRead_total_latency(int read_total_latency) {
        this.read_total_latency = read_total_latency;
    }

    public int getWrite_latency_count() {
        return write_latency_count;
    }

    public void setWrite_latency_count(int write_latency_count) {
        this.write_latency_count = write_latency_count;
    }

    public float getWrite_latency_one_minute_rate() {
        return write_latency_one_minute_rate;
    }

    public void setWrite_latency_one_minute_rate(float write_latency_one_minute_rate) {
        this.write_latency_one_minute_rate = write_latency_one_minute_rate;
    }

    public float getWrite_latency_five_minute_rate() {
        return write_latency_five_minute_rate;
    }

    public void setWrite_latency_five_minute_rate(float write_latency_five_minute_rate) {
        this.write_latency_five_minute_rate = write_latency_five_minute_rate;
    }

    public float getWrite_latency_fifteen_minute_rate() {
        return write_latency_fifteen_minute_rate;
    }

    public void setWrite_latency_fifteen_minute_rate(float write_latency_fifteen_minute_rate) {
        this.write_latency_fifteen_minute_rate = write_latency_fifteen_minute_rate;
    }

    public int getWrite_total_latency() {
        return write_total_latency;
    }

    public void setWrite_total_latency(int write_total_latency) {
        this.write_total_latency = write_total_latency;
    }

    public int getTotal_disk_space_used() {
        return total_disk_space_used;
    }

    public void setTotal_disk_space_used(int total_disk_space_used) {
        this.total_disk_space_used = total_disk_space_used;
    }

    public String getLive_nodes() {
        return live_nodes;
    }

    public void setLive_nodes(String live_nodes) {
        this.live_nodes = live_nodes;
    }

    public String getUnresponsive_nodes() {
        return unresponsive_nodes;
    }

    public void setUnresponsive_nodes(String unresponsive_nodes) {
        this.unresponsive_nodes = unresponsive_nodes;
    }

    // toString() method (optional)
    @Override
    public String toString() {
        return "Latency_stats [id=" + id + ", read_latency_count=" + read_latency_count
                + ", read_latency_one_minute_rate=" + read_latency_one_minute_rate
                + ", read_latency_five_minute_rate=" + read_latency_five_minute_rate
                + ", read_latency_fifteen_minute_rate=" + read_latency_fifteen_minute_rate
                + ", read_total_latency=" + read_total_latency + ", write_latency_count=" + write_latency_count
                + ", write_latency_one_minute_rate=" + write_latency_one_minute_rate
                + ", write_latency_five_minute_rate=" + write_latency_five_minute_rate
                + ", write_latency_fifteen_minute_rate=" + write_latency_fifteen_minute_rate
                + ", write_total_latency=" + write_total_latency + ", total_disk_space_used=" + total_disk_space_used
                + ", live_nodes=" + live_nodes + ", unresponsive_nodes=" + unresponsive_nodes + "]";
    }
}
