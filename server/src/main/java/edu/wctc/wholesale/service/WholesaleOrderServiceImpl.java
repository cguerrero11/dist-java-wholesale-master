package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repos.ProductRepository;
import edu.wctc.wholesale.repos.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class WholesaleOrderServiceImpl implements WholesaleOrderService {

    @Autowired
    private WholesaleOrderRepository wholesaleOrderRepository;

    @Override
    public WholesaleOrder getMember(int orderId) {
        List<WholesaleOrder> orderList = new ArrayList<>();
        wholesaleOrderRepository.findAll().forEach(orderList::add);
        return (WholesaleOrder) orderList;
    }

}