package com.custumer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.custumer.dao.CustumerTableDao;
import com.custumer.entity.CustumerTable;
import com.custumer.service.CustumerTableService;
import org.springframework.stereotype.Service;

/**
 * (CustumerTable)表服务实现类
 *
 * @author makejava
 * @since 2019-12-21 13:18:51
 */
@Service("custumerTableService")
public class CustumerTableServiceImpl extends ServiceImpl<CustumerTableDao, CustumerTable> implements CustumerTableService {

}