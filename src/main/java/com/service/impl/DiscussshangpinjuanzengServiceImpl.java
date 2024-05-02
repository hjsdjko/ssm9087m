package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshangpinjuanzengDao;
import com.entity.DiscussshangpinjuanzengEntity;
import com.service.DiscussshangpinjuanzengService;
import com.entity.vo.DiscussshangpinjuanzengVO;
import com.entity.view.DiscussshangpinjuanzengView;

@Service("discussshangpinjuanzengService")
public class DiscussshangpinjuanzengServiceImpl extends ServiceImpl<DiscussshangpinjuanzengDao, DiscussshangpinjuanzengEntity> implements DiscussshangpinjuanzengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshangpinjuanzengEntity> page = this.selectPage(
                new Query<DiscussshangpinjuanzengEntity>(params).getPage(),
                new EntityWrapper<DiscussshangpinjuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshangpinjuanzengEntity> wrapper) {
		  Page<DiscussshangpinjuanzengView> page =new Query<DiscussshangpinjuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshangpinjuanzengVO> selectListVO(Wrapper<DiscussshangpinjuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshangpinjuanzengVO selectVO(Wrapper<DiscussshangpinjuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshangpinjuanzengView> selectListView(Wrapper<DiscussshangpinjuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshangpinjuanzengView selectView(Wrapper<DiscussshangpinjuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
