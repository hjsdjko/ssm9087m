package com.entity.vo;

import com.entity.ErshoushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 二手商品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 14:38:28
 */
public class ErshoushangpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 成色
	 */
	
	private String chengse;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 原价
	 */
	
	private Integer yuanjia;
		
	/**
	 * 二手价
	 */
	
	private Integer ershoujia;
		
	/**
	 * 商品详情
	 */
	
	private String shangpinxiangqing;
		
	/**
	 * 卖家账号
	 */
	
	private String maijiazhanghao;
		
	/**
	 * 卖家姓名
	 */
	
	private String maijiaxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：成色
	 */
	 
	public void setChengse(String chengse) {
		this.chengse = chengse;
	}
	
	/**
	 * 获取：成色
	 */
	public String getChengse() {
		return chengse;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：原价
	 */
	 
	public void setYuanjia(Integer yuanjia) {
		this.yuanjia = yuanjia;
	}
	
	/**
	 * 获取：原价
	 */
	public Integer getYuanjia() {
		return yuanjia;
	}
				
	
	/**
	 * 设置：二手价
	 */
	 
	public void setErshoujia(Integer ershoujia) {
		this.ershoujia = ershoujia;
	}
	
	/**
	 * 获取：二手价
	 */
	public Integer getErshoujia() {
		return ershoujia;
	}
				
	
	/**
	 * 设置：商品详情
	 */
	 
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
				
	
	/**
	 * 设置：卖家账号
	 */
	 
	public void setMaijiazhanghao(String maijiazhanghao) {
		this.maijiazhanghao = maijiazhanghao;
	}
	
	/**
	 * 获取：卖家账号
	 */
	public String getMaijiazhanghao() {
		return maijiazhanghao;
	}
				
	
	/**
	 * 设置：卖家姓名
	 */
	 
	public void setMaijiaxingming(String maijiaxingming) {
		this.maijiaxingming = maijiaxingming;
	}
	
	/**
	 * 获取：卖家姓名
	 */
	public String getMaijiaxingming() {
		return maijiaxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
