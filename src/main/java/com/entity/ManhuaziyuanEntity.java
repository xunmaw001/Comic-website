package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 漫画资源
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
@TableName("manhuaziyuan")
public class ManhuaziyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ManhuaziyuanEntity() {
		
	}
	
	public ManhuaziyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 投稿编号
	 */
					
	private String tougaobianhao;
	
	/**
	 * 漫画名称
	 */
					
	private String manhuamingcheng;
	
	/**
	 * 漫画分类
	 */
					
	private String manhuafenlei;
	
	/**
	 * 漫画标签
	 */
					
	private String manhuabiaoqian;
	
	/**
	 * 漫画图片
	 */
					
	private String manhuatupian;
	
	/**
	 * 漫画链接
	 */
					
	private String manhualianjie;
	
	/**
	 * 漫画文件
	 */
					
	private String manhuawenjian;
	
	/**
	 * 投稿日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tougaoriqi;
	
	/**
	 * 动漫简介
	 */
					
	private String dongmanjianjie;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：投稿编号
	 */
	public void setTougaobianhao(String tougaobianhao) {
		this.tougaobianhao = tougaobianhao;
	}
	/**
	 * 获取：投稿编号
	 */
	public String getTougaobianhao() {
		return tougaobianhao;
	}
	/**
	 * 设置：漫画名称
	 */
	public void setManhuamingcheng(String manhuamingcheng) {
		this.manhuamingcheng = manhuamingcheng;
	}
	/**
	 * 获取：漫画名称
	 */
	public String getManhuamingcheng() {
		return manhuamingcheng;
	}
	/**
	 * 设置：漫画分类
	 */
	public void setManhuafenlei(String manhuafenlei) {
		this.manhuafenlei = manhuafenlei;
	}
	/**
	 * 获取：漫画分类
	 */
	public String getManhuafenlei() {
		return manhuafenlei;
	}
	/**
	 * 设置：漫画标签
	 */
	public void setManhuabiaoqian(String manhuabiaoqian) {
		this.manhuabiaoqian = manhuabiaoqian;
	}
	/**
	 * 获取：漫画标签
	 */
	public String getManhuabiaoqian() {
		return manhuabiaoqian;
	}
	/**
	 * 设置：漫画图片
	 */
	public void setManhuatupian(String manhuatupian) {
		this.manhuatupian = manhuatupian;
	}
	/**
	 * 获取：漫画图片
	 */
	public String getManhuatupian() {
		return manhuatupian;
	}
	/**
	 * 设置：漫画链接
	 */
	public void setManhualianjie(String manhualianjie) {
		this.manhualianjie = manhualianjie;
	}
	/**
	 * 获取：漫画链接
	 */
	public String getManhualianjie() {
		return manhualianjie;
	}
	/**
	 * 设置：漫画文件
	 */
	public void setManhuawenjian(String manhuawenjian) {
		this.manhuawenjian = manhuawenjian;
	}
	/**
	 * 获取：漫画文件
	 */
	public String getManhuawenjian() {
		return manhuawenjian;
	}
	/**
	 * 设置：投稿日期
	 */
	public void setTougaoriqi(Date tougaoriqi) {
		this.tougaoriqi = tougaoriqi;
	}
	/**
	 * 获取：投稿日期
	 */
	public Date getTougaoriqi() {
		return tougaoriqi;
	}
	/**
	 * 设置：动漫简介
	 */
	public void setDongmanjianjie(String dongmanjianjie) {
		this.dongmanjianjie = dongmanjianjie;
	}
	/**
	 * 获取：动漫简介
	 */
	public String getDongmanjianjie() {
		return dongmanjianjie;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
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
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
