package com.alpha.mall.manager.pojo;

public class TMallTradeMark {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_trade_mark.Id
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_trade_mark.ppmch
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    private String ppmch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_trade_mark.url
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_trade_mark.Id
     *
     * @return the value of t_mall_trade_mark.Id
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_trade_mark.Id
     *
     * @param id the value for t_mall_trade_mark.Id
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_trade_mark.ppmch
     *
     * @return the value of t_mall_trade_mark.ppmch
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public String getPpmch() {
        return ppmch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_trade_mark.ppmch
     *
     * @param ppmch the value for t_mall_trade_mark.ppmch
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public void setPpmch(String ppmch) {
        this.ppmch = ppmch == null ? null : ppmch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_trade_mark.url
     *
     * @return the value of t_mall_trade_mark.url
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_trade_mark.url
     *
     * @param url the value for t_mall_trade_mark.url
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}