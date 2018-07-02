package com.sample.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emailprofileconfig")
public class EmailprofileConfig {
	
	@Id
    private int id;

    @Column(name = "profileid")
    private String profileid;
    @Column(name = "carriercode")
    private String carriercode;
    @Column(name = "smtphost")
    private String smtphost;
    @Column(name = "smtpport")
    private int smtpport;
    @Column(name = "authuser")
    private String authuser;
    @Column(name = "authpassword")
    private String authpassword;
    @Column(name = "mode")
    private String mode;
    @Column(name = "bound")
    private String bound;
    @Column(name = "defaultsenderid")
    private String defaultsenderid;
    @Column(name = "authrequired")
    private String authrequired;
    @Column(name = "store_type")
    private String store_type;
    @Column(name = "schedule")
    private int schedule;
    @Column(name = "unit")
    private String unit;
    @Column(name = "isenabled")
    private String isenabled;
    @Column(name = "reschedulestatus")
    private String reschedulestatus;
    @Column(name = "vhbschedule")
    private int vhbschedule;
    @Column(name = "vhbscheduleunit")
    private String vhbscheduleunit;

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }

    public String getCarriercode() {
        return carriercode;
    }

    public void setCarriercode(String carriercode) {
        this.carriercode = carriercode;
    }

    public String getSmtphost() {
        return smtphost;
    }

    public void setSmtphost(String smtphost) {
        this.smtphost = smtphost;
    }

    public int getSmtpport() {
        return smtpport;
    }

    public void setSmtpport(int smtpport) {
        this.smtpport = smtpport;
    }

    public String getAuthuser() {
        return authuser;
    }

    public void setAuthuser(String authuser) {
        this.authuser = authuser;
    }

    public String getAuthpassword() {
        return authpassword;
    }

    public void setAuthpassword(String authpassword) {
        this.authpassword = authpassword;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getBound() {
        return bound;
    }

    public void setBound(String bound) {
        this.bound = bound;
    }

    public String getDefaultsenderid() {
        return defaultsenderid;
    }

    public void setDefaultsenderid(String defaultsenderid) {
        this.defaultsenderid = defaultsenderid;
    }

    public String getAuthrequired() {
        return authrequired;
    }

    public void setAuthrequired(String authrequired) {
        this.authrequired = authrequired;
    }

    public String getStore_type() {
        return store_type;
    }

    public void setStore_type(String store_type) {
        this.store_type = store_type;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled;
    }

    
    public String getReschedulestatus() {
		return reschedulestatus;
	}

	public void setReschedulestatus(String reschedulestatus) {
		this.reschedulestatus = reschedulestatus;
	}

	public int getVhbschedule() {
        return vhbschedule;
    }

    public void setVhbschedule(int vhbschedule) {
        this.vhbschedule = vhbschedule;
    }

    public String getVhbscheduleunit() {
        return vhbscheduleunit;
    }

    public void setVhbscheduleunit(String vhbscheduleunit) {
        this.vhbscheduleunit = vhbscheduleunit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
