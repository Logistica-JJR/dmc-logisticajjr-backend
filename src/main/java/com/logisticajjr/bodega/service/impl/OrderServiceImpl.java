package com.logisticajjr.bodega.service.impl;

import com.logisticajjr.bodega.model.Order;
import com.logisticajjr.bodega.repo.IGenericRepo;
import com.logisticajjr.bodega.repo.IOrderRepo;
import com.logisticajjr.bodega.service.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl extends CRUDImpl<Order, Integer> implements IOrderService {

    private final IOrderRepo repo;

    @Override
    protected IGenericRepo<Order, Integer> getRepo() {
        return repo;
    }
}
