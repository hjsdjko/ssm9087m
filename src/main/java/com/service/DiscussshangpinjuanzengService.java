package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshangpinjuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshangpinjuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshangpinjuanzengView;


/**
 * 商品捐赠评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 14:38:28
 */
public interface DiscussshangpinjuanzengService extends IService<DiscussshangpinjuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshangpinjuanzengVO> selectListVO(Wrapper<DiscussshangpinjuanzengEntity> wrapper);
   	
   	DiscussshangpinjuanzengVO selectVO(@Param("ew") Wrapper<DiscussshangpinjuanzengEntity> wrapper);
   	
   	List<DiscussshangpinjuanzengView> selectListView(Wrapper<DiscussshangpinjuanzengEntity> wrapper);
   	
   	DiscussshangpinjuanzengView selectView(@Param("ew") Wrapper<DiscussshangpinjuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangpinjuanzengEntity> wrapper);
   	
}

