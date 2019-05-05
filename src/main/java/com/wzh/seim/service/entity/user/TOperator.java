package com.wzh.seim.service.entity.user;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class TOperator implements Serializable {
    private Long foperatorid;

    private String fuserid;

    private String fpassword;

    private String foperatorname;

    private BigDecimal fstatus;

    private Integer forgid;

    private String fpym;

    private BigDecimal froleid;

    private BigDecimal fsites;

    private String frcode;

    private String ftype;

    private String maccode;

    private String ipaddress;

    private Date createdate;

    private String usertel;

    private String useremail;

    private String userzip;

    private String remark;

    private Date enddate;

    private Date lastlogin;

    private String theme;

    private String home;

    private String adminorgids;

    private String rolenames;

    private String statusdesc;

    private String address;

    private String usermobile;

    private String sex;

    public Long getFoperatorid() {
        return foperatorid;
    }

    public void setFoperatorid(Long foperatorid) {
        this.foperatorid = foperatorid;
    }

    public String getFuserid() {
        return fuserid;
    }

    public void setFuserid(String fuserid) {
        this.fuserid = fuserid == null ? null : fuserid.trim();
    }

    public String getFpassword() {
        return fpassword;
    }

    public void setFpassword(String fpassword) {
        this.fpassword = fpassword == null ? null : fpassword.trim();
    }

    public String getFoperatorname() {
        return foperatorname;
    }

    public void setFoperatorname(String foperatorname) {
        this.foperatorname = foperatorname == null ? null : foperatorname.trim();
    }

    public BigDecimal getFstatus() {
        return fstatus;
    }

    public void setFstatus(BigDecimal fstatus) {
        this.fstatus = fstatus;
    }

    public Integer getForgid() {
        return forgid;
    }

    public void setForgid(Integer forgid) {
        this.forgid = forgid;
    }

    public String getFpym() {
        return fpym;
    }

    public void setFpym(String fpym) {
        this.fpym = fpym == null ? null : fpym.trim();
    }

    public BigDecimal getFroleid() {
        return froleid;
    }

    public void setFroleid(BigDecimal froleid) {
        this.froleid = froleid;
    }

    public BigDecimal getFsites() {
        return fsites;
    }

    public void setFsites(BigDecimal fsites) {
        this.fsites = fsites;
    }

    public String getFrcode() {
        return frcode;
    }

    public void setFrcode(String frcode) {
        this.frcode = frcode == null ? null : frcode.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getMaccode() {
        return maccode;
    }

    public void setMaccode(String maccode) {
        this.maccode = maccode == null ? null : maccode.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserzip() {
        return userzip;
    }

    public void setUserzip(String userzip) {
        this.userzip = userzip == null ? null : userzip.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getAdminorgids() {
        return adminorgids;
    }

    public void setAdminorgids(String adminorgids) {
        this.adminorgids = adminorgids == null ? null : adminorgids.trim();
    }

    public String getRolenames() {
        return rolenames;
    }

    public void setRolenames(String rolenames) {
        this.rolenames = rolenames == null ? null : rolenames.trim();
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc == null ? null : statusdesc.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile == null ? null : usermobile.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String toString(){
        return this.getFuserid()+this.getFoperatorname();
    }
}