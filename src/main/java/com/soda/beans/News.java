package com.soda.beans;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="新闻对象news")
public class News {
	@ApiModelProperty(value="用户名",name="id")
    private Integer id;
	 @ApiModelProperty(value="标题",name="title",required=true)
    private String title;

    private String author;

    private String coverurl;

    private String liveid;

    private String ispublish;

    private Date publishdate;

    private Date savetime;

    private Integer praisenum;

    private Integer stepnum;

    private Integer sharenum;

    private String istop;

    private Date remarktime1;

    private Integer remark1;

    private String remark2;

    private Date remarktime2;

    private Integer linkid;

    private Integer readnum;

    private Integer fakereadnum;

    private String weiboid;

    private Integer source;

    private Integer wbcommentnum;

    private String timetask;

    private String organ;

    private String titleurl;

    private String newstype;

    private String hshareurl;

    private String hurl;

    private String livehead;

    private Date udpatetime;

    private Date updatetime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCoverurl() {
        return coverurl;
    }

    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl == null ? null : coverurl.trim();
    }

    public String getLiveid() {
        return liveid;
    }

    public void setLiveid(String liveid) {
        this.liveid = liveid == null ? null : liveid.trim();
    }

    public String getIspublish() {
        return ispublish;
    }

    public void setIspublish(String ispublish) {
        this.ispublish = ispublish == null ? null : ispublish.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

    public Integer getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(Integer praisenum) {
        this.praisenum = praisenum;
    }

    public Integer getStepnum() {
        return stepnum;
    }

    public void setStepnum(Integer stepnum) {
        this.stepnum = stepnum;
    }

    public Integer getSharenum() {
        return sharenum;
    }

    public void setSharenum(Integer sharenum) {
        this.sharenum = sharenum;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop == null ? null : istop.trim();
    }

    public Date getRemarktime1() {
        return remarktime1;
    }

    public void setRemarktime1(Date remarktime1) {
        this.remarktime1 = remarktime1;
    }

    public Integer getRemark1() {
        return remark1;
    }

    public void setRemark1(Integer remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public Date getRemarktime2() {
        return remarktime2;
    }

    public void setRemarktime2(Date remarktime2) {
        this.remarktime2 = remarktime2;
    }

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getFakereadnum() {
        return fakereadnum;
    }

    public void setFakereadnum(Integer fakereadnum) {
        this.fakereadnum = fakereadnum;
    }

    public String getWeiboid() {
        return weiboid;
    }

    public void setWeiboid(String weiboid) {
        this.weiboid = weiboid == null ? null : weiboid.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getWbcommentnum() {
        return wbcommentnum;
    }

    public void setWbcommentnum(Integer wbcommentnum) {
        this.wbcommentnum = wbcommentnum;
    }

    public String getTimetask() {
        return timetask;
    }

    public void setTimetask(String timetask) {
        this.timetask = timetask == null ? null : timetask.trim();
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ == null ? null : organ.trim();
    }

    public String getTitleurl() {
        return titleurl;
    }

    public void setTitleurl(String titleurl) {
        this.titleurl = titleurl == null ? null : titleurl.trim();
    }

    public String getNewstype() {
        return newstype;
    }

    public void setNewstype(String newstype) {
        this.newstype = newstype == null ? null : newstype.trim();
    }

    public String getHshareurl() {
        return hshareurl;
    }

    public void setHshareurl(String hshareurl) {
        this.hshareurl = hshareurl == null ? null : hshareurl.trim();
    }

    public String getHurl() {
        return hurl;
    }

    public void setHurl(String hurl) {
        this.hurl = hurl == null ? null : hurl.trim();
    }

    public String getLivehead() {
        return livehead;
    }

    public void setLivehead(String livehead) {
        this.livehead = livehead == null ? null : livehead.trim();
    }

    public Date getUdpatetime() {
        return udpatetime;
    }

    public void setUdpatetime(Date udpatetime) {
        this.udpatetime = udpatetime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}