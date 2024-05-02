package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinjuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinjuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinjuanzengView;


/**
 * 商品捐赠
 *
 * @author 
 * @email 
 * @date 2021-04-19 14:38:28
 */
public interface ShangpinjuanzengService extends IService<ShangpinjuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinjuanzengVO> selectListVO(Wrapper<ShangpinjuanzengEntity> wrapper);
   	
   	ShangpinjuanzengVO selectVO(@Param("ew") Wrapper<ShangpinjuanzengEntity> wrapper);
   	
   	List<ShangpinjuanzengView> selectListView(Wrapper<ShangpinjuanzengEntity> wrapper);
   	
   	ShangpinjuanzengView selectView(@Param("ew") Wrapper<ShangpinjuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinjuanzengEntity> wrapper);
   	
}

