package com.entity.view;

import com.entity.ShangpinjuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品捐赠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 14:38:28
 */
@TableName("shangpinjuanzeng")
public class ShangpinjuanzengView  extends ShangpinjuanzengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinjuanzengView(){
	}
 
 	public ShangpinjuanzengView(ShangpinjuanzengEntity shangpinjuanzengEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinjuanzengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
