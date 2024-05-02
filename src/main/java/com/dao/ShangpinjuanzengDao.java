package com.dao;

import com.entity.ShangpinjuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinjuanzengVO;
import com.entity.view.ShangpinjuanzengView;


/**
 * 商品捐赠
 * 
 * @author 
 * @email 
 * @date 2021-04-19 14:38:28
 */
public interface ShangpinjuanzengDao extends BaseMapper<ShangpinjuanzengEntity> {
	
	List<ShangpinjuanzengVO> selectListVO(@Param("ew") Wrapper<ShangpinjuanzengEntity> wrapper);
	
	ShangpinjuanzengVO selectVO(@Param("ew") Wrapper<ShangpinjuanzengEntity> wrapper);
	
	List<ShangpinjuanzengView> selectListView(@Param("ew") Wrapper<ShangpinjuanzengEntity> wrapper);

	List<ShangpinjuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinjuanzengEntity> wrapper);
	
	ShangpinjuanzengView selectView(@Param("ew") Wrapper<ShangpinjuanzengEntity> wrapper);
	
}
