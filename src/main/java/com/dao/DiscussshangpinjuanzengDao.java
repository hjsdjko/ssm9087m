package com.dao;

import com.entity.DiscussshangpinjuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshangpinjuanzengVO;
import com.entity.view.DiscussshangpinjuanzengView;


/**
 * 商品捐赠评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 14:38:28
 */
public interface DiscussshangpinjuanzengDao extends BaseMapper<DiscussshangpinjuanzengEntity> {
	
	List<DiscussshangpinjuanzengVO> selectListVO(@Param("ew") Wrapper<DiscussshangpinjuanzengEntity> wrapper);
	
	DiscussshangpinjuanzengVO selectVO(@Param("ew") Wrapper<DiscussshangpinjuanzengEntity> wrapper);
	
	List<DiscussshangpinjuanzengView> selectListView(@Param("ew") Wrapper<DiscussshangpinjuanzengEntity> wrapper);

	List<DiscussshangpinjuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangpinjuanzengEntity> wrapper);
	
	DiscussshangpinjuanzengView selectView(@Param("ew") Wrapper<DiscussshangpinjuanzengEntity> wrapper);
	
}
