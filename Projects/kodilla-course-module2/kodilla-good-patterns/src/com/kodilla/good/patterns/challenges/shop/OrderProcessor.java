package com.kodilla.good.patterns.challenges.shop;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository){
        this.informationService=informationService;
        this.orderService=orderService;
        this.orderRepository=orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isBought=orderService.order(orderRequest.getUser(),orderRequest.getOrderTime(),orderRequest.getProduct());
        if (isBought){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getOrderTime(),orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}